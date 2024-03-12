package udem.edu.co.controller.impl;

import udem.edu.co.controller.CrearSevenUseCase;
import udem.edu.co.model.impl.HabilidadImpl;

public class CrearHabilidadUseCaseImpl implements CrearSevenUseCase {
    public static HabilidadImpl crearHabilidadDeFuerza() {
        HabilidadImpl habilidadImpl = new HabilidadImpl("Fuerza");
        return habilidadImpl;
    }

    public static HabilidadImpl crearHabilidadDeVolador() {
        HabilidadImpl habilidadImpl = new HabilidadImpl("Volador");
        return habilidadImpl;
    }

    public static HabilidadImpl crearHabilidadDeInmortal() {
        HabilidadImpl habilidadImpl = new HabilidadImpl("Inmortal");
        return habilidadImpl;
    }

    public static HabilidadImpl crearHabilidadDeManipulacionDeEnergia() {
        HabilidadImpl habilidadImpl = new HabilidadImpl("Manipulacion de Energia");
        return habilidadImpl;
    }

    public static HabilidadImpl crearHabilidadDeHabilidadMental() {
        HabilidadImpl habilidadImpl = new HabilidadImpl("Habilidad Mental");
        return habilidadImpl;
    }

    public static HabilidadImpl crearHabilidadDeTransformacionl() {
        HabilidadImpl habilidadImpl = new HabilidadImpl("Transformacion");
        return habilidadImpl;
    }

    public static HabilidadImpl crearHabilidadDeManipulacionMaterial() {
        HabilidadImpl habilidadImpl = new HabilidadImpl("Manipulacion Material");
        return habilidadImpl;
    }

    public static HabilidadImpl crearHabilidadDeVelocidad() {
        HabilidadImpl habilidadImpl = new HabilidadImpl("Velocidad");
        return habilidadImpl;
    }

    public static HabilidadImpl crearHabilidadDeHabilidadConAnimales() {
        HabilidadImpl habilidadImpl = new HabilidadImpl("Habilidad con Animales");
        return habilidadImpl;
    }
}
