package repository;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import models.Card;

@Repository
public class CardsRepository {
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	
	private static List<String> allCards;
	static{
		File f = new File("F:\\workspace\\cards\\src\\main\\resources\\static\\pokemon_parse_data.csv");
		try {
			allCards = Files.readAllLines(f.toPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Card getCard(){
		Card card = new Card();
		
		namedParameterJdbcTemplate.query("select * from pokemon",rs->{while(rs.next()){
			String name = rs.getString("name");
			int rank = rs.getInt("pokemon_rank");
			System.out.println(name+" : "+rank);
			card.setName(name);
			card.setRank(rank);
		}
		return new HashMap<>();
		});
		return card;
	}
	public Card getCard(int rank){
		return formatCard(rank);
	}
	
	
	public Card formatCard(int rank) {
		// Todo : implement random cards generator method
		String[] card = allCards.get(rank).split(",");System.out.println(rank);
		return new Card(Integer.parseInt(card[0]), card[1], card[2].split(Pattern.quote("|")),
				Integer.parseInt(card[3]), Integer.parseInt(card[4]), Integer.parseInt(card[5]),
				Integer.parseInt(card[6]), Integer.parseInt(card[7]), Integer.parseInt(card[8]),
				Integer.parseInt(card[9]));
	}
	public List<Card> getAllCards() {
		return IntStream.range(1, allCards.size()).mapToObj(i->i).map(i->formatCard(i)).collect(Collectors.toList());
		
	}
}
