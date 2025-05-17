package ud6.practicaex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnalizadorTexto {
    public Map<String, Long> contarPalabrasFrecuentes(String texto) {
        Map<String, Long> contador = new HashMap<>();

        String[] palabras = texto.split("\\s+");

        for (String palabra : palabras) {
            if (!palabra.isBlank()) {
                palabra = palabra.toLowerCase();

                if (contador.containsKey(palabra)) {
                    contador.put(palabra, contador.get(palabra) + 1);
                } else {
                    contador.put(palabra, 1L);
                }
            }
        }
        return contador;
    }

    public List<String> palabrasMasFrecuentes(Map<String, Long> mapa, long minimo) {
        List<String> palabras = new ArrayList<>();
        for (Map.Entry<String, Long> entrada : mapa.entrySet()) {
            if (entrada.getValue() >= minimo) {
                palabras.add(entrada.getKey());
            }
        }
        return palabras;
    }
}
