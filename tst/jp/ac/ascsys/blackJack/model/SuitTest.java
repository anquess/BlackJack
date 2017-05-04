package jp.ac.ascsys.blackJack.model;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

import jp.ac.ascsys.blackJack.model.Suit;

public class SuitTest {
	@Test
	public void toStingtest() {
		String expected[] = {"S","H","D","C"};
		int i = 0;
		for(Suit sut:Suit.values()){
			String actual	= sut.toString();
			assertThat(actual,is(expected[i]));
			i++;
		}
	}

}
