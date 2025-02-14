package ud5.clasesejercicios.E0719.maquinaria;

import ud5.clasesejercicios.E0719.personal.Mecanico;

public class Locomotora {
    String matricula;
    int potencia;
    int anhoFabricacion;
    Mecanico mecanico;

    public Locomotora(String matricula, int potencia, int anhoFabricacion, Mecanico mecanico) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.anhoFabricacion = anhoFabricacion;
        this.mecanico = mecanico;
    }

    public String getMatricula() {
        return matricula;
    }
}
