package ud3.ejercicios;

public class Calendario {
    private int anho, mes, dia;

    public Calendario(int anho, int mes, int dia) {
        this.anho = anho;
        this.mes = mes;
        this.dia = dia;
    }

    public void incrementarDia() {
        dia++;
        if (dia > diasMes(mes, anho)) {
            dia = 1;
            incrementarMes();
        }
    }

    public void incrementarMes() {
        mes++;
        if (mes > 12) {
            mes = 1;
            anho++;
        }
    }

    public void incrementarAnho(int cantidad) {
        anho += cantidad;
        if (anho == 0) {
            anho = cantidad < 0 ? -1 : 1;
        }
    }

    public static int diasMes(int mes, int anho) {
        if (mes < 1 || mes > 12) {
            return -1;
        }
        switch (mes) {
            case 2:
                if (esBisiesto(anho)) {
                    return 29;
                } else {
                    return 28;
                }
            case 4, 6, 9, 11:
                return 30;
            default:
                return 31;
        }
    }

    public static boolean esBisiesto(int anho) {
        return anho % 400 == 0 || (anho % 4 == 0 && anho % 100 != 0);
    }

    public static boolean fechaCorrecta(int anho, int mes, int dia) {
        boolean diaCorrecto, mesCOrrecto, anhoCorrecto;
        anhoCorrecto = (anho > 0);
        mesCOrrecto = (dia >= 1) && (mes <= 12);
        diaCorrecto = (dia >= 1 && dia <= diasMes(mes, anho));
        return diaCorrecto && mesCOrrecto && anhoCorrecto;
    }

    public boolean iguales(Calendario otrafecha) {
        return dia == otrafecha.dia && mes == otrafecha.mes && anho == otrafecha.anho;
        /*
         * boolean iguales= true;
         * if (dia != otrafecha.dia) {
         * iguales = false;
         * } else if (mes != otrafecha.mes) {
         * iguales = false;
         * } else if (anho != otrafecha.anho) {
         * iguales = false;
         * }
         * return iguales;
         */
    }

    public void mostrar() {
        System.out.println(dia + "/" + mes + "/" + anho);
    }

    public int getAnho() {
        return anho;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

}