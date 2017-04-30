package jp.ac.ascsys.blackJack;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class NumTest {

	@Test
	public void toStingtest() {
		String expected[] = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		int i = 0;
		for(Num sut:Num.values()){
			String actual	= sut.toString();
			assertThat(actual,is(expected[i]));
			i++;
		}
	}

}
