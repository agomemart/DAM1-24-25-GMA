package contornos.u5;

public class OfertaProveedor {
    private Proveedor proveedor;
    private Articulo articulo;
    private Supermercado supermercado;
    private double pvd;

    public OfertaProveedor(Proveedor proveedor, Articulo articulo, Supermercado supermercado, double pvd) {
        this.proveedor = proveedor;
        this.articulo = articulo;
        this.supermercado = supermercado;
        this.pvd = pvd;
    }

    @Override
    public String toString() {
        return "OfertaProveedor{" +
                "proveedor=" + proveedor +
                ", articulo=" + articulo +
                ", supermercado=" + supermercado +
                ", pvd=" + pvd +
                '}';
    }
}
