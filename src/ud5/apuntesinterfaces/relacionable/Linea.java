package ud5.apuntesinterfaces.relacionable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Linea implements Relacionable {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    public Linea(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public double longitud() {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
    //Implementación del método abstracto esMayorQue de la interface
    @Override
    public boolean esMayorQue(Relacionable a) {
        if (a == null) {
            return false;
        }
        if (!(a instanceof Linea)) {
            return false;
        }
        Linea linea = (Linea) a;
        return this.longitud() > linea.longitud();
    }
    //Implementación del método abstracto esMenorQue de la interface
    @Override
    public boolean esMenorQue(Relacionable a) {
        if (a == null) {
            return false;
        }
        if (!(a instanceof Linea)) {
            return false;
        }
        Linea linea = (Linea) a;
        return this.longitud() < linea.longitud();
    }
    //Implementación del método abstracto esIgualQue de la interface
    @Override
    public boolean esIgualQue(Relacionable a) {
        if (a == null) {
            return false;
        }
        if (!(a instanceof Linea)) {
            return false;
        }
        Linea linea = (Linea) a;
        return this.longitud() == linea.longitud();
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Coordenadas inicio linea: ");
        sb.append(x1);
        sb.append(" , ");
        sb.append(y1);
        sb.append("\nCoordenadas final linea: ");
        sb.append(x2);
        sb.append(" , ");
        sb.append(y2);
        sb.append("\nLongitud: ");
        sb.append(longitud());
        return sb.toString();
    }

    public static void main(String[] args) {
        Linea l1 = new Linea(2, 2, 4, 1);
        Linea l2 = new Linea(5, 2, 10, 8);
        if (l1.esMayorQue(l2)) {
            System.out.println(l1 + "\nes mayor que" + l2);
        } else {
            System.out.println(l1 + "\nes menor o igual que" + l2);
        }
        ArrayList<Linea> lineas = new ArrayList();
        lineas.add(new Linea(0, 7, 1, 4));
        lineas.add(new Linea(2, -1, 3, 5));
        lineas.add(new Linea(1, 9, 0, -3));
        lineas.add(new Linea(15, 3, 9, 5));
        Collections.sort(lineas, new Comparator<Linea>(){
            @Override
            public int compare(Linea o1, Linea o2) {
                if(o1.esMayorQue(o2)){
                    return 1;
                }else if(o1.esMenorQue(o2)){
                    return -1;
                }else{
                    return 0;
                }
            }
        });
        System.out.println("\nLineas ordenadas por longitud de menor a mayor");
        for (Linea l : lineas) {
            System.out.println(l);
        }
    }


}