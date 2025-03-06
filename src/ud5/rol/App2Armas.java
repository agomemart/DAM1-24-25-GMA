package ud5.rol;

public class App2Armas {
    public static void main(String[] args) {
        try {
            PersonajeEx valkiria = new PersonajeEx("Valkiria", Raza.ELFO, 60, 70, 80, 90, 50, 40, 1, 0);
            PersonajeEx arturo = new PersonajeEx("Arturo", Raza.HUMANO, 50, 60, 90, 80, 40, 30, 1, 0);

            Armadura yelmoHierro = new Armadura("Yelmo de hierro", 2.5, 500, 5, TipoArmadura.YELMO);
            Armadura cotaMalla = new Armadura("Cota de Malla", 10.0, 2000, 20, TipoArmadura.ARMADURA);
            Arma espadaLarga = new Arma("Espada larga", 3.0, 10000, 60, false);
            Armadura escudoMadera = new Armadura("Escudo de madera", 5.0, 100, 10, TipoArmadura.ESCUDO);

            Armadura yelmoPlata = new Armadura("Yelmo de plata", 3.0, 700, 5, TipoArmadura.YELMO);
            Armadura coraza = new Armadura("Coraza", 15.0, 5000, 30, TipoArmadura.ARMADURA);
            Arma espadonDosManos = new Arma("Espadón a dos manos", 5.0, 1000, 50, true);

            valkiria.equipar(yelmoHierro);
            valkiria.equipar(cotaMalla);
            valkiria.equipar(espadaLarga);
            valkiria.equipar(escudoMadera);

            arturo.equipar(yelmoPlata);
            arturo.equipar(coraza);
            arturo.equipar(espadonDosManos);

            System.out.println("2. Armas y Armaduras");
            System.out.println("====================");
            valkiria.mostrarEquipo();
            System.out.println();
            arturo.mostrarEquipo();
        } catch (PersonajeNoValidoException e) {
            System.out.println("Error al crear el personaje: " + e.getMessage());
        }
    }
}
