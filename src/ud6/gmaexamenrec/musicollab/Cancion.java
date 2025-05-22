package ud6.gmaexamenrec.musicollab;
//Adrián Gómez Martínez
import java.util.*;

public class Cancion implements Comparable<Cancion>{
    private String nombre;
    private String autor;
    private String estiloMusical;
    private List<String> instrumentosRequeridos;

    public Cancion(String nombre, String autor, String estiloMusical, List<String> instrumentosRequeridos) {
        this.nombre = nombre;
        this.autor = autor;
        this.estiloMusical = estiloMusical;
        this.instrumentosRequeridos = new ArrayList<>();
    }

    public static void main(String[] args) {
        // Canciones de ejemplo
        List<Cancion> canciones = Arrays.asList(
                new Cancion("Bohemian Rhapsody", "Queen", "Rock",
                        List.of("voz", "piano", "guitarra", "batería")),
                new Cancion("Billie Jean", "Michael Jackson", "Pop",
                        List.of("voz", "bajo", "batería")),
                new Cancion("Imagine", "John Lennon", "Balada",
                        List.of("voz", "piano")),
                new Cancion("Smells Like Teen Spirit", "Nirvana", "Grunge",
                        List.of("voz", "guitarra", "bajo", "batería")),
                new Cancion("Yesterday", "The Beatles", "Pop",
                        List.of("voz", "guitarra")),
                new Cancion("Sweet Child O'Mine", "Guns N' Roses", "Rock",
                        List.of("voz", "guitarra", "bajo", "batería")),
                new Cancion("Rolling in the Deep", "Adele", "Pop",
                        List.of("voz", "piano", "batería")),
                new Cancion("Hotel California", "Eagles", "Rock",
                        List.of("voz", "guitarra", "bajo", "batería")));
        
        // Ordenar canciones por nombre                        
        Collections.sort(canciones);
        System.out.println("\nCanciones ordenadas por nombre:");
        System.out.println("===============================\n");
        canciones.forEach(System.out::println);

        // Ordenar canciones alfabéticamente por estilo musical, luego por autor y luego por nombre
        System.out.println("\nCanciones ordenadas por estilo musical, luego por autor y luego por nombre:");
        System.out.println("===========================================================================\n");

        // TODO Tu código aquí
        canciones.sort((o1, o2) -> {
            if (o1.estiloMusical.equals(o2.estiloMusical)) {
                if (o1.autor.equals(o2.autor)) {
                    return o1.nombre.compareTo(o2.nombre);
                }
                return o1.autor.compareTo(o2.autor);
            }
            return o1.estiloMusical.compareTo(o2.estiloMusical);
        });

        canciones.forEach(System.out::println);       
        
        // Obtener lista de instrumentos distintos
        System.out.println("\nLista de instrumentos distintos:");
        System.out.println("================================\n");
        System.out.println(instrumentosDistintos(canciones));

        System.out.println("\n");
    }

    private static List<Cancion> instrumentosDistintos(Collection<Cancion> canciones) {
        Set<Cancion> sinInstrumentosRepetidos = new HashSet<>(canciones);
        return sinInstrumentosRepetidos.stream().sorted().toList();
    }

    @Override
    public int compareTo(Cancion o) {
        return nombre.compareTo(o.nombre);
    }

    @Override
    public String toString() {
        return '"' + nombre + '"' + " (" + autor + ")-[" + estiloMusical + "] | Instrumentos:" + instrumentosRequeridos;
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getInstrumentosRequeridos() {
        return instrumentosRequeridos;
    }
}
