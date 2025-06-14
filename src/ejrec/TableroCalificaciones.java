package ejrec;

public class TableroCalificaciones {
    public static void main(String[] args) {
        double[][] notas = {
                {7.0, 6.5, 8.0, 9.0},  // Estudiante 0
                {5.5, 6.0, 6.5, 7.0},  // Estudiante 1
                {4.0, 5.0, 5.5, 6.0},  // Estudiante 2
                {6.0, 6.0, 6.0, 6.0},  // Estudiante 3
                {9.5, 9.0, 8.5, 10.0}  // Estudiante 4
        };

        for (int i = 0; i < notas.length; i++) {
            boolean aprobado = true;
            for (int j = 0; j < notas[i].length; j++) {
                if (notas[i][j] < 5) {
                    aprobado = false;
                }
            }

            if (aprobado) {
                System.out.println("El estudiante " + i + " ha aprobado todas las asignaturas");
            } else {
                System.out.println("El estudiante " + i + " NO ha aprobado todas las asignaturas");
            }
        }
    }
}
