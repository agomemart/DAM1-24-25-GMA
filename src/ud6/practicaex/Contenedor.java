package ud6.practicaex;

import ud6.apuntescolecciones.Cliente;

public class Contenedor <T>{
    private T objeto;

    public Contenedor() {
        objeto = null;
    }

    public void guardar(T nuevo) {
        objeto = nuevo;
    }

    public T extraer() {
        T res = objeto;
        objeto = null;
        return res;
    }

    public static void main(String[] args) {
        Contenedor<Integer> c1 = new Contenedor<>();
        c1.guardar(42);
        Integer valor = c1.extraer();
        System.out.println(valor);

        Contenedor<String> c2 = new Contenedor<>();
        c2.guardar("Hola");
        String texto = c2.extraer();
        System.out.println(texto);

        Contenedor<Cliente> c3 = new Contenedor<>();
        c3.guardar(new Cliente("Ana"));
        Cliente cliente = c3.extraer();
        System.out.println(cliente.getNombre());
    }
}
