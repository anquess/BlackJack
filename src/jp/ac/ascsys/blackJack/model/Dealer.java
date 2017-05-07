package jp.ac.ascsys.blackJack.model;

public class Dealer extends Character {
	private Player player;
	private Hand trump;

	public Dealer(String name) {
		super(name);
		trump = Hand.makeTrump();
		trump = shuffle();
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	private Hand shuffle(){
		Hand shuffledTrump = new Hand();
		for (int i = 0; i < 52; i++) {
			shuffledTrump.addCard(selectRadomCard(52 - i));
		}
		return shuffledTrump;
	}

	private Card selectRadomCard(int i){
		return this.trump.removeCard(new java.util.Random().nextInt(i));
	}
	public Card pickUpCard(){
		return this.trump.removeCard(0);
	}
}
