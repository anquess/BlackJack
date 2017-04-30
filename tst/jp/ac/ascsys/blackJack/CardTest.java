package jp.ac.ascsys.blackJack;

import static jp.ac.ascsys.blackJack.Num.*;
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
}
