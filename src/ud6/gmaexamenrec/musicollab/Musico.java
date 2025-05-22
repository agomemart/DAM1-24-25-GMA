package ud6.gmaexamenrec.musicollab;
//Adrián Gómez Martínez
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Musico implements Comparable<Musico>{
    private String nombre;
    private String alias;
    private List<String> instrumentosQueDomina;
    private Set<Cancion> repertorio;

    public Musico(String nombre, String alias, List<String> instrumentosQueDomina, Set<Cancion> repertorio) {
        this.nombre = nombre;
        this.alias = alias;
        this.instrumentosQueDomina = new ArrayList<>();
        this.repertorio = new HashSet<>();
    }

    public List<String> getInstrumentosQueDomina() {
        return instrumentosQueDomina;
    }

    @Override
    public int compareTo(Musico o) {
        return alias.compareTo(o.alias);
    }

    @Override
    public String toString() {
        return "[" + alias + "]" + "(" + nombre + "):" + "[" + instrumentosQueDomina + "]";
    }
}
