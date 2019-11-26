package services;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import models.Card;
import repository.CardsRepository;

@Service
public class CardsService {
	@Autowired
	CardsRepository cardsRepository;

	public List<Card> getAllCards(){
		return cardsRepository.getAllCards();
	}
	public Card getRandomcard(){
		int random = new Random().nextInt(150);
		return cardsRepository.formatCard(random);
	}
	
	public Card getCard(int rank){
		return cardsRepository.getCard(rank);
	}

}
