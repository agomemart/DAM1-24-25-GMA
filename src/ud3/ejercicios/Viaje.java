package ud3.ejercicios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Viaje {
    private LocalDateTime fechaSalida;
    private String origen, destino;
    private int plazas;
    User username;

    public Viaje(LocalDateTime fechaSalida, User username, String origen, String destino, int plazas) {
        this.fechaSalida = fechaSalida;
        this.username = username;
        this.origen = origen;
        this.destino = destino;
        this.plazas = plazas;
    }

    public LocalDateTime getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    public User getUsername() {
        return username;
    }

    public void setUsername(User username) {
        this.username = username;
    }
    
    public void mostrar() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm");
        System.out.println("Nombre de usuario: " + getUsername());
        System.out.println("Plazas disponibles: " + getPlazas());
        System.out.println("Fecha de salida: " + getFechaSalida().format(formatter));
        System.out.println("Origen: " + getOrigen());
        System.out.println("Destino: " + getDestino());
    }

    @Override
    public String toString() {
        return fechaSalida + " - " + username + " - " + origen + " >> " + destino;
    }
    public static void main(String[] args) {
        User u1 = new User("prueba");
        Viaje v1 = new Viaje(LocalDateTime.of(2024, 12, 15, 20, 0, 0), u1, "Madrid", "Barcelona", 3);
       v1.mostrar();
    }
}
