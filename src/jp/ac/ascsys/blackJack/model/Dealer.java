package jp.ac.ascsys.blackJack.model;

import java.util.Collections;

public class Dealer extends Character {
	private Player player;
	private CardSet trump;

	public Dealer(String name) {
		super(name);
		trump = Trump.makeTrump();
		trump = shuffle();
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	private CardSet shuffle(){
		Collections.shuffle(this.trump.getCards());
		return this.trump;
	}

	public Card pickUpCard(){
		return this.trump.removeCard(0);
	}
}
