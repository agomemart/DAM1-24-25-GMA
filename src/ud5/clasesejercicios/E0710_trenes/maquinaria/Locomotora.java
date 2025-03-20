package ud5.clasesejercicios.E0710_trenes.maquinaria;

import ud5.clasesejercicios.E0710_trenes.personal.Mecanico;

public class Locomotora {
    private String matricula;
    private int potenciaMotores;
    private int añoFabricacion;
    Mecanico mecanico;

    public Locomotora(String matricula, int potenciaMotores, int añoFabricacion, Mecanico mecanico) {
        this.matricula = matricula;
        this.potenciaMotores = potenciaMotores;
        this.añoFabricacion = añoFabricacion;
        this.mecanico = mecanico;
    }

    @Override
    public String toString() {
        return "Locomotora{" +
                "matricula='" + matricula + '\'' +
                ", potenciaMotores=" + potenciaMotores +
                ", añoFabricacion=" + añoFabricacion +
                ", mecanico=" + mecanico +
                '}';
    }
}
