package jp.ac.ascsys.blackJack;

import static jp.ac.ascsys.blackJack.Face.*;

public class Card {
	private Suit suit;
	private Num num;
	private Face face;

	public Card(Suit suit, Num num) {
		super();
		this.suit = suit;
		this.num = num;
		this.face = UP;
	}

	public Suit getSuit() {
		return suit;
	}

	public Num getNum() {
		return num;
	}
	public void setFace(Face face){
		this.face = face;
	}

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("【");
		if(face==UP){
			sb.append(this.suit.toString());
			sb.append(this.num.toString());
		}else{
			sb.append("**");
		}
		sb.append("】");
		return sb.toString();
	}


}
