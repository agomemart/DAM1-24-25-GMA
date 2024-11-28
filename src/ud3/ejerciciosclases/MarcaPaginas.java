package ud3.ejerciciosclases;
/*
 *  Escribe la clase MarcaPagina, que ayuda a llevar el control de la lectura de un
libro. Deberá disponer de métodos para incrementar la página leída, para obtener
información de la última página que se ha leído y para comenzar desde el principio una
nueva lectura del mismo libro.
 */
public class MarcaPaginas {
    int pagina;
    String libro;

    MarcaPaginas (int pagina, String libro) {
        this.pagina = pagina;
        this.libro = libro;
    }

    public void incrementarPagina() {
        pagina++;
    }

    public void comenzarPrincipio() {
        pagina = 0;
    }

    public int getPagina() {
        return this.pagina;
    }

    public void setPagina(int pagina) {
        if (pagina >= 0)
            this.pagina = pagina;
    }

    public static void main(String[] args) {
        MarcaPaginas mp = new MarcaPaginas(0, null);
       
        System.out.println(mp.getPagina());

        mp.incrementarPagina();
        mp.incrementarPagina();
        System.out.println(mp.getPagina());

        mp.comenzarPrincipio();
        System.out.println(mp.getPagina());
    }
}
