package jp.ac.ascsys.blackJack.view;

import jp.ac.ascsys.blackJack.model.Player;

public interface ViewInterface {
	public void showTable();
	public void showMoney();
	public void showResult();
	public void InquireBedMoney(Player player);
	public void InqureCommand(Player player);
}
