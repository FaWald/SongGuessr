package at.wald.songguesser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The SongGuesserBackendSpringApplication class is the main entry point for the Spring Boot application.
 * It contains the main method that launches the application.
 */
@SpringBootApplication
public class SongGuesserBackendSpringApplication {

	/**
	 * The main method that launches the Spring Boot application.
	 *
	 * @param args The command-line arguments.
	 */
	public static void main(String[] args) {
		SpringApplication.run(SongGuesserBackendSpringApplication.class, args);
	}

}
