package ud6.festivalmeigas;

public class Meiga {
    private String nome;
    private String alcumeMaxico;
    private Feitizo[] feitizos;

    public Meiga(String nome, String alcumeMaxico, Feitizo[] feitizos) {
        this.nome = nome;
        this.alcumeMaxico = alcumeMaxico;
        this.feitizos = new Feitizo[feitizos.length];
    }
}
