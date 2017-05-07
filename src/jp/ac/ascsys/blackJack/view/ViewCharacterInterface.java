package jp.ac.ascsys.blackJack.view;

import jp.ac.ascsys.blackJack.model.Command;
import jp.ac.ascsys.blackJack.model.Hand;
import jp.ac.ascsys.blackJack.model.Table;

public interface ViewCharacterInterface {
	public void showTable(Table table);
	public void showMoney(int haveMoney);
	public void showBedMoney(int betMoney);
	public void InqureCommand(String name,Command command);
	public void showHand(Hand hand);
}
