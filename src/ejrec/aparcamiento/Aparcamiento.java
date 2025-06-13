package ejrec.aparcamiento;

import java.util.*;

public class Aparcamiento {
    private int capacidadMaxima;
    private Vehiculo[] plazas;

    public Aparcamiento() {
        this.capacidadMaxima = 100;
        this.plazas = new Vehiculo[capacidadMaxima];
    }

    public Aparcamiento(int capacidadMaxima) {
        if (capacidadMaxima <= 0) {
            this.capacidadMaxima = 100;
        } else {
            this.capacidadMaxima = capacidadMaxima;
        }
        this.plazas = new Vehiculo[capacidadMaxima];
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public boolean aparcarVehiculo(Vehiculo vehiculo) {
        for (Vehiculo v : plazas) {
            if (v != null && v.getMatricula().equalsIgnoreCase(vehiculo.getMatricula())) {
                System.out.println("El vehículo con matrícula " + vehiculo.getMatricula() + " ya está aparcado.");
                return false;
            }
        }
        for (int i = 0; i < plazas.length; i++) {
            if (plazas[i] == null) {
                plazas[i] = vehiculo;
                System.out.println("Vehículo aparcado en la plaza " + i);
                return true;
            }
        }
        System.out.println("No hay plazas disponibles.");
        return false;
    }

    public boolean sacarVehiculo(Vehiculo vehiculo) {
        for (int i = 0; i < plazas.length; i++) {
            if (plazas[i].getMatricula().equalsIgnoreCase(vehiculo.getMatricula())) {
                plazas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int numPlazasLibres() {
        int plazasLibres = 0;
        for (int i = 0; i < plazas.length; i++) {
            if (plazas[i] == null) {
                plazasLibres++;
            }
        }
        return plazasLibres;
    }

    public void mostrarEstado() {
        for (int i = 0; i < plazas.length; i++) {
            if (plazas[i] == null) {
                System.out.println("L");
            } else {
                System.out.println("O");
            }
        }
    }

    public void mostrarEstadoDetallado() {
        for (int i = 0; i < plazas.length; i++) {
            if (plazas[i] != null) {
                System.out.println("Numero de plaza: " + i);
                System.out.println("Matriícula: " + plazas[i].getMatricula());
            }
        }
    }

    public Vehiculo consultarPlaza(int numeroPlaza) {
        if (plazas[numeroPlaza] == null) {
            return null;
        }
        return plazas[numeroPlaza];
    }

    public int consultarPlazaVehiculo(Vehiculo vehiculo) {
        for (int i = 0; i < plazas.length; i++) {
            if (plazas[i].getMatricula().equalsIgnoreCase(vehiculo.getMatricula())) {
                return i;
            }
        }
        return -1;
    }

    public int[] plazasLibres() {
        int contador = 0;
        int[] libres = new int[contador];
        for (int i = 0; i < plazas.length; i++) {
            if (plazas[i] == null) {
                libres[contador] = i;
                contador++;
            }
        }
        return libres;
    }

    public int[] plazasOcupadas() {
        int contador = 0;
        int[] ocupadas = new int[contador];
        for (int i = 0; i < plazas.length; i++) {
            if (plazas[i] != null) {
                ocupadas[contador] = i;
                contador++;
            }
        }
        return ocupadas;
    }

    public boolean aparcarGrupoVehiculos(List<Vehiculo> vehiculos) {
        for (Vehiculo v : vehiculos) {
            for (Vehiculo plaza : plazas) {
                if (plaza != null) {
                    return false;
                }
            }
        }
        if (vehiculos.size() > numPlazasLibres()) {
            return false;
        } else {
            int indiceVehiculo = 0;
            for (int i = 0; i < plazas.length && indiceVehiculo < vehiculos.size(); i++) {
                if (plazas[i] == null) {
                    plazas[i] = vehiculos.get(indiceVehiculo);
                    indiceVehiculo++;
                }
            }
            return true;
        }
    }

    public boolean sacarGrupoVehiculos(List<Vehiculo> vehiculos) {
        Set<Vehiculo> vehiculosASacar = new HashSet<>(vehiculos);

        for (int i = 0; i < plazas.length && !vehiculosASacar.isEmpty(); i++) {
            Vehiculo v = plazas[i];
            if (v != null && vehiculosASacar.contains(v)) {
                plazas[i] = null;
                vehiculosASacar.remove(v);
            }
        }
        return vehiculosASacar.isEmpty();
    }

    public List<Vehiculo> vehiculosAparcados() {
        List<Vehiculo> aparcados = new ArrayList<>();
        for (int i = 0; i < plazas.length; i++) {
            if (plazas[i] != null) {
                aparcados.add(plazas[i]);
            }
        }
        if (aparcados.isEmpty()){
            return null;
        }
        Collections.sort(aparcados);
        return aparcados;
    }

    public Map<Integer, Vehiculo> plazasVehiculos() {
        Map<Integer, Vehiculo> mapa = new HashMap<>();
        for (int i = 0; i < plazas.length; i++) {
            if (plazas[i] != null) {
                mapa.put(i, plazas[i]);
            }
        }
        if (mapa.isEmpty()) {
            return null;
        }
        return mapa;
    }

    public Map<Vehiculo, Integer> vehiculosPlazas() {
        Map<Vehiculo, Integer> mapa = new HashMap<>();
        for (int i = 0; i < plazas.length; i++) {
            if (plazas[i] != null) {
                mapa.put(plazas[i], i);
            }
        }
        if (mapa.isEmpty()) {
            return null;
        }
        return mapa;
    }
}
