package ud6.practicaex.concursoinventores;

import ud6.practicaex.UtilColecciones;

import java.util.*;

public class AppConcurso {
    public static void main(String[] args) {
        List<String> materialesPosibles = Arrays.asList(
                "tornillo", "cable", "motor", "batería", "sensor", "plástico", "madera", "led", "tela", "imán"
        );

        Invento inv1 = new Invento("Robot Limpiador", Set.of("motor", "sensor", "batería", "plástico"), 4);
        Invento inv2 = new Invento("Coche Solar", Set.of("motor", "batería", "panel solar", "cable"), 5);
        Invento inv3 = new Invento("Lámpara LED", Set.of("led", "cable", "batería", "plástico"), 2);
        Invento inv4 = new Invento("Detector de Metales", Set.of("imán", "cable", "sensor", "batería"), 3);
        Invento inv5 = new Invento("Ventilador Automático", Set.of("motor", "cable", "plástico"), 3);

        Inventor invA = new Inventor(
                "Ana Torres", "La Ingeniera",
                Set.of(inv1, inv3, inv5),
                new HashMap<>(Map.of("motor", 2, "sensor", 1, "batería", 2, "plástico", 2, "led", 1, "cable", 2))
        );

        Inventor invB = new Inventor(
                "Luis Pérez", "El Creativo",
                Set.of(inv2, inv4, inv5),
                new HashMap<>(Map.of("motor", 1, "batería", 1, "panel solar", 1, "cable", 2, "imán", 1, "sensor", 2))
        );

        Inventor invC = new Inventor(
                "Marta Ríos", "Manitas",
                Set.of(inv1, inv2, inv3, inv4),
                new HashMap<>(Map.of("motor", 2, "batería", 2, "plástico", 1, "cable", 2, "sensor", 1, "imán", 1, "panel solar", 1, "led", 1))
        );

        List<Inventor> inventores = new ArrayList<>(List.of(invA, invB, invC));

        System.out.println("INVENTORES DE EJEMPLO:");
        System.out.println("======================");
        for (Inventor inv : inventores) {
            System.out.println(inv);
            System.out.println();
        }

        // Construcción de inventos
        invA.construirInventos();
        invB.construirInventos();
        invC.construirInventos();

        // Ordenar inventores
        Comparator<Inventor> compNumInventos = Comparator.comparingInt(Inventor::getNumInventos);
        Comparator<Inventor> compApodo = Comparator.comparing(Inventor::getApodo);
        inventores.sort(compNumInventos.thenComparing(compApodo));

        System.out.println("RESULTADOS ORDENADOS:");
        for (Inventor inv : inventores) {
            System.out.println(inv);
            System.out.println();
        }

        // Filtrar menores o igual que invB (por apodo)
        UtilColecciones<Inventor> util = new UtilColecciones<>();
        Collection<Inventor> menores = util.filtrarMenores(inventores, invB, compApodo);

        System.out.println("FILTRADOS MENORES O IGUAL A INVB (POR APODO):");
        for (Inventor inv : menores) {
            System.out.println(inv.getApodo());
        }
    }
}
