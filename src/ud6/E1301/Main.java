package ud6.E1301;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Saludo<String> saludoString;

        saludoString = new Saludo<String>() {
            @Override
            public String saludar(String str) {
                return "Hola " + str;
            }
        };

       saludoString = (cadena) -> "Hola " + cadena;

        //saludo<Cliente> saludoCliente = (c) -> "Buenos días " + c.getNombre();

        System.out.println(saludoString.saludar("Pepe"));;
        //saludoCliente.saludar(new Cliente("María"))

        //Llamada método E1302
        String[] tString = {"Pepe", "María", "Marcos"};
        List<String> saludos = saludar(saludoString, tString);
        System.out.println(saludos);
    }

    //Método E1302
    static <T> List<String> saludar(Saludo<T> s, T[] t) {
        List<String> saludos = new ArrayList<>();

        for (T e : t) {
            saludos.add(s.saludar(e));
        }

        return saludos;
    }

    static <T> T max(T[] t, Comparator<T> c) {
        Arrays.sort(t, c);
        return t[t.length -1];
    }
}
