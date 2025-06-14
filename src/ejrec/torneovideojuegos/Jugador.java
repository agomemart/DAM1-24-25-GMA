package ejrec.torneovideojuegos;

import java.util.Objects;

public class Jugador {
    private String nombre;
    private String nickname;
    private int id;

    public Jugador(String nombre, String nickname, int id) {
        this.nombre = nombre;
        this.nickname = nickname;
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Jugador jugador)) return false;
        return id == jugador.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return nombre + " - " + " - " + nickname + " - " + id;
    }
}
