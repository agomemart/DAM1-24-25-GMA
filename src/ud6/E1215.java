package ud6;

import java.util.*;

public class E1215 {
    private static Scanner sc = new Scanner(System.in);;

    public static void main(String[] args) {

        int opcion;
        Map<Producto, Integer> stock = new HashMap<>();

        do {
            opcion = opcionMenu();

            switch (opcion) {
                case 1:
                    System.out.println("\nNUEVO PRODUCTO:");
                    System.out.println("===================\n");
                    System.out.print("Código: ");
                    String codigo = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.println("Unidades: ");
                    Integer unidades = sc.nextInt();
                    Producto p = new Producto(codigo, nombre);
                    stock.put(p, unidades);
                    break;
                case 2:
                    System.out.println("\nELIMINARA PRODUCTO:");
                    System.out.println("===================\n");
                    System.out.print("Código: ");
                    codigo = sc.nextLine();
                    p = new Producto(codigo, null);
                    stock.remove(p);
                    break;
                case 3:
                    System.out.println("\nACTIALIZAR EXISTENCIAS:");
                    System.out.println("===================\n");
                    System.out.print("Código: ");
                    codigo = sc.nextLine();
                    System.out.println("Unidades: ");
                    unidades = sc.nextInt();
                    p = new Producto(codigo, null);
                    stock.put(p, unidades);
                    break;
                case 4:
                    System.out.println("toString() del mapa:");
                    System.out.println(stock);

                    System.out.println("\nIterando el conjunto de entradas\n");
                    Set<Map.Entry<Producto, Integer>> entradas = stock.entrySet();
                    Iterator<Map.Entry<Producto, Integer>> it = entradas.iterator();
                    while (it.hasNext()) {
                        Map.Entry<Producto, Integer> entrada = it.next();
                        System.out.println("* " + entrada.getKey() + " (" + entrada.getValue() + ")");
                    }
                    break;
                default:
                    break;
            }
        }while (opcion != 0);
    }

    private static int opcionMenu() {
        int opcion;
        System.out.println("STOCK REPUESTOS AUTOMÓVIL");
        System.out.println("1. dar de alta");
        System.out.println("2. dar de baja");
        System.out.println("3. actualizar número de unidades");
        System.out.println("4. mostrar existencias");
        System.out.print("Opción:");
        opcion = sc.nextInt();
        sc.nextLine(); //Vaciar buffer
        return opcion;
    }
}
