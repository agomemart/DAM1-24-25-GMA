package ud6.practicaex;

import ud6.apuntescolecciones.Cliente;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Repaso {
    // 1. GENÉRICOS
    class Contenedor<T> { // Clase genérica
        private T valor;
        public void guardar(T nuevo) { this.valor = nuevo; }
        public T extraer() { return this.valor; }
    }

    // Método genérico estático
    public static <U> int contarNulls(U[] array) {
        int cont = 0;
        for (U elem : array) if (elem == null) cont++;
        return cont;
    }

    // 2. COLECCIONES (List/Set)
    List<String> lista = new ArrayList<>(); // Lista dinámica
    Set<Integer> conjunto = new HashSet<>(); // Elementos únicos

// Métodos comunes:
/*lista.add("Hola");                 // Añadir elemento
lista.addAll(otraLista);            // Unir colecciones
lista.remove(0);                    // Eliminar por índice
lista.contains("Hola");             // Verificar existencia
lista.size();                       // Tamaño actual
lista.clear();                      // Vaciar lista
*/
    // Iteración segura con Iterator
    Iterator<String> it = lista.iterator();
/*while(it.hasNext()) {
        if (it.next().equals("eliminar")) it.remove();
    }*/

// 3. OPERACIONES ESPECÍFICAS DE LISTA
/*lista.get(0);                       // Obtener por índice
lista.set(0, "Nuevo");              // Modificar por índice
lista.indexOf("Hola");              // Primer índice del elemento
Collections.sort(lista);            // Ordenar (natural)
lista.sort(Comparator.reverseOrder());// Orden inverso*/

    // 4. CONJUNTOS (Set)
    Set<Cliente> clientes = new TreeSet<>(Comparator.comparing(Cliente::getNombre)); // Ordenado
//conjunto.addAll(lista);             // Eliminar duplicados de lista

// 5. STREAMS (Java 8+)
/*lista.stream()
        .filter(s -> s.length() > 3)    // Filtrar elementos
            .map(String::toUpperCase)       // Transformar
    .sorted()                       // Ordenar
    .collect(Collectors.toList());  // Convertir a lista*/

    // Operaciones numéricas
 /*   int suma = numeros.stream()
            .mapToInt(Integer::intValue)
            .sum();*/

    // 6. INTERFACES FUNCIONALES
    Predicate<Integer> esPar = n -> n % 2 == 0;     // Condición
    Function<String, Integer> longitud = s -> s.length(); // Transformación
    Consumer<String> imprimir = System.out::println; // Acción

    // 7. MAPAS
 /*   Map<String, Cliente> mapa = new HashMap<>();
mapa.put("111A", new Cliente(...)); // Insertar
    Cliente c = mapa.get("111A");       // Obtener
mapa.containsKey("111A");           // Verificar clave*/

    // 8. UTILIDADES CLAVE
// Conversión lista ↔ conjunto
    Set<String> sinRepetidos = new HashSet<>(lista);
//    List<String> nuevaLista = new ArrayList<>(conjunto);

    // Lista inmutable (Java 9+)
    List<String> inmutable = List.of("a", "b", "c");

// Ordenar objetos personalizados
/*clientes.sort(Comparator.comparing(Cliente::getEdad)
            .thenComparing(Cliente::getNombre));*/
}
