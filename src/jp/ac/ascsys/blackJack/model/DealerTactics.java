package jp.ac.ascsys.blackJack.model;

public class DealerTactics implements Tactics {

	@Override
	public Command getCommand(Table table,Character chara) {
		if(chara.getHand().getScore() < 17){
			return Command.HIT;
		}
		return Command.STAND;
	}

}
