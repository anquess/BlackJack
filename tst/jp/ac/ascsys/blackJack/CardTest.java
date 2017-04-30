package jp.ac.ascsys.blackJack;

import static jp.ac.ascsys.blackJack.Num.*;
import static jp.ac.ascsys.blackJack.Suit.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;


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

