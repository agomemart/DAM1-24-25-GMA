package ud5.ejercasa.tiendaproductos;

public class Tienda {
    private Producto[] productos;
    private int cantidad;

    public Tienda(int maxCantidad) {
        this.productos = new Producto[maxCantidad];
        this.cantidad = 0;
    }

    public void agregarProducto(Producto producto) {
        if (cantidad < productos.length) {
            productos[cantidad] = producto;
            cantidad++;
        } else {
            System.out.println("No se puede añadir el producto porque no hay más espacio.");
        }
    }

    public void mostrarProductos() {
        if (cantidad == 0) {
            System.out.println("No hay productos en la tienda.");
        } else {
            for (int i = 0; i < cantidad; i++) {
                System.out.println(productos[i]);
            }
        }
    }

    public void aplicarDescuentoCategoria(CategoriaProducto categoria, double porcentaje) {
        boolean aplicado = false;
        for (int i = 0; i < cantidad; i++) {
            if (productos[i].getCategoriaProducto() == categoria) {
                double precioConDescuento = productos[i].aplicarDescuento(porcentaje);
                System.out.println(productos[i].getNombre() + " con descuento: " + precioConDescuento + "€");
                aplicado = true;
            }
        }
        if (!aplicado) {
            System.out.println("No hay productos de la categoría " + categoria + " para aplicar el descuento.");
        }
    }
}
