//Adrián Gómez Martínez
package ud5.gmaexamen;

import java.util.Arrays;
import java.util.Comparator;

public class Servidor extends Host {
    Servicio[] servicios;

    public Servidor(String nombre, String direccionMac, String direccionIP) {
        super(nombre, direccionMac, direccionIP);
    }

    public boolean addServicio(String nombre, int puerto, String protocoloUtilizado) {
        servicios = Arrays.copyOf(servicios, servicios.length + 1);
        servicios[servicios.length - 1] = new Servicio(nombre, puerto, protocoloUtilizado);
        return true;
    }

    @Override
    public String toString() {
        String serviciosImprimir = "";
        for (int i = 0; i < servicios.length; i++) {
            serviciosImprimir += "* " + servicios[i] + "\n";
        }
        return getNombre() + " (" + getDireccionIP() + ")\n" + serviciosImprimir;
    }

    public class Servicio {
        String nombre;
        int numPuerto;
        String protocoloUtilizado;

        public Servicio(String nombre, int numPuerto, String protocoloUtilizado) {
            this.nombre = nombre;
            this.numPuerto = numPuerto;
            this.protocoloUtilizado = protocoloUtilizado;
        }
    }

    static void ordenarMayorMenor(Servicio[] servicios) {
        Comparator comparaMayMen = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Servidor s1 = (Servidor) o1;
                Servidor s2 = (Servidor) o2;
                return s2.servicios.length - s1.servicios.length;
            }
        };
        Arrays.sort(servicios, comparaMayMen);
    }

    public static void main(String[] args) {
        System.out.println("\nClase Servidor");
        System.out.println("==============\n");
        Servidor s1 = new Servidor("dam1", "192.168.0.117", "CC-11-22-33-44-AA");
        s1.addServicio("MySQL", 3306, "TCP");
        Servidor s2 = new Servidor("seixo", "192.168.0.11", "BB:11:22:33:44:55");
        s2.addServicio("HTTP", 80, "TCP");
        s2.addServicio("Proxy", 3128, "TCP");
        Servidor s3 = new Servidor("lapaman", "192.168.0.9", "AA:11:22:33:44:55");
        s3.addServicio("HTTP", 80, "TCP");
        s3.addServicio("Web", 80, "TCP");
        s3.addServicio("DNS", 53, "UDP");
        s3.addServicio("FTP", 21, "TCP");
        s3.addServicio("SSH", 22, "TCP");        

        Servidor[] servidores = { s1, s2, s3 };
        for (Servidor s : servidores) {
            System.out.println(s);
        }

        ordenarMayorMenor(s1.servicios);
        ordenarMayorMenor(s2.servicios);
        ordenarMayorMenor(s3.servicios);
        System.out.println("Servidores ordenados por numero de sesrvicios");
        System.out.println("==============\n");
        for (Servidor s : servidores) {
            System.out.println(s);
        }
    }
}