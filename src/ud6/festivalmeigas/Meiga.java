package ud6.festivalmeigas;

import java.util.Collection;
import java.util.Random;
import java.util.Map;
import java.util.List;

public class Meiga {
    private String nome;
    private String alcume;
    private Collection<Feitizo> feitizos;

    public Meiga(String nome, String alcume, Collection<Feitizo> feitizos, Map<String, Integer> inventario) {
        this.nome = nome;
        this.alcume = alcume;
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
            Collection<Feitizo> feitizos = getFeitizosRnd(feitizosExemplo);
            // Xera un mapa cunha selección aleatoria de ingredientes e cantidades de cada un de exemplo para asignar á meiga
            Map<String, Integer> inventario = getIngredientesRnd(ingredientesExemplo, 3);

            // Crea a meiga e a engade ao array
            meigas[i] = new Meiga(nome, alcume, feitizos, inventario);
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

    private static Collection<Feitizo> getFeitizosRnd(Collection<Feitizo> feitizosExemplo) {
        Random rnd = new Random();
        Collection<Feitizo> resultado = null;
        int tamaño = feitizosExemplo.size();
        for (Feitizo f : feitizosExemplo) {
            int aleatorio = rnd.nextInt(1, tamaño);

        }


        return resultado;
    }
}
