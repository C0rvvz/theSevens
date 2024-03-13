package udem.edu.co.model.impl;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import udem.edu.co.model.Habilidad;

/**
 * Clase que representa una habilidad.
 *
 * Viernes 1 de marzo
 *
 * @author CorvvZ
 */

public class HabilidadImpl implements Habilidad {
    private String habilidad;
    /**
     * Constructor de la clase HabilidadImpl.
     * @param habilidad La habilidad.
     */
    public HabilidadImpl(String habilidad) {
        this.habilidad = habilidad;
    }
    /**
     * Método para obtener la habilidad.
     * @return La habilidad.
     */
    public String getHabilidad() {
        return habilidad;
    }
    /**
     * Método para establecer la habilidad.
     * @param habilidad La nueva habilidad.
     */
    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }


    /**
     * Método toString para representar la habilidad como una cadena de texto.
     * @return Una representación en cadena de la habilidad.
     */
    @Override
    public String toString() {
        return habilidad ;
    }


}
