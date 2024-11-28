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
    public String dni = "";
    public String titular = "";
    private double saldo = 0;
    private static String banco;
    private Gestor gestor;

    public Gestor getGestor() {
        return gestor;
    }
    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }
    public CuentaCorriente(String dni, String titular) {
        this.dni = dni;
        this.titular = titular;
    }
    public CuentaCorriente(String dni, String nombreTitular, int saldo) {
        this.dni = dni;
        this.titular = nombreTitular;
        this.saldo = saldo;
    }
    public CuentaCorriente(String dni, int saldo) {
        this.dni = dni;
        this.saldo = saldo;
    }

    public static String getBanco() {
        return banco;
    }

    public static void setBanco(String banco) {
        CuentaCorriente.banco = banco;
    }

    public void crearCuenta(String dni, String nombreTitular) {
       this.dni = dni;
       this.titular = nombreTitular;
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
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente("44582365D","Manolo Fernández", 2000);
        
        CuentaCorriente.setBanco("Abanca");

        System.out.println(CuentaCorriente.getBanco());
        cc.mostrarInformacion();

        Gestor gestor = new Gestor("Gestoria Pepe", "986542145");
        cc.setGestor(gestor);
        System.out.println(cc.getGestor().nombre + cc.getGestor().telefono);
    }
}
