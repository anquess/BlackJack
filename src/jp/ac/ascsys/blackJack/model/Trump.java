package jp.ac.ascsys.blackJack.model;

public class Trump extends CardSet {
	public static CardSet makeTrump() {
		CardSet trump = new CardSet();
		for(Suit suit:Suit.values()){
			for(Num num:Num.values()){
				trump.addCard(new Card(suit, num));
			}
		}
		return trump;
	}

}
