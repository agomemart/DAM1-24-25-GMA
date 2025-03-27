//Adrián Gómez Martínez
package ud5.gmaexamen;

import java.util.Arrays;
import java.util.Objects;

public class Host implements Comparable{

    // Tu código aquí
    private String nombre;
    private String direccionMac;
    private String direccionIP;
    private String mascaraRed;
    private String puertaEnlace;
    private String servidoresDns;

    public Host(String nombre, String direccionIP, String direccionMac) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("Nombre no válido");
        } else {
            this.nombre = nombre;
        }
        if (direccionIP. length() >= 7 && direccionIP.length() <= 15) {
            this.direccionIP = direccionIP;
        } else {
            throw new IllegalArgumentException("Dirección IP no válida");
        }
        if (direccionMac.length() != 17) {
            throw new IllegalArgumentException("Dirección MAC no válida");
        } else {
            this.direccionMac = direccionMac;
        }
        this.mascaraRed = "255.255.0.0";
        this.puertaEnlace = "192.168.0.11";
        this.servidoresDns = "192.168.0.9";
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccionIP() {
        return direccionIP;
    }

    public void setDireccionIP(String direccionIP) {
        this.direccionIP = direccionIP;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Host host)) return false;
        direccionMac = direccionMac.toLowerCase();
        direccionMac.split("-", direccionMac.length());
        direccionMac.split(":", direccionMac.length());
        host.direccionMac.split("-", direccionMac.length());
        host.direccionMac.split(":", direccionMac.length());
        return Objects.equals(direccionMac, host.direccionMac);
    }

    @Override
    public String toString() {
        return  nombre + " (" + direccionIP + " / " + direccionMac + ")";
    }

    @Override
    public int compareTo(Object o) {
        Host h1 = (Host) o;
        return this.nombre.compareTo(h1.nombre);
    }

    boolean validarIP(String ip) {
        return ip.matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");
    }

    boolean validarMAC(String mac) {
        return mac.matches("([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})");
    }

    public static void main(String[] args) {
        System.out.println("\nClase Host");
        System.out.println("==========\n");
        Host h100 = new Host("host100", "192.168.117.100", "00:11:22:33:44:55");
        Host h101 = new Host("equipo101", "192.168.117.101", "00:11:22:33:44:55");
        Host h102 = new Host("nodo100", "192.168.117.100", "00-11-22-33-44-AA");
        Host h103 = new Host("host103", "192.168.117.103", "00-11-22-33-44-55");

        Host[] hosts = { h100, h101, h102, h103};
        Arrays.sort(hosts);
        for (Host h : hosts) {
            System.out.println(h);
        }

        System.out.println(h100.nombre + " = " + h101.nombre + "? " + h100.equals(h101)); // true
        System.out.println(h100.nombre + " = " + h102.nombre + "? " + h100.equals(h102)); // false
        System.out.println(h100.nombre + " = " + h103.nombre + "? " + h100.equals(h103)); // true
    }
}
