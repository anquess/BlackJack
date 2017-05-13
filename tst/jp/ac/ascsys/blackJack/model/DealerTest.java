package jp.ac.ascsys.blackJack.model;

import static jp.ac.ascsys.blackJack.model.LessThan.*;
import static jp.ac.ascsys.blackJack.model.MoreThan.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class DealerTest {

	@Test
	public void ConstructorTest1万回中500回未満() {
		int actual = 0;
		for(int i = 0; i < 10000; i++){
			Dealer sut = new Dealer("Mr.Test");
			if((sut.pickUpCard().getNum() == Num.A)&&(sut.pickUpCard().getSuit() == Suit.SPADE))
				actual++;
		}
		assertThat(actual,is(lessThan(500)));
	}
	@Test
	public void ConstructorTest1万回中100回以上() {
		int actual = 0;
		for(int i = 0; i < 10000; i++){
			Dealer sut = new Dealer("Mr.Test");
			if((sut.pickUpCard().getNum() == Num.A)&&(sut.pickUpCard().getSuit() == Suit.SPADE))
				actual++;
		}
		assertThat(actual,is(moreThan(100)));
	}

}
