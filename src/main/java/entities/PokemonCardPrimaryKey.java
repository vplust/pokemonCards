package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
@Embeddable
public class PokemonCardPrimaryKey implements Serializable{
	//Todo : implement equals and hashCode method
	private static final long serialVersionUID = 414116945103781857L;

	@Column(name="pokemon_rank")
	private Integer rank;
	
	private String name;
	
	@Override
	public boolean equals(Object o){
		if(o instanceof Card){
			Card c = (Card) o;
			
		}
		return true;
		
	}
	
	@Override
	public int hashCode(){
		return 1;
	}
}
