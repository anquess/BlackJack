package jp.ac.ascsys.blackJack.model;

public class Hand extends CardSet {

	public int getScore() {
		int score = 0;
		boolean haveA = false;
		for(Card card:super.cards){
			score += card.getNum().getInt(haveA);
			if(card.getNum().getInt(haveA) == 11)haveA=true;
		}
		if(score>22){
			score=0;
			for(Card card:super.cards){
				score += card.getNum().getInt(true);
			}
		}
		return score;
	}

}
