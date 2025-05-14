package ud7.empresas;

import java.util.Objects;

public class Empresa {
    private int id;
    private String nombre;
    private String web;

    public Empresa(int id, String nombre, String web) {
        this.id = id;
        this.nombre = nombre;
        this.web = web;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getWeb() {
        return web;
    }

    public Empresa(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id + " - " + nombre + " ('" + web + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Empresa empresa)) return false;
        return id == empresa.id && Objects.equals(nombre, empresa.nombre) && Objects.equals(web, empresa.web);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, web);
    }
}
