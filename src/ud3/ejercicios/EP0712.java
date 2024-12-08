package ud3.ejercicios;

public class EP0712 {
    public static void main(String[] args) {
        Ecuaciones2Grado ecuacion = new Ecuaciones2Grado(1, -3, 2);

        ecuacion.mostrarEcuacion(); 
        ecuacion.mostrarSoluciones(); 

        ecuacion.setX(1);
        ecuacion.setY(2);
        ecuacion.setZ(1);
        ecuacion.mostrarEcuacion(); 
        ecuacion.mostrarSoluciones(); 

        ecuacion.setX(1);
        ecuacion.setY(1);
        ecuacion.setZ(1);
        ecuacion.mostrarEcuacion(); 
        ecuacion.mostrarSoluciones(); 
    }
}
