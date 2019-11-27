package pokemon.cards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import entities.Card;
import repository.CardsRepository;
@ComponentScan(basePackages={"models","controllers","services","entities"})
@ComponentScan(basePackageClasses={CardsRepository.class})
@EntityScan(basePackages={"entities"})
@SpringBootApplication
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}

}
