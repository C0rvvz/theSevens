package udem.edu.co.controller.impl;

import udem.edu.co.controller.CrearHabilidadUseCase;
import udem.edu.co.model.impl.HabilidadImpl;

/**
 * Implementación del caso de uso para la creación de habilidades.
 *
 * Lunes 4 de marzo
 *
 * @author CorvvZ
 */
public class CrearHabilidadUseCaseImpl implements CrearHabilidadUseCase {

    private HabilidadImpl habilidad;
    /**
     * Método para crear una habilidad de fuerza.
     * @return La habilidad creada.
     */

    /**
     * Método para crear una habilidad de vuelo.
     *
     * @return La habilidad creada.
     */
    public HabilidadImpl crearHabilidadDeFuerza() {
        this.habilidad.setHabilidad("Fuerza");
        return habilidad;
    }

    public static HabilidadImpl crearHabilidadDeVolador() {
        return new HabilidadImpl("Volador");
    }
    /**
     * Método para crear una habilidad de inmortalidad.
     * @return La habilidad creada.
     */
    public static HabilidadImpl crearHabilidadDeInmortal() {
        return new HabilidadImpl("Inmortal");
    }
    /**
     * Método para crear una habilidad de manipulación de energía.
     * @return La habilidad creada.
     */
    public static HabilidadImpl crearHabilidadDeManipulacionDeEnergia() {
        return new HabilidadImpl("Manipulacion de Energia");
    }
    /**
     * Método para crear una habilidad de habilidad mental.
     * @return La habilidad creada.
     */
    public static HabilidadImpl crearHabilidadDeHabilidadMental() {
        return new HabilidadImpl("Habilidad Mental");
    }
    /**
     * Método para crear una habilidad de transformación.
     * @return La habilidad creada.
     */
    public static HabilidadImpl crearHabilidadDeTransformacionl() {
        return new HabilidadImpl("Transformacion");
    }


    /**
     * Método para crear una habilidad de manipulación material.
     * @return La habilidad creada.
     */
    public static HabilidadImpl crearHabilidadDeManipulacionMaterial() {
        return new HabilidadImpl("Manipulacion Material");
    }
    /**
     * Método para crear una habilidad de velocidad.
     * @return La habilidad creada.
     */
    public static HabilidadImpl crearHabilidadDeVelocidad() {
        return new HabilidadImpl("Velocidad");
    }
    /**
     * Método para crear una habilidad de habilidad con animales.
     * @return La habilidad creada.
     */
    public static HabilidadImpl crearHabilidadDeHabilidadConAnimales() {
        return new HabilidadImpl("Habilidad con Animales");
    }
}

