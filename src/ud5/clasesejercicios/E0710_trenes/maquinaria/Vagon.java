package ud5.clasesejercicios.E0710_trenes.maquinaria;

class Vagon {
    private int id;
    private int cargaMax;
    private int cargaActual;
    private String tipoMercancia;

    public Vagon(int id, int cargaMax, int cargaActual, String tipoMercancia) {
        this.id = id;
        this.cargaMax = cargaMax;
        this.cargaActual = cargaActual;
        this.tipoMercancia = tipoMercancia;
    }

    @Override
    public String toString() {
        return "Vagon{" +
                "id=" + id +
                ", cargaMax=" + cargaMax +
                ", cargaActual=" + cargaActual +
                ", tipoMercancia='" + tipoMercancia + '\'' +
                '}';
    }
}
