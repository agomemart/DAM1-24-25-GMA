package ud3.ejercicios;

/*
 *  Diseñar la clase cuentacorriente, que almacena los datos: DNI y nombre del
titular, asi como el saldo. Las operaciones típicas con una cuenta corriente son:
● Crear una cuenta: se necesita el DNI y nombre del titular. El saldo inicial será 0.
● Sacar dinero: el método debe indicar si ha sido posible llevar a cabo la operación,
si existe saldo suficiente.
● Ingresar dinero: se incrementa el saldo.
● Mostrar información: muestra la información disponible de la cuenta corriente.
 */
public class CuentaCorriente {
    private String dni = "";
    private String nombreTitular = "";
    private double saldo = 0;

    CuentaCorriente(String dni, String nombreTitular) {
        this.dni = dni;
        this.nombreTitular = nombreTitular;
        System.out.println("Cuenta corriente creada correctamente");
    }
    CuentaCorriente(String dni, String nombreTitular, int saldo) {
        this.dni = dni;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
        System.out.println("Cuenta corriente creada correctamente");
    }
    CuentaCorriente(String dni, int saldo) {
        this.dni = dni;
        this.saldo = saldo;
        System.out.println("Cuenta corriente creada correctamente");
    }

    public void crearCuenta(String dni, String nombreTitular) {
       this.dni = dni;
       this.nombreTitular = nombreTitular;
    }

    public void sacarDinero(int cantidadRetirada, double saldo) {
        if (cantidadRetirada > saldo) {
            System.out.println("La cantidad a retirar es mayor al saldo de la cuenta");
        } else {
            saldo = saldo - cantidadRetirada;
            System.out.println("Nuevo saldo: " + saldo);
        }
    }

    public void ingresarDinero(double saldo, double ingreso) {
        if (ingreso > 0) {
        saldo = saldo + ingreso;
        System.out.println("Tu nuevo saldo es de: " + saldo);
        } else {
            System.out.println("Introduce el importe a ingresar correctamente.");
        }
        
    }

    public void mostrarInformacion() {
        System.out.println("Datos de la cuenta:");
        System.out.println("DNI: " + dni);
        System.out.println("Titular: " + nombreTitular);
        System.out.println("Saldo: " + saldo);
    }
    public static void main(String[] args) {
        CuentaCorriente Manolo = new CuentaCorriente("44582365D","Manolo Fernández");
        System.out.println(Manolo);
    }
}
