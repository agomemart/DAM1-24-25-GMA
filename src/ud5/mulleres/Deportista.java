package ud5.mulleres;

public class Deportista extends MullerTraballadora implements IPioneira{
    String hitoHistorico;

    public Deportista(String nombre, String apellidos, int anoNacimiento, String hitoHistorico) {
        super(nombre, apellidos, anoNacimiento);
        this.hitoHistorico = hitoHistorico;
    }

    @Override
    public String descrContrib() {
        return "";
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos + " " + hitoHistorico;
    }

    @Override
    public void getDescubrimentoOuAporte() {
        IPioneira.super.getDescubrimentoOuAporte();
    }
}
