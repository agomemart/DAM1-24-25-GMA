package ud6.practicaex;

import ud6.apuntescolecciones.Cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface Saludo <T> {
    String saludar(T obj);
    Saludo<String> saludoNombre = nombre -> "¡Hola, " + nombre + "!";
    Saludo<Cliente> saludoCliente = c -> "¡Bienvenido, " + c.getNombre() + "!";

    public static <T> List<String> aplicarSaludo(List<T> lista, Saludo<T> saludo) {
        List<String> resultado = new ArrayList<>();
        for (T elem : lista) {
            resultado.add(saludo.saludar(elem));
        }
        return resultado;
    }

    public static void main(String[] args) {
        List<Cliente> clientes = Arrays.asList(new Cliente("Ana"), new Cliente("Luis"));
        List<String> saludos = aplicarSaludo(clientes, saludoCliente);
        saludos.forEach(System.out::println);
    }
}
