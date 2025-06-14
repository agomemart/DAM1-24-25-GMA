package ejrec.biblioteca;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Biblioteca {
    private ArrayList<Libro> libros = new ArrayList<>();

    public static void mostrarMenu() {
        System.out.println("1. Añadir libro");
        System.out.println("2. Mostrar todos los libros");
        System.out.println("3. Buscar libro por título");
        System.out.println("4. Mostrar autores únicos");
        System.out.println("5. Mostrar libros por autor");
        System.out.println("6. Salir");
    }

    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Titulo: ");
                    String titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    System.out.print("ISBN: ");
                    String isbn = sc.nextLine();

                    libros.add(new Libro(titulo, autor, isbn));
                    System.out.println("Libro añadido");
                    break;
                case 2:
                    for (Libro l1 : libros) {
                        System.out.println(l1);
                    }
                    break;
                case 3:
                    boolean encontradoTitulo = false;
                    System.out.print("Inserta el título: ");
                    String tituloBuscar = sc.nextLine();
                    for (Libro libro : libros) {
                        if (libro.getTitulo().equalsIgnoreCase(tituloBuscar)) {
                            System.out.println(libro);
                            encontradoTitulo = true;
                        }
                    }

                    if (!encontradoTitulo) {
                        System.out.println("No se encontraron libros con ese titulo");
                    }
                    break;
                case 4:
                    Set<String> autoresUnicos = new HashSet<>();

                    for (Libro libro : libros) {
                        autoresUnicos.add(libro.getAutor());
                    }

                    if (autoresUnicos.isEmpty()) {
                        System.out.println("No hay autores registrados");
                    } else {
                        System.out.println("Autores unicos: ");
                        for (String autorLibro: autoresUnicos) {
                            System.out.println(autorLibro);
                        }
                    }
                    break;
                case 5:
                    System.out.print("Autor: ");
                    String autorLibros = sc.nextLine();
                    boolean encontradoAutor = false;

                    for (Libro libro: libros) {
                        if (libro.getAutor().equalsIgnoreCase(autorLibros)) {
                            System.out.println(libro);
                            encontradoAutor = true;
                        }
                    }

                    if (!encontradoAutor) {
                        System.out.println("No hay libros de ese autor");
                    }
                    break;
                case 6:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
            }
        } while (opcion != 6);
        sc.close();
    }

    public static void main(String[] args) {
        Biblioteca biblioteca1 = new Biblioteca();
        biblioteca1.ejecutar();
    }
}
