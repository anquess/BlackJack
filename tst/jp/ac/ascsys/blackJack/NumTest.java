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
	public void getNumTest() {
		int expected[] = {11,2,3,4,5,6,7,8,9,10,10,10,10};
		int i = 0;
		for(Num sut:Num.values()){
			int actual	= sut.getNum();
			assertThat(actual,is(expected[i]));
			i++;
		}
	}
	@Test
	public void 引数10のgetNumTest(){
		int expected[] = {11,2,3,4,5,6,7,8,9,10,10,10,10};
		int i = 0;
		for(Num sut:Num.values()){
			int actual	= sut.getNum(10);
			assertThat(actual,is(expected[i]));
			i++;
		}
	}
	@Test
	public void 引数0のgetNumTest(){
		int expected[] = {11,2,3,4,5,6,7,8,9,10,10,10,10};
		int i = 0;
		for(Num sut:Num.values()){
			int actual	= sut.getNum(0);
			assertThat(actual,is(expected[i]));
			i++;
		}
	}
	@Test
	public void 引数11のgetNumTest(){
		int expected[] = {1,2,3,4,5,6,7,8,9,10,10,10,10};
		int i = 0;
		for(Num sut:Num.values()){
			int actual	= sut.getNum(11);
			assertThat(actual,is(expected[i]));
			i++;
		}
	}
}
