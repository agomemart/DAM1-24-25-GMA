package ud4.ejercicios;
/*
* El juego consiste en mostrar el mapa y a continuación solicitar al usuario que introduzca por
teclado una única cadena de caracteres con las instrucciones que debe seguir un robot para
llegar desde la casilla de salida hasta la de llegada sin pisar ninguna mina ni salirse del
tablero.
Al inicio del juego el robot está situado en la casilla de salida y orientado hacia arriba.
La cadena de instrucciones que se le da al robot puede tener estos 3 caracteres distintos:
● una “A” hará que el robot avance una casilla en la dirección en la que está orientado.
● una “R” hará que la orientación del robot gire a la derecha 90º sin moverse del sitio.
● una “L” hará que la orientación del robot gire a la izquierda 90º sin moverse del sitio.
Implementa una función que reciba como parámetros de entrada un mapa en el formato
anterior y una cadena de caracteres con las instrucciones para el robot y que devuelva true
si tras ejecutar las instrucciones el robot termina en la casilla de llegada y false si el robot se
pasa de largo, o si pisa alguna mina o si sale del tablero, o si las instrucciones contienen
caracteres no válidos, o en cualquier otro caso.
* */
public class RecorridoRobot {
    static boolean recorridoRobot(String[] mapa, String instrucciones) {
        int orientacion = 0; //0-arriba 1-derecha 2-abajo 3-izquierda
        int filaRobot = 0, colRobot = 0;

        //buscarSalida
        for (int i = 0; i < mapa.length; i++) {
            if (mapa[i].indexOf('A') != -1) {
                filaRobot = i;
                colRobot = mapa[i].indexOf('A');
            }
        }


        for (int i = 0; i < instrucciones.length(); i++) {
            switch (instrucciones.toUpperCase().charAt(i)) {
                case 'A':
                    switch (orientacion) {
                        case 0:
                            if (filaRobot == 0){
                                return false;
                            }
                            filaRobot--; break;
                        case 1:
                            if (colRobot == mapa[0].length() - 1){
                                return false;
                            }
                            colRobot++; break;
                        case 2:
                            if (filaRobot == mapa.length - 1) {
                                return false;
                            }
                            filaRobot++; break;
                        case 3:
                            if (colRobot == 0) {
                                return false;
                            }
                            colRobot--; break;
                    }
                    if (mapa[filaRobot].charAt(colRobot) == '*'){
                        return false;
                    }
                    break;
                case 'R':
                    orientacion++;
                    orientacion %= 4;
                    break;
                case 'L':
                    orientacion--;
                    orientacion %= 4;
                    break;
            }
        }
        if (mapa[filaRobot].charAt(colRobot) == 'Z') {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String[] mapa = {
                " Z        ",
                "  *       ",
                "   *  *   ",
                "          ",
                "A         "
        };
        System.out.println(recorridoRobot(mapa, "AALARAARAA"));
        System.out.println(recorridoRobot(mapa, "RAALAAAALA"));
        System.out.println(recorridoRobot(mapa, "ARALA"));
        System.out.println(recorridoRobot(mapa, "LAA"));

    }

}