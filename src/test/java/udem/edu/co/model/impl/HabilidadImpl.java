package udem.edu.co.model.impl;

import jakarta.persistence.Table;
import udem.edu.co.model.Habilidad;


@Table(name="Habilidades")
public class HabilidadImpl implements Habilidad {
    private String habilidad;

    public HabilidadImpl(String habilidad) {
        this.habilidad = habilidad;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    @Override
    public String toString() {
        return habilidad ;
    }
}
