package ud4.cadenasejercicios;

import java.util.Arrays;

/*
* Crea una función que convierta una cadena de caracteres que representa una dirección IP en su formato binario.
* */
public class EjCadenas30 {
    static String ipBinario(String ip) {
        if (ip == null || ip.isEmpty()) {
            return null;
        }

        String[] octetos = ip.split("\\.");
        if (octetos.length != 4) {
            return null;
        }

        String resultado = "";
        for (String octeto : octetos) {
            try {
                int valor = Integer.parseInt(octeto);
                if (valor < 0 || valor > 255) {
                    return null;
                }
                String octetoBinario = Integer.toBinaryString(valor);
                // Rellenar con ceros a la izquierda si es necesario
                while (octetoBinario.length() < 8) {
                    octetoBinario = "0" + octetoBinario;
                }
                resultado += octetoBinario + ".";
            } catch (NumberFormatException e) {
                return null;
            }
        }

        // Eliminar el último punto
        return resultado.substring(0, resultado.length() - 1);
    }

    public static void main(String[] args) {
        String ipBinario = ipBinario("255.255.255.255");
        System.out.println(ipBinario);
    }
}
