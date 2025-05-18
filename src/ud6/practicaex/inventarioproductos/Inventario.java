package ud6.practicaex.inventarioproductos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventario {
    private Map<String, Integer> stock;
    private List<Producto> productos;

    public Inventario() {
        stock = new HashMap<>();
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p, int cantidad) {
        stock.put(p.getNombre(), cantidad);
        productos.add(p);
    }

    public void mosttrarStock(){
        for (String nombre : stock.keySet()) {
            System.out.println(nombre + ": " + stock.get(nombre));
        }
    }

    public List<Producto> productosPorCategoria(String categoria) {
        List<Producto> prodPorCategoria = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getCategorias().contains(categoria.toLowerCase())) {
                prodPorCategoria.add(p);
            }
        }
        return prodPorCategoria;
    }

    public void reducirStock(String nombre, int cantidad) {
        if (!stock.containsKey(nombre)) return;

        if (stock.get(nombre) - cantidad > 0) {
            stock.put(nombre, stock.get(nombre) - cantidad);
        } else {
            stock.remove(nombre);
        }

    }
}
