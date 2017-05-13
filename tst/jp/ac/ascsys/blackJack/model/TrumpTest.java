package jp.ac.ascsys.blackJack.model;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class TrumpTest {

	@Test
	public void トランプをつくるtest(){
		Trump sut = Trump.makeTrump();
		Card sutCard;
		for(Suit suit:Suit.values()){
			for(Num num:Num.values()){
				sutCard = sut.removeCard(0);
				assertThat(sutCard.getSuit(),is(suit));
				assertThat(sutCard.getNum(),is(num));
			}
		}
	}

}
