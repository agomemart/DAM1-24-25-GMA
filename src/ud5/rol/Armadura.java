package ud5.rol;

public class Armadura extends Item {
    private int defensa;
    private TipoArmadura tipo;

    public Armadura(String nombre, double peso, int precio, int defensa, TipoArmadura tipo) {
        super(nombre, peso, precio);
        this.defensa = defensa;
        this.tipo = tipo;
    }

    public int getDefensa() {
        return defensa;
    }

    public TipoArmadura getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return getNombre() + " (+" + defensa + " defensa)";
    }
}
