package pokemon.cards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import repository.CardsRepository;
@ComponentScan(basePackages={"models","controllers","services"})
@ComponentScan(basePackageClasses={CardsRepository.class})
@SpringBootApplication
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}

}
