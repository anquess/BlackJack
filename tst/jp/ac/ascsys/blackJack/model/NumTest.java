package jp.ac.ascsys.blackJack.model;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

import jp.ac.ascsys.blackJack.model.Num;

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
	@Test
	public void 引数trueのgetIntTest(){
		int expected[] = {1,2,3,4,5,6,7,8,9,10,10,10,10};
		int i = 0;
		for(Num sut:Num.values()){
			int actual	= sut.getInt(true);
			assertThat(actual,is(expected[i]));
			i++;
		}
	}
	@Test
	public void 引数falseのgetIntTest(){
		int expected[] = {11,2,3,4,5,6,7,8,9,10,10,10,10};
		int i = 0;
		for(Num sut:Num.values()){
			int actual	= sut.getInt(false);
			assertThat(actual,is(expected[i]));
			i++;
		}
	}
}
