package ud6;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Util {
    /**
     * ChuletaColecciones.java
     * Resumen práctico de los métodos más útiles de List, Set, Map y Stream en Java.
     * Útil para repasar antes de un examen.
     * @author TuNombre
     */
    public class ChuletaColecciones {

        // =========================
        // MÉTODOS MÁS ÚTILES: LIST
        // =========================
        public static void listMethods() {
            List<String> lista = new ArrayList<>();
            // Añadir elementos
            lista.add("A"); // al final
            lista.add(1, "B"); // en posición concreta
            // Obtener tamaño
            int tam = lista.size();
            // Comprobar si está vacía
            boolean vacia = lista.isEmpty();
            // Acceso posicional
            String elem = lista.get(0);
            // Modificar elemento
            lista.set(0, "C");
            // Eliminar por índice o por objeto
            lista.remove(1);
            lista.remove("C");
            // Buscar índice de un elemento
            int idx = lista.indexOf("A");
            // Sublista
            List<String> sub = lista.subList(0, 1);
            // Contiene elemento
            boolean contiene = lista.contains("A");
            // Limpiar lista
            lista.clear();
            // Convertir a array
            Object[] arr = lista.toArray();
            // Ordenar (requiere Comparable)
            Collections.sort(lista);
            // Ordenar con Comparator
            lista.sort(Comparator.naturalOrder());
        }

        // =========================
        // MÉTODOS MÁS ÚTILES: SET
        // =========================
        public static void setMethods() {
            Set<Integer> conjunto = new HashSet<>();
            // Añadir (no admite repetidos)
            conjunto.add(1);
            conjunto.add(2);
            // Tamaño
            int tam = conjunto.size();
            // Comprobar si está vacío
            boolean vacio = conjunto.isEmpty();
            // Contiene
            boolean contiene = conjunto.contains(1);
            // Eliminar
            conjunto.remove(2);
            // Limpiar
            conjunto.clear();
            // Convertir a array
            Object[] arr = conjunto.toArray();
            // Recorrer (for-each o iterator)
            for (Integer n : conjunto) {
                System.out.println(n);
            }
            // Unión, intersección y diferencia: usar addAll, retainAll, removeAll
            Set<Integer> otro = new HashSet<>(Arrays.asList(2, 3));
            conjunto.addAll(otro);      // unión
            conjunto.retainAll(otro);   // intersección
            conjunto.removeAll(otro);   // diferencia
        }

        // =========================
        // MÉTODOS MÁS ÚTILES: Collection
        // =========================
        public static void collectionMethods() {
            // Instanciamos una colección de ejemplo (ArrayList implementa Collection)
            Collection<String> coleccion = new ArrayList<>();

            // Añadir elementos
            coleccion.add("A"); // Añade un elemento
            // Añadir varios elementos de golpe
            coleccion.addAll(Arrays.asList("B", "C")); // Añade todos los elementos de otra colección

            // Eliminar elementos
            coleccion.remove("A"); // Elimina un elemento (por equals)
            coleccion.removeAll(Arrays.asList("B", "X")); // Elimina todos los que estén en la colección pasada
            coleccion.retainAll(Arrays.asList("C", "D")); // Conserva solo los que estén en la colección pasada
            coleccion.clear(); // Elimina todos los elementos

            // Consultas
            boolean vacia = coleccion.isEmpty(); // ¿Está vacía?
            int tam = coleccion.size(); // Número de elementos
            boolean contiene = coleccion.contains("C"); // ¿Contiene el elemento?
            boolean contieneTodos = coleccion.containsAll(Arrays.asList("C", "D")); // ¿Contiene todos?

            // Conversión
            Object[] array = coleccion.toArray(); // A array de Object
            String[] array2 = coleccion.toArray(new String[0]); // A array del tipo concreto

            // Recorrido
            for (String s : coleccion) { // for-each
                System.out.println(s);
            }
            Iterator<String> it = coleccion.iterator(); // Con iterador
            while (it.hasNext()) {
                String s = it.next();
                // it.remove(); // Se puede eliminar el elemento actual
            }

            // Métodos útiles de Java 8+
            coleccion.forEach(System.out::println); // forEach con Consumer (lambda)

            // Métodos de comparación y hash
            int hash = coleccion.hashCode(); // Hash de la colección
            boolean igual = coleccion.equals(new ArrayList<>()); // Comparación con otra colección

            // Streams (a partir de Java 8)
            coleccion.stream().filter(s -> s.startsWith("C")).forEach(System.out::println);

            // Métodos globales útiles
            // (Ver también Collections para utilidades estáticas)
        }

        // =========================
        // MÉTODOS MÁS ÚTILES: MAP
        // =========================
        public static void mapMethods() {
            Map<String, Integer> mapa = new HashMap<>();
            // Insertar o actualizar
            mapa.put("A", 1);
            // Obtener valor
            Integer val = mapa.get("A");
            // Obtener valor por defecto si no existe
            Integer valDef = mapa.getOrDefault("B", 0);
            // Comprobar si contiene clave o valor
            boolean tieneClave = mapa.containsKey("A");
            boolean tieneValor = mapa.containsValue(1);
            // Eliminar por clave
            mapa.remove("A");
            // Eliminar solo si coincide valor
            mapa.put("B", 2);
            mapa.remove("B", 2);
            // Reemplazar valor solo si existe
            mapa.replace("B", 3);
            // Insertar solo si no existe la clave
            mapa.putIfAbsent("C", 4);
            // Tamaño y vacío
            int tam = mapa.size();
            boolean vacio = mapa.isEmpty();
            // Recorrer claves, valores, pares
            for (String clave : mapa.keySet()) System.out.println(clave);
            for (Integer valor : mapa.values()) System.out.println(valor);
            for (Map.Entry<String, Integer> par : mapa.entrySet())
                System.out.println(par.getKey() + " -> " + par.getValue());
            // Limpiar
            mapa.clear();
        }

        // =========================
        // MÉTODOS MÁS ÚTILES: STREAM
        // =========================
        public static void streamMethods() {
            List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 2, 3);
            // Crear stream
            Stream<Integer> stream = lista.stream();
            // Filtrar
            List<Integer> pares = lista.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
            // Mapear (transformar)
            List<String> cadenas = lista.stream().map(Object::toString).collect(Collectors.toList());
            // Eliminar repetidos
            List<Integer> sinRepetidos = lista.stream().distinct().collect(Collectors.toList());
            // Ordenar
            List<Integer> ordenados = lista.stream().sorted().collect(Collectors.toList());
            // Contar
            long cuantos = lista.stream().count();
            // Suma, media, máximo, mínimo
            int suma = lista.stream().mapToInt(Integer::intValue).sum();
            double media = lista.stream().mapToInt(Integer::intValue).average().orElse(0);
            int max = lista.stream().mapToInt(Integer::intValue).max().orElse(0);
            int min = lista.stream().mapToInt(Integer::intValue).min().orElse(0);
            // Recorrer con forEach
            lista.stream().forEach(System.out::println);
            // Convertir a array
            Integer[] array = lista.stream().toArray(Integer[]::new);
            // Agrupar en mapa (ejemplo: contar repeticiones)
            Map<Integer, Long> conteo = lista.stream()
                    .collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        }

        // =========================
        // GENÉRICOS: Clases, métodos y comodines
        // =========================
        static class Contenedor<T> {
            private T objeto;
            void guardar(T nuevo) { objeto = nuevo; }
            T extraer() { return objeto; }
        }

        static <U> int contarNulos(U[] tabla) {
            int cont = 0;
            for (U e : tabla) if (e == null) cont++;
            return cont;
        }

        static <T extends Number> void imprimirNumeros(Collection<T> col) {
            for (T num : col) System.out.println(num);
        }

        static <T> void imprimirCualquiera(Collection<? extends T> col) {
            for (T elem : col) System.out.println(elem);
        }

        // =========================
        // RESUMEN VISUAL
        // =========================
        public static void main(String[] args) {
            // Solo para que compile y puedas consultar en el IDE/autocompletado
            listMethods();
            setMethods();
            collectionMethods();
            mapMethods();
            streamMethods();

            // Ejemplo de clase genérica
            Contenedor<String> c = new Contenedor<>();
            c.guardar("Hola");
            System.out.println(c.extraer());

            // Ejemplo de método genérico
            Integer[] tabla = {1, null, 2, null, 3};
            System.out.println("Nulos: " + contarNulos(tabla));

            // Ejemplo de comodines
            List<Integer> nums = Arrays.asList(1, 2, 3);
            imprimirNumeros(nums);
            imprimirCualquiera(nums);
        }
    }
}
