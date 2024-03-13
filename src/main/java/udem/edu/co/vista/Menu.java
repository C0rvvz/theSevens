package udem.edu.co.vista;

import udem.edu.co.controller.impl.CrearSevenUseCaseImpl;
import udem.edu.co.model.impl.HabilidadImpl;
import udem.edu.co.model.impl.SevenImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Miercoles 6 de marzo
 *
 * @author CorvvZ
 */
public class Menu {
    private final Scanner scanner;
    private boolean menuMostrado = false;
    private final List<SevenImpl> sevenImpls;
    /**
     * Constructor de la clase Menu que inicializa la lista de superhéroes y el scanner para entrada de datos.
     */
    public Menu() {
        CrearSevenUseCaseImpl crearSevenUseCaseImpl = new CrearSevenUseCaseImpl();
        this.sevenImpls = crearSevenUseCaseImpl.crearSeven();
        this.scanner = new Scanner(System.in);
    }
    /**
     * Método para mostrar un texto en consola.
     * @param texto El texto a mostrar en consola.
     */
    public void listarTexto(String texto) {
        System.out.println(texto);
    }
    /**
     * Método para mostrar una lista de superhéroes en consola.
     * @param sevenImpls La lista de superhéroes a mostrar en consola.
     */
    public void listarSevens(List<SevenImpl> sevenImpls) {
        System.out.println("   ⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄ The Seven Disponibles ⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄\n");
        for (SevenImpl sevenImpl : sevenImpls) {
            System.out.println(sevenImpl.getNombre() + " :> " + sevenImpl.getHabilidades());
        }
    }
    /**
     * Método para listar los superhéroes filtrados por una habilidad específica.
     * @param habilidad La habilidad por la cual se van a filtrar los superhéroes.
     */
    private void listarSevensHabilidad(String habilidad) {
        List<SevenImpl> sevensFiltrados = new ArrayList<>();
        for (SevenImpl theSevenImpl : sevenImpls) {
            for (HabilidadImpl h : theSevenImpl.getHabilidades()) {
                if (h.getHabilidad().equals(habilidad)) {
                    sevensFiltrados.add(theSevenImpl);
                    break;
                }
            }
        }
        listarSevens(sevensFiltrados);
    }
    /**
     * Método para mostrar el menú de opciones en consola y obtener la opción seleccionada por el usuario.
     * @return La opción seleccionada por el usuario.
     */
    public int listarMenu() {
        if (!menuMostrado) {
            System.out.println("⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄ The Sevens ⠄⠄⠄⠄⠄⠄⠄⠄⠄\n");
        }
        System.out.println("1. | Todos los supers                                    |");
        System.out.println("2. | Supers con mucha fuerza                             |");
        System.out.println("3. | Supers que vuelan mucho                             |");
        System.out.println("4. | Supers que son practicamente inmortales             |");
        System.out.println("5. | Supers que pueden manipular la energía              |");
        System.out.println("6. | Supers que manipulan los cerebelos o Telepatia      |");
        System.out.println("7. | Supers que se cambian de forma o se transforman     |");
        System.out.println("8. | Supers con la manipulacion del fuego                |");
        System.out.println("9. | Supers que corren mucho                             |");
        System.out.println("10.| Supers que controlan animales                       |");
        System.out.println("11.| Color de piel blanco                                |");
        System.out.println("11.| Cerrando el programa                                |\n");
        System.out.print("Elija un número: ");
        menuMostrado = true;
        return scanner.nextInt();
    }
    /**
     * Método principal que ejecuta el programa y permite interactuar con el menú de opciones.
     */
    public void correrPrograma() {
        int opcion;
        do {
            opcion = listarMenu();
            switch (opcion) {
                case 1:
                    listarSevens(sevenImpls);
                    break;
                case 2:
                    listarSevensHabilidad("Fuerza");
                    break;
                case 3:
                    listarSevensHabilidad("Volador");
                    break;
                case 4:
                    listarSevensHabilidad("Inmortal");
                    break;
                case 5:
                    listarSevensHabilidad("Manipulacion de Energia");
                    break;
                case 6:
                    listarSevensHabilidad("Habilidad Mental");
                    break;
                case 7:
                    listarSevensHabilidad("Transformacion");
                    break;
                case 8:
                    listarSevensHabilidad("Manipulacion Material");
                    break;
                case 9:
                    listarSevensHabilidad("Velocidad");
                    break;
                case 10:
                    listarSevensHabilidad("Habilidad con Animales");
                case 11:
                    listarSevensHabilidad("Blanco");
                    break;
                case 12:
                    listarTexto("Fin del Programa, Adiós.");
                    break;
                default:
                    listarTexto("¡DIGITE CORRECTAMENTE LOS NÚMEROS!\n");
            }
        } while(opcion != 11);
    }
}
