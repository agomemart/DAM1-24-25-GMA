package ud6.practicaex.rankingvideojuegos;

import java.util.ArrayList;
import java.util.List;

public class RankingVideojuegos {
    private List<Videojuego> videojuegos = new ArrayList<>();

    public void agregarVideojuego(Videojuego v1) {
        videojuegos.add(v1);
    }

    public List<Videojuego> listarTop(int n) {
        videojuegos.sort(Videojuego::compareTo);
        return videojuegos.subList(0, n);
    }

    public List<Videojuego> buscarPorPlataforma(String plataforma) {
        List<Videojuego> porPlataforma = new ArrayList<>();
        for (Videojuego vj : videojuegos) {
            if (vj.getPlataforma().equalsIgnoreCase(plataforma)) {
                porPlataforma.add(vj);
            }
        }
        return porPlataforma;
    }
}
