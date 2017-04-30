package jp.ac.ascsys.blackJack;

import static jp.ac.ascsys.blackJack.Num.*;
import static jp.ac.ascsys.blackJack.Suit.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class HandTest {

	@Test
	public void handにカード２枚追加して２枚とも同じかtest() {
		Hand sut = new Hand();
		Card expectedCard[] = {new Card(DIA, N4),new Card(HEART, J)};
		sut.addCard(expectedCard[0]);
		sut.addCard(expectedCard[1]);
		Card actual;
		int i = 0;
		for(Card expected : expectedCard){
			actual = sut.getCard(i);
			assertThat(actual,is(expected));
			i++;
		}
	}

	@Test
	public void トランプをつくるtest(){
		Hand sut = Hand.makeTrump();
		int i = 0;
		for(Suit suit:Suit.values()){
			for(Num num:Num.values()){
				assertThat(sut.getCard(i).getSuit(),is(suit));
				assertThat(sut.getCard(i).getNum(),is(num));
				i++;
			}
		}
	}

}
