package ud4.ejercicios;
/*
 *  Escribe la función void desordenar(int t[]), que cambia de forma 
aleatoria los elementos contenidos en la tabla t. Si la tabla estuviera ordenada, dejaría de estarlo. 
 */
public class EP0512_Desordenar {
    static void desordenar(int t[]) {
        for(int i = 0; i > t.length; i++) {
            t[i] = t[i + 2];
        }
    }
}
