package ud6.practicaex.concursoinventores;

import java.util.*;

public class Inventor implements Comparable<Inventor>{
    private String nombre;
    private String apodo;
    private Set<Invento> inventosFavoritos = new HashSet<>();
    private Map<String, Integer> materiales = new HashMap<>();

    public Inventor(String nombre, String apodo, Set<Invento> inventosFavoritos, Map<String, Integer> materiales) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.inventosFavoritos = inventosFavoritos;
        this.materiales = materiales;
    }

    public String getApodo() {
        return apodo;
    }

    @Override
    public int compareTo(Inventor o) {
        return apodo.compareTo(o.apodo);
    }

    public int construirInventos() {
        Comparator<Invento> compMayorCompl = (i1, i2) -> i2.getNivelComplejidad() - i1.getNivelComplejidad();
        Comparator<Invento> compAlfab = (i1, i2) -> i1.getNombre().compareTo(i2.getNombre());
        List<Invento> inventos = new ArrayList<>(inventosFavoritos);
        Collections.sort(inventos, compMayorCompl.thenComparing(compAlfab));
        int numInventos = 0;

        for (Invento i : inventos) {
            if(materiales.keySet().containsAll(i.getMateriales())) {
                System.out.println("Construyendo invento " + i.getNombre());
                numInventos++;
                for (String material : i.getMateriales()) {
                    if (materiales.get(material) > 1) {
                        materiales.put(material, materiales.get(material) - 1);
                        numInventos++;
                    } else {
                        materiales.remove(material);
                    }
                }
            } else {
                System.out.println("No se puede construir el invento " + i.getNombre());
            }
        }
        return numInventos;
    }

    public int getNumInventos() {
        return inventosFavoritos.size();
    }

    @Override
    public String toString() {
        return nombre + " (" + apodo + ") " +
                "\n" + inventosFavoritos.stream().sorted() +
                "\n" + materiales;
    }
}
