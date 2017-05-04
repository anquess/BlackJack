package jp.ac.ascsys.blackJack.model;

public abstract class Character {
	private String name;
	private Hand hand;

	public Character(String name){
		this.name = name;
		this.hand = new Hand();
	}

	public Hand getHand(){
		return this.hand;
	}
	public void clearHand(){
		this.hand = new Hand();
	}

	public void addCard(Card card){
		this.hand.addCard(card);
	}
	@Override
	public String toString(){
		return this.name;
	}
}
