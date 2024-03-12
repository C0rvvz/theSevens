package udem.edu.co.model.impl;

import jakarta.persistence.Table;
import udem.edu.co.model.Seven;

import java.util.List;

@Table(name="Sevens")
public class SevenImpl implements Seven {
    private String nombre;
    private List<HabilidadImpl> habilidades;

    public SevenImpl(String nombre, List<HabilidadImpl> habilidades) {
        this.nombre = nombre;
        this.habilidades = habilidades;
    }

    public SevenImpl() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<HabilidadImpl> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<HabilidadImpl> habilidades) {
        this.habilidades = habilidades;
    }

    @Override
    public String toString() {
        return "Super Heroe (" +
                "nombre='" + nombre + '\'' +
                ", habilidades=" + habilidades + '\'' + ") ";
    }
}
