package jp.ac.ascsys.blackJack;

import java.util.ArrayList;
import java.util.List;

public class Hand {
	private List<Card> cards = new ArrayList<>();

	public void addCard(Card card) {
		cards.add(card);
	}

	public Card getCard(int i) {
		return cards.get(i);
	}

	public static Hand makeTrump() {
		Hand trump = new Hand();
		for(Suit suit:Suit.values()){
			for(Num num:Num.values()){
				trump.addCard(new Card(suit, num));
			}
		}

		return trump;
	}

	public int getScore() {
		int score = 0;
		for(Card card:this.cards){
			score += card.getNum().getInt(score);
		}
		return score;
	}

}
