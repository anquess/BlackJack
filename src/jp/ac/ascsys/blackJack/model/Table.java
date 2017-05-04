package jp.ac.ascsys.blackJack.model;

import jp.ac.ascsys.blackJack.view.ViewInterface;

public class Table {
	private Hand garbage;
	private Dealer dealer;
	private Player player;
	private ViewInterface view;

	public Table(){
		this.garbage = new Hand();
	}

	public Dealer getDealer() {
		return dealer;
	}

	public void setView(ViewInterface view) {
		this.view = view;
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

	public void showTable(){
		view.showTable();
	}
	public void showMoney(){
		view.showMoney();
	}

	public void showResult(){
		view.showResult();
	}
}
