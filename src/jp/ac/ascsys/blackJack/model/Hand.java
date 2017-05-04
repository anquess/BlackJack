package jp.ac.ascsys.blackJack.model;

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
		boolean haveA = false;
		for(Card card:cards){
			score += card.getNum().getInt(haveA);
			if(card.getNum().getInt(haveA) == 11)haveA=true;
		}
		if(score>22){
			score=0;
			for(Card card:cards){
				score += card.getNum().getInt(true);
			}
		}
		return score;
	}

}
