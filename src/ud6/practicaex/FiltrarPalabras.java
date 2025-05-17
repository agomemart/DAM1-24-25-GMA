package ud6.practicaex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltrarPalabras {
    public static List<String> filtrarPalabrasLargas(List<String> frases) {
        return frases.stream().flatMap(frase -> Arrays.stream(frase.split("\\s+"))).map(String::toLowerCase).filter(palabra -> palabra.length() > 5).distinct().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> frases = new ArrayList<>(List.of("Hola que tal estás", "Mundo nuevo", "Java java java", "Stream stream stream", "Lambda"));
        System.out.println(filtrarPalabrasLargas(frases));
    }
}
