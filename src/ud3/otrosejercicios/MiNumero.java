package ud3.otrosejercicios;

public class MiNumero {
    private int num;

    public MiNumero() {
    }
    public MiNumero(int num) {
        this.num = num;
    }

    public int cambiarNumero(int nuevoNum) {
        return num = nuevoNum;
    }
    
    public int suma(int numSuma) {
        return num += numSuma;
    }

    public int resta(int numResta) {
        return num -= numResta;
    }

    public int getValor() {
        return num;
    }

    public int getDoble() {
        return num * 2;
    }

    public int getTriple() {
        return num * 3;
    }

    public int getCuadruple() {
        return num * 4;
    }
}
