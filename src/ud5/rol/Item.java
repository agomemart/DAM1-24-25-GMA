package ud5.rol;

public class Item {
    private String nombre;
    private double peso;
    private int precioBase;

    public Item(String nombre, double peso, int precioBase) {
        if (peso <= 0 || precioBase < 0) {
            throw new IllegalArgumentException("El peso debe ser positivo y el precio base no negativo.");
        }
        this.nombre = nombre;
        this.peso = peso;
        this.precioBase = precioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    @Override
    public String toString() {
        return nombre + ", peso: " + peso + " kilos, precio: " + precioBase + " monedas";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Item item = (Item) obj;
        return Double.compare(item.peso, peso) == 0 &&
                precioBase == item.precioBase &&
                nombre.equals(item.nombre);
    }
}
