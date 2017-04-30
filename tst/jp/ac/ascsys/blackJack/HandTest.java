package jp.ac.ascsys.blackJack;

import static jp.ac.ascsys.blackJack.Num.*;
import static jp.ac.ascsys.blackJack.Suit.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class HandTest {
	private Hand sut;

	@Before
	public void setUp(){
		sut = new Hand();
	}
	@Test
	public void handにカード２枚追加して２枚とも同じかtest() {
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
		sut = Hand.makeTrump();
		int i = 0;
		for(Suit suit:Suit.values()){
			for(Num num:Num.values()){
				assertThat(sut.getCard(i).getSuit(),is(suit));
				assertThat(sut.getCard(i).getNum(),is(num));
				i++;
			}
		}
	}

	static class Fixture{
		String	msg;
		Num[]	nums;
		int		expected;

		Fixture(String msg,Num[] nums,int expected){
			this.msg		= msg;
			this.nums		= nums;
			this.expected	= expected;
		}
	}

	@DataPoints
	public static Fixture[] PARAMs ={
			new Fixture("2,3,4,5,6で20",new Num[]{N2,N3,N4,N5,N6}, 20),
			new Fixture("3,4,5,6で18",new Num[]{N3,N4,N5,N6}, 18)	,
			new Fixture("A,Jで21",new Num[]{A,J}, 21),
			new Fixture("A,Aで12",new Num[]{A,A}, 12),
			new Fixture("A,J,5で16",new Num[]{A,J,N5}, 16)
	};

	@Theory
	public void 合計値計算(Fixture p){
		for(Num num:p.nums){
			sut.addCard(new Card(SPADE,num));
		}
		int actual		= sut.getScore();
		int expected	= p.expected;
		assertThat(p.msg,actual,is(expected));
	}

}
