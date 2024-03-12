package udem.edu.co.vista;

import udem.edu.co.controller.impl.CrearSevenUseCaseImpl;
import udem.edu.co.model.impl.HabilidadImpl;
import udem.edu.co.model.impl.SevenImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private boolean menuMostrado = false;
    private List<SevenImpl> sevenImpls;

    public Menu() {
        this.sevenImpls = CrearSevenUseCaseImpl.crearSeven();
        this.scanner = new Scanner(System.in);
    }

    public void listarTexto(String texto) {
        System.out.println(texto);
    }

    public void listarSevens(List<SevenImpl> sevenImpls) {
        System.out.println("   ⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄ The Seven Disponibles ⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄\n");
        for (SevenImpl sevenImpl : sevenImpls) {
            System.out.println(sevenImpl.getNombre() + " ⠄⠄⠄:> " + sevenImpl.getHabilidades());
        }
    }

    private void listarSevensHabilidad(String habilidad) {
        List<SevenImpl> sevensFiltrados= new ArrayList<>();
        for (SevenImpl theSevenImpl : sevenImpls) {
            for (HabilidadImpl h : theSevenImpl.getHabilidades()) {
                if (h.getHabilidad().equals(habilidad)) {
                    sevensFiltrados.add(theSevenImpl);
                    break;
                }
            }
        }
        listarSevens(sevensFiltrados) ;
    }
    public int listarMenu() {
        if (!menuMostrado) {
            System.out.println("⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄ The Sevens ⠄⠄⠄⠄⠄⠄⠄⠄⠄\n");
        }
        System.out.println("1. | Todos los supers que aun no se los lleva el chamuco |");
        System.out.println("2. | Supers con mucha fuerza                             |");
        System.out.println("3. | Supers que vuelan mucho                             |");
        System.out.println("4. | Supers que son practicamente inmortales             |");
        System.out.println("5. | Supers que pueden manipular la energy               |");
        System.out.println("6. | Supers que manipulan los cerebelos o Telepatia      |");
        System.out.println("7. | Supers que se cambian de forma o se transforman     |");
        System.out.println("8. | Supers con la manipulacion de la candela            |");
        System.out.println("9. | Supers que corren mucho                             |");
        System.out.println("10.| Supers que controlan animales o los pescaos         |");
        System.out.println("11.| Chao con Dios                                       |\n");
        System.out.print("Elija un numero parcero, se le tiene lo mas agogo de codigo limpio: ");
        menuMostrado = true;
        return scanner.nextInt();
    }

    public void correrPrograma() {
        int opcion;
        do {
            opcion = listarMenu();
            switch (opcion) {
                case 1:
                    System.out.println(sevenImpls);
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
                    break;
                case 11:
                    listarTexto("Fin del Programa, Adios.");
                    break;
                default:
                    listarTexto("DIGITA CORRECTAMENTE LOS NUMEROS!!\n");
            }
        }

        while(opcion != 11);
    }
}

