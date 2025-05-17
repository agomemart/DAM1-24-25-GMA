package ud6.practicaex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Mapas {
    public static void imprimirStockMayorA10(Map<String, Integer> stock) {
        for (Map.Entry<String, Integer> entrada : stock.entrySet()) {
            if (entrada.getValue() > 10) {
                System.out.println("Producto: " + entrada.getKey() + " - Cantidad: " + entrada.getValue());
            }
        }

    }

    public static void main(String[] args) {
        Map<String, Integer> stock = new HashMap<>();
        stock.put("Teclado", 5);
        stock.put("Mouse", 10);
        stock.put("Monitor", 15);

        imprimirStockMayorA10(stock);
    }
}
