package ud5.rol;

import java.util.ArrayList;

public class PersonajeEx extends Personaje {
    private int monedas;
    private ArrayList<Item> inventario;
    private Item itemManoIzq;
    private Item itemManoDch;
    private Armadura armaduraCabeza;
    private Armadura armaduraCuerpo;

    public PersonajeEx(String nombre, Raza raza, int fuerza, int agilidad, int constitucion,
            int inteligencia, int intuicion, int presencia) throws PersonajeNoValidoException {
        this(nombre, raza, fuerza, agilidad, constitucion, inteligencia, intuicion, presencia, 1, 0);
    }

    public PersonajeEx(String nombre, Raza raza, int fuerza, int agilidad, int constitucion,
            int inteligencia, int intuicion, int presencia, int nivel, int experiencia)
            throws PersonajeNoValidoException {
        super(nombre, raza, fuerza, agilidad, constitucion, inteligencia, intuicion, presencia, nivel, experiencia);
        this.monedas = 0;
        this.inventario = new ArrayList<>();
    }

    public int getMonedas() {
        return monedas;
    }

    public void setMonedas(int monedas) {
        this.monedas = Math.max(0, monedas);
    }

    public boolean addToInventario(Item item) {
        double cargaTotal = getCargaTotal() + item.getPeso();
        if (cargaTotal <= getCargaMaxima()) {
            inventario.add(item);
            return true;
        }
        return false;
    }

    public double getCargaTotal() {
        return inventario.stream().mapToDouble(Item::getPeso).sum();
    }

    public double getCargaMaxima() {
        return 50 + getConstitucion() * 2;
    }

    public void mostrarInventario() {
        System.out.println("Inventario de " + getNombre() + ":");
        for (int i = 0; i < inventario.size(); i++) {
            System.out.println((i + 1) + ". " + inventario.get(i));
        }
        System.out.printf("Carga total transportada: %.2f/%.0f kilos%n", getCargaTotal(), getCargaMaxima());
    }

    public boolean equipar(Item item) {
        if (item instanceof Arma) {
            Arma arma = (Arma) item;
            if (arma.isDosManos()) {
                if (itemManoIzq == null && itemManoDch == null) {
                    itemManoIzq = arma;
                    itemManoDch = arma;
                    return true;
                }
            } else {
                if (itemManoDch == null) {
                    itemManoDch = arma;
                    return true;
                } else if (itemManoIzq == null) {
                    itemManoIzq = arma;
                    return true;
                }
            }
        } else if (item instanceof Armadura) {
            Armadura armadura = (Armadura) item;
            switch (armadura.getTipo()) {
                case YELMO:
                    if (armaduraCabeza == null) {
                        armaduraCabeza = armadura;
                        return true;
                    }
                    break;
                case ARMADURA:
                    if (armaduraCuerpo == null) {
                        armaduraCuerpo = armadura;
                        return true;
                    }
                    break;
                case ESCUDO:
                    if (itemManoDch == null) {
                        itemManoDch = armadura;
                        return true;
                    } else if (itemManoIzq == null) {
                        itemManoIzq = armadura;
                        return true;
                    }
                    break;
            }
        }
        return false;
    }

    public void mostrarEquipo() {
        System.out.println("Equipo de combate de " + getNombre() + ":");
        if (armaduraCabeza != null)
            System.out.println("- " + armaduraCabeza);
        if (armaduraCuerpo != null)
            System.out.println("- " + armaduraCuerpo);
        if (itemManoDch != null)
            System.out.println("- " + itemManoDch);
        if (itemManoIzq != null && itemManoIzq != itemManoDch)
            System.out.println("- " + itemManoIzq);
    }
}
