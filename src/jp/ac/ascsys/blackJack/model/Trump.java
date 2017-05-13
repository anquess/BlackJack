package jp.ac.ascsys.blackJack.model;

public class Trump extends CardSet {

	public static Trump makeTrump() {
		Trump trump = new Trump();
		for(Suit suit:Suit.values()){
			for(Num num:Num.values()){
				trump.addCard(new Card(suit, num));
			}
		}
		return trump;
	}

}
