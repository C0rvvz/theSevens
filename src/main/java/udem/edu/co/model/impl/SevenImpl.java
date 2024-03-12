package udem.edu.co.model.impl;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import udem.edu.co.model.Seven;
import java.util.List;

/**
 * Clase que representa un superhéroe.
 *
 * Viernes 1 de marzo
 *
 * @author CorvvZ
 */
@Getter
@Setter
@Data
@Table(name="Sevens")
public class SevenImpl implements Seven {
    private String nombre;
    private List<HabilidadImpl> habilidades;
    /**
     * Constructor de la clase SevenImpl.
     * @param nombre El nombre del superhéroe.
     * @param habilidades La lista de habilidades del superhéroe.
     */
    public SevenImpl(String nombre, List<HabilidadImpl> habilidades) {
        this.nombre = nombre;
        this.habilidades = habilidades;
    }
    /**
     * Constructor por defecto de la clase SevenImpl.
     */
    public SevenImpl() {
    }
    /**
     * Método para obtener el nombre del superhéroe.
     * @return El nombre del superhéroe.
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Método para establecer el nombre del superhéroe.
     * @param nombre El nuevo nombre del superhéroe.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Método para obtener la lista de habilidades del superhéroe.
     * @return La lista de habilidades del superhéroe.
     */
    public List<HabilidadImpl> getHabilidades() {
        return habilidades;
    }
    /**
     * Método para establecer la lista de habilidades del superhéroe.
     * @param habilidades La nueva lista de habilidades del superhéroe.
     */
    public void setHabilidades(List<HabilidadImpl> habilidades) {
        this.habilidades = habilidades;
    }
    /**
     * Método toString para representar el superhéroe como una cadena de texto.
     * @return Una representación en cadena del superhéroe.
     */
    @Override
    public String toString() {
        return "Superhéroe (" +
                "nombre='" + nombre + '\'' +
                ", habilidades=" + habilidades + '\'' + ") ";
    }
}
