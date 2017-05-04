package jp.ac.ascsys.blackJack.model;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class TableTest {

	@Test
	public void throwAwayHandForGarbageTest() {
		// Arrange
		Character chara = new Character("Test"){};
		Card expectCard = new Card(Suit.SPADE, Num.A);
		chara.addCard(expectCard);
		chara.addCard(expectCard);
		Table sut = new Table();

		// Actual
		sut.throwAwayHandForGarbage(chara);

		// Assert
		for(Card card:sut.getGarbage().getCards()){
			assertThat(card, is(expectCard));
		}


	}

}
