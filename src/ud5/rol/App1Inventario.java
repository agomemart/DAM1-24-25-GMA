package ud5.rol;

public class App1Inventario {
    public static void main(String[] args) throws PersonajeNoValidoException {
        PersonajeEx personaje = new PersonajeEx("Arturo", Raza.HUMANO, 50, 60, 90, 80, 40, 30, 1, 0);

        personaje.addToInventario(new Item("Cota de Malla", 10.0, 2000));
        personaje.addToInventario(new Item("Espada larga", 3.0, 10000));
        personaje.addToInventario(new Item("Espadón a dos manos", 5.0, 1000));
        personaje.addToInventario(new Item("Pan", 1.0, 1));
        personaje.addToInventario(new Item("Agua", 2.0, 1));
        personaje.addToInventario(new Item("Daga", 0.5, 200));
        personaje.addToInventario(new Item("Antorcha", 0.75, 10));

        System.out.println("1. Inventario de personaje");
        System.out.println("==========================");
        personaje.mostrarInventario();
    }
}
