package ud6;

import java.util.*;

public class Mapas {
    public static void main(String[] args) {
        Map<String, Double> m = new HashMap<>();

        m.put("Ana", 1.65);
        m.put("Marta", 1.60);
        m.put("Luis", 1.73);
        m.put("Pedro", 1.69);

        System.out.println(m);

        m.put("Pedro", 1.71);

        System.out.println(m);

        System.out.println(m.get("Pepe"));
        System.out.println(m.get("Pedro"));

        System.out.println(m);

        System.out.println(m.remove("Pepe"));
        System.out.println(m.remove("Pedro"));

        System.out.println(m);

        Set<String> nombres = m.keySet();
        System.out.println(nombres);

        Collection<Double> estaturas = m.values();
        System.out.println(estaturas);

        Set<Map.Entry <String, Double>> entradas = m.entrySet();

        Iterator<Map.Entry<String, Double>> it = entradas.iterator();

        while (it.hasNext()) {
            Map.Entry<String, Double> entrada = it.next();
            if (entrada.getKey().charAt(0) == 'L')
                entrada.setValue(entrada.getValue() * 2);
        }

        Map<String, Double> mTree = new TreeMap<>();

        mTree = m;

        it = entradas.iterator();

        while (it.hasNext()) {
            Map.Entry<String, Double> entrada = it.next();
            if (entrada.getKey().charAt(0) == 'L')
                mTree.put(entrada.getKey(), entrada.getValue());
        }

        System.out.println(mTree);
        mTree.put("Lola", 1.80);
        System.out.println(mTree);

        System.out.println(m);
    }
}
