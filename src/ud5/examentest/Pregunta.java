package ud5.examentest;

import java.util.Arrays;
import java.util.Objects;

public class Pregunta {
    String enunciadoPregunta;
    String[] listaRespuestas;
    int indiceRespCorrecta;

    public Pregunta(String enunciadoPregunta, String[] listaRespuestas, int indiceRespCorrecta) {
        this.enunciadoPregunta = enunciadoPregunta;
        if (listaRespuestas.length > 1 && listaRespuestas.length <= 3) {
            this.listaRespuestas = Arrays.copyOf(listaRespuestas, listaRespuestas.length);
        } else {
            throw new IllegalArgumentException("La pregunta tiene que tener un mínimo de 2 respuestas a elegir.");
        }
        if (indiceRespCorrecta < 0 || indiceRespCorrecta >= listaRespuestas.length) {
            throw new IllegalArgumentException("La respuesta correcta tiene que estar dentro de la longitud del array.");
        } else {
            this.indiceRespCorrecta = indiceRespCorrecta;
        }
    }

    public boolean corregir(int respuestaUsuario) {
        return respuestaUsuario == indiceRespCorrecta;
    }

    @Override
    public String toString() {
        char letra = 'a';
        String respuestas = "";
        for (int i = 0; i < listaRespuestas.length; i++) {
            respuestas += letra + ") " + listaRespuestas[i] + "\n";
            letra++;
        }
        return enunciadoPregunta + "\n" + respuestas;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Pregunta pregunta)) return false;
        return Objects.equals(enunciadoPregunta, pregunta.enunciadoPregunta) && Objects.deepEquals(listaRespuestas, pregunta.listaRespuestas);
    }

}
