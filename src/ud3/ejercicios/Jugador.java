package ud3.ejercicios;

enum Posicion {
    PORTERO, DEFENSA, CENTROCAMPISTA, DELANTERO;
}

public class Jugador {
    private String dni;
    private String nombre;
    private Posicion posicion;
    
        public Jugador(String dni, String nombre, Posicion posicion) {
            this.dni = dni;
            this.nombre = nombre;
            this.posicion = posicion;
        }

        public Jugador(String nombre) {
            this.nombre = nombre;
        }

        public Jugador(String nombre, Posicion posicion) {
            this.nombre = nombre;
            this.posicion = posicion;
        }

        public String getDni() {
            return dni;
        }

        public String getNombre() {
            return nombre;
        }

        public Posicion getPosicion() {
            return posicion;
        }
        
        public void mostrar() {
            System.out.println("DNI: " + getDni());
            System.out.println("Nombre: " + getNombre());
            System.out.println("Posición: " + getPosicion());
        }
        
        public Posicion cambiar(Posicion posicionNueva) {
            return posicion = posicionNueva;
        }
}
