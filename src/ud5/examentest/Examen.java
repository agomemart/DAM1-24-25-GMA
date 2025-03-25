package ud5.examentest;

import java.util.Arrays;

public class Examen {
    String titulo;
    Pregunta[] preguntas;

    public Examen(String titulo) {
        this.titulo = titulo;
        this.preguntas = new Pregunta[0];
    }

    public void addPregunta(Pregunta pregunta) {
        for (int i = 0; i < preguntas.length; i++) {
            if (preguntas[i].equals(pregunta)) {
                System.out.println("La pregunta ya ha sido añadida anteriormente.");
                return;
            }
        }
        preguntas = Arrays.copyOf(preguntas, preguntas.length + 1);
        preguntas[preguntas.length - 1] = pregunta;
    }

    public int numPreguntas() {
        return preguntas.length;
    }

    @Override
    public String toString() {
        String resultado = titulo + "\n";
        for (int i = 0; i < preguntas.length; i++) {
            resultado += (i + 1) + ". " + preguntas[i].toString() + "\n";
        }
        return resultado;
    }
}
