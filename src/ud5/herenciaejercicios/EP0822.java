package ud5.herenciaejercicios;

class ObjetoParaGc {
    private int id;

    public ObjetoParaGc(int id) {
        this.id = id;
    }

    protected void finalice() throws Throwable {
        System.out.println("Objeto con ID: " + id + " recolectado por el GC.");
    }
}
public class EP0822 {
    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++) {
            new ObjetoParaGc(i);
        }

        System.gc();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Fin programa");
    }
}
