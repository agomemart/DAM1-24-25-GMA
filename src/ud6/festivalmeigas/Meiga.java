package ud6.festivalmeigas;

import java.util.*;

public class Meiga {
    private String nome;
    private String alcume;
    private Set<Feitizo> feitizos;
    private Map<String, Integer> inventario;

    public Meiga(String nome, String alcume, Collection<Feitizo> feitizos, Map<String, Integer> inventario) {
        this.nome = nome;
        this.alcume = alcume;
        this.feitizos = new HashSet<>(feitizos); // Convertir a Set
        this.inventario = new HashMap<>(inventario);
    }

    public static Meiga[] crearMeigasExemplo(Feitizo[] feitizosDisponibles) {
        Random rnd = new Random();

        String[] nomes = {"Uxía", "Lúa", "Iria", "Noa"};
        String[] alcumes = {"A das Fraguiñas", "Sombra do Vento", "Luz do Bosque", "Meiga da Brétema"};

        Meiga[] meigas = new Meiga[nomes.length];

        // Obtén todos os feitozos de exemplo e todos os seus ingredientes únicos
        Collection<Feitizo> feitizosExemplo = List.of(Feitizo.crearFeitizosExemplo());
        Collection<String> ingredientesExemplo = Feitizo.ingredientesUnicos(feitizosExemplo);

        for (int i = 0; i < nomes.length; i++) {
            String nome = nomes[i];
            String alcume = alcumes[i];
            // Xera unha colección cunha selección aleatoria de feitizos de exemplo para asignar á meiga
            //Collection<Feitizo> feitizos = getFeitizosRnd(feitizosExemplo);
            // Xera un mapa cunha selección aleatoria de ingredientes e cantidades de cada un de exemplo para asignar á meiga
            Map<String, Integer> inventario = getIngredientesRnd(ingredientesExemplo, 3);

            // Crea a meiga e a engade ao array
            //meigas[i] = new Meiga(nome, alcume, feitizos, inventario);
        }

        return meigas;

    }

    private static Map<String,Integer> getIngredientesRnd(Collection<String> ingredientesExemplo, Integer i) {
        Random rnd = new Random();
        Map<String, Integer> resultado = null;
        int tamaño = ingredientesExemplo.size();
        for (int j = 0; j < i; j++) {
            int aleatorio = rnd.nextInt(1, tamaño);
        }

        return resultado;
    }

    public static Collection<Feitizo> getFeitizosRnd(Collection<Feitizo> feitizosExemplo, int cantidad) {
        List<Feitizo> lista = new ArrayList<>(feitizosExemplo);
        Collections.shuffle(lista);
        return new HashSet<>(lista.subList(0, Math.min(cantidad, lista.size())));
    }

    public static Map<String, Integer> getIngredientesRnd(Collection<String> ingredientesExemplo, int maxUnidades) {
        Map<String, Integer> resultado = new HashMap<>();
        Random rnd = new Random();
        List<String> ingredientesLista = new ArrayList<>(ingredientesExemplo);
        Collections.shuffle(ingredientesLista);

        for (int i = 0; i < Math.min(3, ingredientesLista.size()); i++) {
            String ing = ingredientesLista.get(i);
            resultado.put(ing, 1 + rnd.nextInt(maxUnidades));
        }
        return resultado;
    }

    public boolean lanzarFeitizo(Feitizo f) {
        // Verificar ingredientes
        if (!inventario.keySet().containsAll(f.ingredientes)) return false;

        // Consumir ingredientes
        f.ingredientes.forEach(ing -> inventario.put(ing, inventario.get(ing) - 1));
        return true;
    }
}
