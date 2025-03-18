package ud5.praiasdegalicia;

import java.util.Arrays;
import java.util.Comparator;

public class Praia implements Comparable {
    private int id;
    private String nome;
    private String concello;
    private String provincia;
    private double lat;
    private double lon;

    public Praia() {
    }

    public Praia(int id) {
        this.id = id;
    }

    public Praia(int id, String nome, String concello, String provincia) {
        this.id = id;
        this.nome = nome;
        this.concello = concello;
        this.provincia = provincia;
    }

    public Praia(int id, String nome, String concello, String provincia, double lat, double lon) {
        this.id = id;
        this.nome = nome;
        this.concello = concello;
        this.provincia = provincia;
        this.lat = lat;
        this.lon = lon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConcello() {
        return concello;
    }

    public void setConcello(String concello) {
        this.concello = concello;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    @Override
    public String toString() {
        return getId() + " - " + getNome() + " - " + getConcello() + " - " + getProvincia() + " - (" + getLat() + ", " + getLon() + ")";
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Praia) {
            Praia otraPraia = (Praia) o;
            return Integer.compare(this.id, otraPraia.id); // Comparar por ID en lugar de nombre
        }
        return 0;
    }

    public void mostrarDetalles() {
        System.out.println("Detalles de la Playa:");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nome);
        System.out.println("Concello: " + concello);
        System.out.println("Provincia: " + provincia);
        System.out.println("Coordenadas: (" + lat + ", " + lon + ")");
    }

    public static Praia[] sortLatitudNorteSur(Praia[] p) {
        Praia[] copia = Arrays.copyOf(p, p.length);
        Arrays.sort(copia, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Praia a = (Praia) o1;
                Praia b = (Praia) o2;
                return Double.compare(b.getLat(), a.getLat()); // Mayor latitud primero
            }
        });
        return copia;
    }

    public static Praia[] sortProvinciaConcelloNome(Praia[] p) {
        Praia[] copia = Arrays.copyOf(p, p.length);
        Arrays.sort(copia, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Praia a = (Praia) o1;
                Praia b = (Praia) o2;

                int cmp = a.getProvincia().compareTo(b.getProvincia());
                if (cmp == 0) {
                    cmp = a.getConcello().compareTo(b.getConcello());
                }
                if (cmp == 0) {
                    cmp = a.getNome().compareTo(b.getNome());
                }
                return cmp;
            }
        });
        return copia;
    }

    static void imprimirLista(Praia[] praias, int pos) {
        for (int i = 0; i < pos; i++) {
            System.out.println(praias[i].toString());
        }
    }
}
