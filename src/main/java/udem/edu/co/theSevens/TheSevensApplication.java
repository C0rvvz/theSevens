package udem.edu.co.theSevens;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import udem.edu.co.vista.Menu;

/**
 * Clase principal que inicia la aplicación The Sevens
 *
 * Martes 5 de marzo
 *
 * @author CorvvZ
 */
@SpringBootApplication
public class TheSevensApplication {
	/**
	 * Método principal que inicia la aplicación
	 * @param args Argumentos de línea de comandos
	 */
	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.correrPrograma();
		SpringApplication.run(TheSevensApplication.class, args);
	}
}