package jp.ac.ascsys.blackJack;

public enum Suit {
	SPADE,HEART,DIA,CLUB;
	@Override
	public String toString(){
		return String.valueOf(this.name().charAt(0));
	};
}
