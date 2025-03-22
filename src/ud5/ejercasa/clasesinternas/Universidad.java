package ud5.ejercasa.clasesinternas;

public class Universidad {
    private String nombre;
    private Estudiante[] estudiantes;
    private int contadorEstudiantes = 0;

    public Universidad(String nombre, int capacidad) {
        this.nombre = nombre;
        this.estudiantes = new Estudiante[capacidad];
    }

    public void agregarEstudiante(String nombre, String carrera) {
        if (contadorEstudiantes < estudiantes.length) {
            estudiantes[contadorEstudiantes] = new Estudiante(nombre, carrera);
            contadorEstudiantes++;
        } else {
            System.out.println("No se pueden agregar más estudiantes.");
        }
    }

    public void mostrarEstudiantes() {
        System.out.println("Lista de estudiantes en " + nombre + ":");
        for (int i = 0; i < contadorEstudiantes; i++) {
            estudiantes[i].mostrarInfo();
        }
    }

    public Estudiante buscarPorNombre(String nombre) {
        for (int i = 0; i < contadorEstudiantes; i++) {
            if (estudiantes[i].nombre.equals(nombre)) {
                return estudiantes[i];
            }
        }
        return null;
    }

    class Estudiante {
        private String nombre;
        private String carrera;

        public Estudiante(String nombre, String carrera) {
            this.nombre = nombre;
            this.carrera = carrera;
        }

        public void mostrarInfo() {
            System.out.println(nombre + ", " + carrera);
        }
    }
    public static void main(String[] args) {
        Universidad uni = new Universidad("Universidad Java", 3);

        uni.agregarEstudiante("Ana", "Ingeniería");
        uni.agregarEstudiante("Carlos", "Matemáticas");
        uni.agregarEstudiante("Elena", "Medicina");

        uni.mostrarEstudiantes();

        Estudiante buscado = uni.buscarPorNombre("Carlos");
        if (buscado != null) {
            System.out.println("Estudiante encontrado:");
            buscado.mostrarInfo();
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }
}
