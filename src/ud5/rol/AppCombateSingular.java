package ud5.rol;

public class AppCombateSingular {

    public static void main(String[] args) throws PersonajeNoValidoException {
        Personaje p1 = new Personaje("Aragorn", Raza.HUMANO, 50, 60, 70, 80, 40, 30);
        Personaje p2 = new Personaje("Gimli", Raza.ENANO, 60, 50, 80, 40, 30, 20);

        System.out.println("Inicio del combate:");
        System.out.println(p1);
        System.out.println(p2);

        while (p1.estaVivo() && p2.estaVivo()) {
            int dano = p1.atacar(p2);
            System.out.println(p1.nombre + " ataca a " + p2.nombre + " causando " + dano + " de daño.");
            if (!p2.estaVivo()) break;

            dano = p2.atacar(p1);
            System.out.println(p2.nombre + " ataca a " + p1.nombre + " causando " + dano + " de daño.");
        }

        System.out.println("Fin del combate:");
        System.out.println(p1);
        System.out.println(p2);
    }
}
