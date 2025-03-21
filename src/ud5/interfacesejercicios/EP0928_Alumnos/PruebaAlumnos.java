package ud5.interfacesejercicios.EP0928_Alumnos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Clase de pruebas
public class PruebaAlumnos {
    public static void main(String[] args) {
        // Lista de alumnos sin <>
        List lista = new ArrayList();
        lista.add(new Alumno("Carlos", "Gomez", 20, 7.5));
        lista.add(new Alumno("Ana", "Martinez", 22, 8.9));
        lista.add(new Alumno("Luis", "Fernandez", 19, 6.2));

        // Mostrar lista original
        System.out.println("Lista Original:");
        imprimirLista(lista);

        // Ordenar por Nota Media (Comparable)
        Collections.sort(lista);
        System.out.println("\nOrdenados por Nota Media:");
        imprimirLista(lista);

        // Ordenar por Apellido (Comparator)
        Collections.sort(lista);
        System.out.println("\nOrdenados por Apellido:");
        imprimirLista(lista);

        // Ordenar por Nombre (Comparator)
        Collections.sort(lista, new ordenarPorNombre());
        System.out.println("\nOrdenados por Nombre:");
        imprimirLista(lista);

        // Ordenar por Edad (Comparator)
        Collections.sort(lista, new ordenarPorEdad());
        System.out.println("\nOrdenados por Edad:");
        imprimirLista(lista);
    }
    
    public static void imprimirLista(List lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}
