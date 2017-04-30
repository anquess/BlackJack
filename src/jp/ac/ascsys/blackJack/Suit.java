package jp.ac.ascsys.blackJack;

public enum Suit {
	SPADE,HEART,DIA,CLUB;
	public String toString(){
		return String.valueOf(this.name().charAt(0));
	};
}
