package ud6.practicaex;

import java.util.List;

public class StreamObjetos {
    public static void main(String[] args) {
        List<Persona> personas = List.of(new Persona("Ana", 20), new Persona("Luis", 30));

        System.out.println(personas.stream().filter(persona -> persona.getEdad() > 25).toList());

        double promedio = personas.stream()
                .mapToInt(Persona::getEdad)
                .average()
                .orElse(0);
        System.out.println("Promedio de edades: " + promedio);
    }
}
