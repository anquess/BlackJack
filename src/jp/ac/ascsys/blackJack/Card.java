package jp.ac.ascsys.blackJack;

public class Card {
	private Suit suit;
	private Num num;

	public Card(Suit suit, Num num) {
		super();
		this.suit = suit;
		this.num = num;
	}

	public Suit getSuit() {
		return suit;
	}

	public Num getNum() {
		return num;
	}

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(this.suit.toString());
		sb.append(this.num.toString());
		return sb.toString();
	}


}
