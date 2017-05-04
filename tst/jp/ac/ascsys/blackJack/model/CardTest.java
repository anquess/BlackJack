package jp.ac.ascsys.blackJack.model;

import static jp.ac.ascsys.blackJack.model.Num.*;
import static jp.ac.ascsys.blackJack.model.Suit.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

import jp.ac.ascsys.blackJack.model.Card;
import jp.ac.ascsys.blackJack.model.Num;
import jp.ac.ascsys.blackJack.model.Suit;


public class CardTest {

	@Test
	public void getSuitTest() {
		for(Suit expected:Suit.values()){
			Card sut = new Card(expected,A);
			Suit actual	= sut.getSuit();
			assertThat(actual,is(expected));
		}
	}
	@Test
	public void getNumTest(){
		for(Num expected:Num.values()){
			Card sut = new Card(SPADE,expected);
			Num actual	= sut.getNum();
			assertThat(actual,is(expected));
		}
	}
	@Test
	public void toStringTest(){
		for(Num num:Num.values()){
			Card sut = new Card(HEART,num);
			String actual		= sut.toString();
			String expected	= "【H" + num.toString() + "】";
			assertThat(actual,is(expected));
		}

	}
}

