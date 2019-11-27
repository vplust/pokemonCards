package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pokemons")
public class Card implements Serializable{
	@EmbeddedId
	private PokemonCardPrimaryKey pokemonCardKey;
	private String[] type;
	private Integer total;
	private Integer hp;
	private Integer attack;
	private Integer defence;
	private Integer spAttack;
	private Integer spDefence;
	private Integer speed;

	public String[] getType() {
		return type;
	}

	public void setType(String[] type) {
		this.type = type;
	}

	public Card(String[] type, Integer total, Integer hp, Integer attack, Integer defence,
			Integer spAttack, Integer spDefence, Integer speed) {
		super();
		
		this.type = type;
		this.total = total;
		this.hp = hp;
		this.attack = attack;
		this.defence = defence;
		this.spAttack = spAttack;
		this.spDefence = spDefence;
		this.speed = speed;
	}

	public Card() {
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getHp() {
		return hp;
	}

	public void setHp(Integer hp) {
		this.hp = hp;
	}

	public Integer getAttack() {
		return attack;
	}

	public void setAttack(Integer attack) {
		this.attack = attack;
	}

	public Integer getDefence() {
		return defence;
	}

	public void setDefence(Integer defence) {
		this.defence = defence;
	}

	public Integer getSpAttack() {
		return spAttack;
	}

	public void setSpAttack(Integer spAttack) {
		this.spAttack = spAttack;
	}

	public Integer getSpDefence() {
		return spDefence;
	}

	public void setSpDefence(Integer spDefence) {
		this.spDefence = spDefence;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}


}
