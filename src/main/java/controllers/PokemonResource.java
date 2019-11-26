package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import models.Card;
import services.CardsService;

@RestController
public class PokemonResource {
	
	@Autowired
	private CardsService cardsService;
	@GetMapping("/all")
	public ResponseEntity<List<Card>> getCards(){
		
		return ResponseEntity.ok(cardsService.getAllCards());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Card> getCard(@PathVariable Integer id){
		System.out.println(id);
		return ResponseEntity.ok(cardsService.getCard(id));
	}
	
	@GetMapping("/random")
	public ResponseEntity<Card> getCard(){
		return ResponseEntity.ok(cardsService.getRandomcard());
	}
	
}
