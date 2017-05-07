package jp.ac.ascsys.blackJack.model;

public class Table {
	private Hand garbage;
	private Dealer dealer;
	private Player player;

	public Table(){
		this.garbage = new Hand();
	}

	public Dealer getDealer() {
		return dealer;
	}

	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public void throwAwayHandForGarbage(Character character){
		garbage.addHand(character.getHand());
		character.clearHand();
	}
	public Hand getGarbage(){
		return this.garbage;
	}

}
