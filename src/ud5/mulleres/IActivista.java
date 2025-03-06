package ud5.mulleres;

public interface IActivista {
    default void getCausaDefendida() {
        System.out.println("Causa");
    }
}
