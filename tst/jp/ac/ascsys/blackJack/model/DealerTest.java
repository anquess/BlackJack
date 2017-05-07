package jp.ac.ascsys.blackJack.model;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class DealerTest {

	@Test
	public void ConstructorTestシャッフルされたトランプがつくられるか() {
		int actual = 0;
		for(int i = 0; i < 10000; i++){
			Dealer sut = new Dealer("Mr.Test");
			if((sut.pickUpCard().getNum() == Num.A)&&(sut.pickUpCard().getSuit() == Suit.SPADE))
				actual++;
		}
		assertThat(actual,is(100));
	}

}
