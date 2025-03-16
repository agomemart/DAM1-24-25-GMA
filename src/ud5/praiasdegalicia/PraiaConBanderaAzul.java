package ud5.praiasdegalicia;

public class PraiaConBanderaAzul extends Praia {
    private boolean banderaAzul;

    public PraiaConBanderaAzul(int id, String nome, String concello, String provincia, double lat, double lon, boolean banderaAzul) {
        super(id, nome, concello, provincia, lat, lon);  // Llamar al constructor de la superclase (Praia)
        this.banderaAzul = banderaAzul;
    }

    public boolean tieneBanderaAzul() {
        return banderaAzul;
    }

    public void setBanderaAzul(boolean banderaAzul) {
        this.banderaAzul = banderaAzul;
    }

    @Override
    public String toString() {
        return super.toString() + (tieneBanderaAzul() ? " - Bandera Azul" : " - Sin Bandera Azul");
    }

    public static PraiaConBanderaAzul[] filtrarConBanderaAzul(Praia[] praias) {
        int count = 0;
        for (Praia p : praias) {
            if (p instanceof PraiaConBanderaAzul && ((PraiaConBanderaAzul) p).tieneBanderaAzul()) {
                count++;
            }
        }

        PraiaConBanderaAzul[] playasConBanderaAzul = new PraiaConBanderaAzul[count];
        int index = 0;
        for (Praia p : praias) {
            if (p instanceof PraiaConBanderaAzul && ((PraiaConBanderaAzul) p).tieneBanderaAzul()) {
                playasConBanderaAzul[index++] = (PraiaConBanderaAzul) p;
            }
        }
        return playasConBanderaAzul;
    }
}
