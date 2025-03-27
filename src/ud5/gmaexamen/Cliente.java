//Adrián Gómez Martínez
package ud5.gmaexamen;

import java.util.Arrays;
import java.util.Comparator;

enum SO{WINDOWS, LINUX, MAC, ANDROID, IOS}

public class Cliente extends Host {
    private SO sistemaOperativo;
    private int alto;
    private int ancho;
    private String resolucionPantalla = alto + "X" + ancho;

    public Cliente(String nombre, String direccionMac, String direccionIP, SO sistemaOperativo, String resolucionPantalla) {
        super(nombre, direccionMac, direccionIP);
        this.sistemaOperativo = sistemaOperativo;
        this.resolucionPantalla = resolucionPantalla;
    }

    @Override
    public String toString() {
        return getNombre() + " (" + sistemaOperativo + " " + resolucionPantalla + ")";
    }

    static void ordenarPorSo(Cliente[] clientes) {
        Comparator comparaSO = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Cliente c1 = (Cliente) o1;
                Cliente c2 = (Cliente) o2;
                return c1.sistemaOperativo.compareTo(c2.sistemaOperativo);
            }
        };
        Arrays.sort(clientes, comparaSO);
    }

    static void ordenarPorResolucion(Cliente[] clientes) {
        Comparator comparaResolucion = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Cliente c1 = (Cliente) o1;
                Cliente c2 = (Cliente) o2;
                int resolTotalC1 = c1.alto * c1.ancho;
                int resolTotalC2 = c2.alto * c2.ancho;
                return resolTotalC2 - resolTotalC1;
            }
        };
        Arrays.sort(clientes, comparaResolucion);
    }

    public static void main(String[] args) {
        System.out.println("\nClase Cliente");
        System.out.println("=============\n");        
        Cliente cWin1 = new Cliente("Cliente1", "192.168.1.2", "02:1A:2B:3C:4D:5E", SO.WINDOWS, "1920x1080");
        Cliente cLin2 = new Cliente("Cliente2", "192.168.1.3", "01:1A:2B:3C:4D:5F", SO.LINUX, "1366x768");
        Cliente cMac3 = new Cliente("Cliente3", "192.168.1.4", "04:1A:2B:3C:4D:60", SO.MAC, "2560x1440");
        Cliente cAnd4 = new Cliente("Cliente4", "192.168.1.5", "03:1A:2B:3C:4D:61", SO.ANDROID, "1080x2340");
        Cliente cIos5 = new Cliente("Cliente5", "192.168.1.6", "05:1A:2B:3C:4D:62", SO.IOS, "1170x2532");

        Cliente[] clientes = { cWin1, cLin2, cMac3, cAnd4, cIos5 };
        Arrays.sort(clientes);
        for (Cliente c : clientes) {
            System.out.println(c);
        }

        ordenarPorSo(clientes);
        System.out.println("Clientes ordenados por SO");
        System.out.println("=============\n");
        for (Cliente c : clientes) {
            System.out.println(c);
        }

        ordenarPorResolucion(clientes);
        System.out.println("Clientes ordenados por Resolución");
        System.out.println("=============\n");
        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }
    
}
