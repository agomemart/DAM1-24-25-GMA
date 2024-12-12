//Adrián Gómez Martínez
package ud2.gmaexamenrec;

public class CosteViaje {
    /*
     * Crea una función que calcula el importe en euros de un viaje en coche en
     * función de los
     * kilómetros del trayecto, el tipo de combustible utilizado (0 = Gasolina, 1 =
     * Diesel, 2 = Electricidad) y el consumo medio por cada 100 km, litros (l) para coches
     * gasolina y diesel o
     * Kilovatios/Hora (kWh) para coches eléctricos.
     * Considera en los cálculos de la función los siguientes precios medios en
     * euros de los
     * distintos combustibles, según Diesel o Gasolina y ESIOS red eléctrica :
     * ● Gasolina, Sin plomo 95: 1,521 € / litro
     * ● Diesel, Gasóleo A: 1,435 € / litro
     * ● Electricidad, kWh: 0,16591 € / kWh
     * Utiliza el siguiente prototipo implementar para la función.
     */

    public static double importeViaje(double km, byte tipoCombustible, double consumoMedio) {
        final double PRECIO_GASOLINA = 1.521;
        final double PRECIO_GASOLEO = 1.435;
        final double PRECIO_ELECTRICIDAD = 0.16591;

        switch (tipoCombustible) {
            case 0:
                return (consumoMedio * km / 100) * PRECIO_GASOLINA;
            case 1:
                return (consumoMedio * km / 100) * PRECIO_GASOLEO;
            case 2:
                return (consumoMedio * km / 100) * PRECIO_ELECTRICIDAD;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(importeViaje(100, (byte) 2, 15));
    }
}
