package jp.ac.ascsys.blackJack.model;

public abstract class Character {
	String name;
	Hand hand;
	public Hand showHand(){
		return this.hand;
	}
	public void addCard(Card card){
		this.hand.addCard(card);
	}
	@Override
	public String toString(){
		return this.name;
	}


}
