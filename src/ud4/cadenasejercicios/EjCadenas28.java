package ud4.cadenasejercicios;
/*
* Crea una función que extraiga el dominio de una dirección URL dada.
* */
public class EjCadenas28 {
    static String extraerDominio(String url) {
        if (url == null || url.isEmpty()) {
            return null;
        }

        // Eliminar el protocolo si existe
        String dominio = url.replaceFirst("^(https?://)?", "");

        // Eliminar www. si existe
        dominio = dominio.replaceFirst("^www\\.", "");

        // Extraer el dominio (hasta el primer '/' o el final de la cadena)
        int indiceBarra = dominio.indexOf('/');
        if (indiceBarra != -1) {
            dominio = dominio.substring(0, indiceBarra);
        }

        // Extraer el dominio principal (último y penúltimo segmento)
        String[] partes = dominio.split("\\.");
        int longitud = partes.length;
        if (longitud > 2) {
            return partes[longitud - 2] + "." + partes[longitud - 1];
        } else if (longitud == 2) {
            return dominio;
        } else {
            return null; // URL no válida
        }
    }
}
