package ud5.ejercasa.tiendaproductos;

public class Main {
    public static void main(String[] args) {
        // Crear tienda
        Tienda tienda = new Tienda(40);

        // Crear productos
        Producto p1 = new Producto("Smartphone", 499.99, CategoriaProducto.ELECTRONICA);
        Producto p2 = new Producto("Camiseta", 19.99, CategoriaProducto.ROPA);
        Producto p3 = new Producto("Laptop", 899.99, CategoriaProducto.ELECTRONICA);
        Producto p4 = new Producto("Manzanas", 2.99, CategoriaProducto.ALIMENTACION);

        // Agregar productos a la tienda
        tienda.agregarProducto(p1);
        tienda.agregarProducto(p2);
        tienda.agregarProducto(p3);
        tienda.agregarProducto(p4);

        // Mostrar productos antes de aplicar descuento
        System.out.println("==== Productos en la tienda ====");
        tienda.mostrarProductos();

        // Aplicar descuento del 10% a los productos electrónicos
        System.out.println("\n==== Productos con descuento (10%) ====");
        tienda.aplicarDescuentoCategoria(CategoriaProducto.ELECTRONICA, 10);
    }
}
