//Adrián Gómez Martínez
package ud2.gmaexamenrec;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Implementa una aplicación que realice una estadística de la estatura del alumnado de un 
aula. Se introducirán datos por teclado de estaturas en centímetros hasta que una entrada 
sea negativa, y se mostrará al terminar: 
●  el número total de alumnos
●  la media de estatura (en metros con hasta 2 decimales)
●  la altura más alta
●  la altura más baja
La aplicación controlará que no se introduzcan letras u otros caracteres no numéricos, 
permitiendo al usuario repetir la entrada hasta que sea correcta y sin contabilizar las 
entradas erróneas.
 */
public class EstadisticaEstaturas {
    public static void main(String[] args) {
        double estatura = 0;
        double totalEstaturas = 0;
        int contadorAlumnos = 0;
        double estaturaMenor = 0;
        double estaturaMayor = 0;
        double mediaEstatura = 0;

        Scanner sc = new Scanner(System.in);
        try {
            do {
                System.out.print("Introduce la estatura: ");

                estatura = sc.nextDouble();

                if (estatura > 0 && estatura < 2.5) {
                    totalEstaturas = totalEstaturas += estatura;
                    contadorAlumnos++;
                    mediaEstatura = totalEstaturas / contadorAlumnos;
                    if (estatura < mediaEstatura) {
                        estaturaMenor = estatura;
                    }
                    if (estatura > mediaEstatura) {
                        estaturaMayor = estatura;
                    }
                } else {
                    System.out.println("Error: estatura introducida no válida");
                }
            } while (estatura > 0);
        } catch (InputMismatchException e) {
            System.out.println("Error: dato introducido no válido");
        }
        sc.close();

        mediaEstatura = totalEstaturas / contadorAlumnos;
        System.out.println("Total alumnos: " + contadorAlumnos);
        System.out.printf("Media estatura: %.2f \n", mediaEstatura);
        System.out.println("Estatura menor: " + estaturaMenor);
        System.out.println("Estatura mayor: " + estaturaMayor);
    }
}
