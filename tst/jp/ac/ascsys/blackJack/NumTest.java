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
	@Test
	public void getIntTest() {
		int expected[] = {11,2,3,4,5,6,7,8,9,10,10,10,10};
		int i = 0;
		for(Num sut:Num.values()){
			int actual	= sut.getInt();
			assertThat(actual,is(expected[i]));
			i++;
		}
	}
	@Test
	public void 引数10のgetIntTest(){
		int expected[] = {11,2,3,4,5,6,7,8,9,10,10,10,10};
		int i = 0;
		for(Num sut:Num.values()){
			int actual	= sut.getInt(10);
			assertThat(actual,is(expected[i]));
			i++;
		}
	}
	@Test
	public void 引数0のgetIntTest(){
		int expected[] = {11,2,3,4,5,6,7,8,9,10,10,10,10};
		int i = 0;
		for(Num sut:Num.values()){
			int actual	= sut.getInt(0);
			assertThat(actual,is(expected[i]));
			i++;
		}
	}
	@Test
	public void 引数11のgetIntTest(){
		int expected[] = {1,2,3,4,5,6,7,8,9,10,10,10,10};
		int i = 0;
		for(Num sut:Num.values()){
			int actual	= sut.getInt(11);
			assertThat(actual,is(expected[i]));
			i++;
		}
	}
}
