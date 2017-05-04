package jp.ac.ascsys.blackJack.model;

public class Table {
	private Hand garbage;

	public Table(){
		this.garbage = new Hand();
	}

	public void throwAwayHandForGarbage(Character character){
		garbage.addHand(character.getHand());
		character.clearHand();
	}
	public Hand getGarbage(){
		return this.garbage;
	}
}
