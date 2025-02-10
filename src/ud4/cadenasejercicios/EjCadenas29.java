package ud4.cadenasejercicios;
/*
* Crea una función que determine si una cadena de caracteres es una dirección IP válida
* */
public class EjCadenas29 {
    static boolean esIpValida(String ip) {
        if (ip == null || ip.isEmpty()) {
            return false;
        }

        String[] octetos = ip.split("\\.");
        if (octetos.length != 4) {
            return false;
        }

        for (String octeto : octetos) {
            try {
                int valor = Integer.parseInt(octeto);
                if (valor < 0 || valor > 255) {
                    return false;
                }
            } catch (NumberFormatException e) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String ip = "255.255.255.255";
        System.out.println(esIpValida(ip));
    }
}
