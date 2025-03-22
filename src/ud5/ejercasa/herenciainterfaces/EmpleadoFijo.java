package ud5.ejercasa.herenciainterfaces;

public class EmpleadoFijo extends Empleado implements Trabajador {
    private double bono;

    public EmpleadoFijo(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bono;
    }

    public double getBono() {
        return bono;
    }

    @Override
    public String toString() {
        return "EmpleadoFijo{" +
                "nombre='" + getNombre() + '\'' +
                ", salarioBase=" + getSalarioBase() +
                ", bono=" + bono +
                ", salarioTotal=" + calcularSalario() +
                '}';
    }

    @Override
    public void realizarTarea() {

    }
}
