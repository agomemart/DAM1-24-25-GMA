package ud6.practicaex;

import java.util.HashMap;
import java.util.Map;

public class MapaNombres {
    public static void main(String[] args) {
        Map<String, Integer> mapaNombreEdad =new HashMap<>();
        mapaNombreEdad.put("Ana", 20);
        mapaNombreEdad.put("Luis", 25);
        mapaNombreEdad.put("Juan", 30);

        System.out.println(mapaNombreEdad);

        mapaNombreEdad.put("Ana", 21);
        mapaNombreEdad.replace("Juan", 30, 31);
        mapaNombreEdad.remove("Luis", 25);

        System.out.println(mapaNombreEdad);

        for (String clave : mapaNombreEdad.keySet()) {
            System.out.println("Clave: " + clave + ", Edad: " + mapaNombreEdad.get(clave));
        }
    }
}
