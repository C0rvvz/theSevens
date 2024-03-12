package udem.edu.co.theSevens;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import udem.edu.co.vista.Menu;

@SpringBootTest
class TheSevensApplicationTests {

	@Test
	void contextLoads() {
		
	}
	public static void main(String[] args) {

		Menu menu = new Menu();

		menu.correrPrograma();

		SpringApplication.run(TheSevensApplication.class, args);
	}
}
