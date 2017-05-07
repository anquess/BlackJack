package jp.ac.ascsys.blackJack.model;

public class Player extends Character {
	private int money;

	public Player(String name) {
		super(name);
		this.money = 100;
	}
}
