package udem.edu.co.controller.impl;

import udem.edu.co.controller.CrearSevenUseCase;
import udem.edu.co.model.impl.HabilidadImpl;
import udem.edu.co.model.impl.SevenImpl;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que implementa la interfaz CrearSevenUseCase para crear instancias de superhéroes del grupo Seven.
 *
 * Método estático para crear una lista de superhéroes del grupo Seven con sus respectivas habilidades.
 * @return Una lista de instancias de superhéroes del grupo Seven.
 *
 * Viernes 1 de marzo y Domingo 3 de marzo
 *
 * @author CorvvZ
 */
public class CrearSevenUseCaseImpl implements CrearSevenUseCase {
    /**
     * Método estático para crear una lista de superhéroes del grupo Seven con sus respectivas habilidades.
     * @return Una lista de instancias de superhéroes del grupo Seven.
     */
    public List<SevenImpl> crearSeven(){
        List<SevenImpl> sevenImpls = new ArrayList<>();

        SevenImpl sevenImpl1 = new SevenImpl();
        sevenImpl1.setNombre("Stormfront");
        List<HabilidadImpl> habilidadImplStormfront = new ArrayList<>();
        habilidadImplStormfront.add(CrearHabilidadUseCaseImpl.crearHabilidadDeManipulacionDeEnergia());

        sevenImpl1.setHabilidades(habilidadImplStormfront);
        sevenImpls.add(sevenImpl1);

        SevenImpl sevenImpl2 = new SevenImpl();
        sevenImpl2.setNombre("Starlight");
        List<HabilidadImpl> habilidadImplStarlight = new ArrayList<>();
        habilidadImplStarlight.add(CrearHabilidadUseCaseImpl.crearHabilidadDeFuerza());
        sevenImpl2.setHabilidades(habilidadImplStarlight);
        sevenImpls.add(sevenImpl2);

        SevenImpl sevenImpl3 = new SevenImpl();
        sevenImpl3.setNombre("Homelander");
        List<HabilidadImpl> habilidadImplHomelander = new ArrayList<>();
        habilidadImplHomelander.add(CrearHabilidadUseCaseImpl.crearHabilidadDeFuerza());
        habilidadImplHomelander.add(CrearHabilidadUseCaseImpl.crearHabilidadDeInmortal());
        habilidadImplHomelander.add(CrearHabilidadUseCaseImpl.crearHabilidadDeVolador());
        sevenImpl3.setHabilidades(habilidadImplHomelander);
        sevenImpls.add(sevenImpl3);

        SevenImpl sevenImpl4 = new SevenImpl();
        sevenImpl4.setNombre("Queen Maeve");
        List<HabilidadImpl> habilidadImplQueenMaeve = new ArrayList<>();
        habilidadImplQueenMaeve.add(CrearHabilidadUseCaseImpl.crearHabilidadDeFuerza());
        habilidadImplQueenMaeve.add(CrearHabilidadUseCaseImpl.crearHabilidadDeInmortal());
        sevenImpl4.setHabilidades(habilidadImplQueenMaeve);
        sevenImpls.add(sevenImpl4);

        SevenImpl sevenImpl5 = new SevenImpl();
        sevenImpl5.setNombre("Black Noir");
        List<HabilidadImpl> habilidadImplBlackNoir = new ArrayList<>();
        habilidadImplBlackNoir.add(CrearHabilidadUseCaseImpl.crearHabilidadDeFuerza());
        habilidadImplBlackNoir.add(CrearHabilidadUseCaseImpl.crearHabilidadDeInmortal());
        sevenImpl5.setHabilidades(habilidadImplBlackNoir);
        sevenImpls.add(sevenImpl5);

        SevenImpl sevenImpl6 = new SevenImpl();
        sevenImpl6.setNombre("A-Train");
        List<HabilidadImpl> habilidadImplATrain = new ArrayList<>();
        habilidadImplATrain.add(CrearHabilidadUseCaseImpl.crearHabilidadDeFuerza());
        habilidadImplATrain.add(CrearHabilidadUseCaseImpl.crearHabilidadDeVelocidad());
        sevenImpl6.setHabilidades(habilidadImplATrain);
        sevenImpls.add(sevenImpl6);

        SevenImpl sevenImpl7 = new SevenImpl();
        sevenImpl7.setNombre("The Deep");
        List<HabilidadImpl> habilidadImplTheDeep = new ArrayList<>();
        habilidadImplTheDeep.add(CrearHabilidadUseCaseImpl.crearHabilidadDeHabilidadConAnimales());
        habilidadImplTheDeep.add(CrearHabilidadUseCaseImpl.crearHabilidadDeInmortal());
        sevenImpl7.setHabilidades(habilidadImplTheDeep);
        sevenImpls.add(sevenImpl7);

        SevenImpl sevenImpl8 = new SevenImpl();
        sevenImpl8.setNombre("Mesmer");
        List<HabilidadImpl> habilidadImplMesmer = new ArrayList<>();
        habilidadImplMesmer.add(CrearHabilidadUseCaseImpl.crearHabilidadDeHabilidadMental());
        sevenImpl8.setHabilidades(habilidadImplMesmer);
        sevenImpls.add(sevenImpl8);

        SevenImpl sevenImpl9 = new SevenImpl();
        sevenImpl9.setNombre("Lamplighter");
        List<HabilidadImpl> habilidadImplLamplighter = new ArrayList<>();
        habilidadImplLamplighter.add(CrearHabilidadUseCaseImpl.crearHabilidadDeManipulacionMaterial());
        sevenImpl9.setHabilidades(habilidadImplLamplighter);
        sevenImpls.add(sevenImpl9);

        SevenImpl sevenImpl10 = new SevenImpl();
        sevenImpl10.setNombre("Translucent");
        List<HabilidadImpl> habilidadImplTranslucent = new ArrayList<>();
        habilidadImplTranslucent.add(CrearHabilidadUseCaseImpl.crearHabilidadDeTransformacionl());
        sevenImpl10.setHabilidades(habilidadImplTranslucent);
        sevenImpls.add(sevenImpl10);

        SevenImpl sevenImpl11 = new SevenImpl();
        sevenImpl11.setNombre("Shape-shifter");
        List<HabilidadImpl> habilidadImplShapeShifter = new ArrayList<>();
        habilidadImplShapeShifter.add(CrearHabilidadUseCaseImpl.crearHabilidadDeTransformacionl());
        sevenImpl11.setHabilidades(habilidadImplShapeShifter);
        sevenImpls.add(sevenImpl11);

        return sevenImpls;
    }
}