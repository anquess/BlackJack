package jp.ac.ascsys.blackJack.model;

import java.util.ArrayList;
import java.util.List;

public abstract class CardSet {
	protected List<Card> cards = new ArrayList<>();

	public void addCard(Card card) {
		cards.add(card);
	}

	public void addHand(CardSet hand){
		for(Card card:hand.cards){
			cards.add(card);
		}
	}

	public Card removeCard(int i) {
		return cards.remove(i);	//cards.get(i);
	}

	List<Card> getCards() {
		return this.cards;
	}


}
