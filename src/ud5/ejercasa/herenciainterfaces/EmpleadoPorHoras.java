package ud5.ejercasa.herenciainterfaces;

public class EmpleadoPorHoras extends Empleado implements Trabajador{
    private int horasTrabajadas;
    private final double pagoPorHora;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double pagoPorHora) {
        super(nombre, 0);
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }


    @Override
    public double calcularSalario() {
        return pagoPorHora * horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double getPagoPorHora() {
        return pagoPorHora;
    }

    @Override
    public String toString() {
        return "EmpleadoPorHoras{" +
                "nombre='" + getNombre() + '\'' +
                ", horasTrabajadas=" + horasTrabajadas +
                ", pagoPorHora=" + pagoPorHora +
                ", salarioTotal=" + calcularSalario() +
                '}';
    }

    @Override
    public void realizarTarea() {

    }
}
