package jp.ac.ascsys.blackJack.model;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

public class MoreThan extends BaseMatcher<Integer> {

	private final int		intExpected;
	Object 					actual;

	MoreThan(int intExpected){
		this.intExpected	= intExpected;
	}

	@Override
	public boolean matches(Object actual) {
		if(!(actual instanceof Integer)) return false;
		Integer actualInt = (Integer)actual;
		return actualInt.compareTo(intExpected) > 0;
	}

	@Override
	public void describeTo(Description desc) {
		desc.appendValue(intExpected);
		desc.appendText(" but actual is ");
		desc.appendValue(actual);
	}

	public static Matcher<Integer>moreThan(int intExpected){
		return new MoreThan(intExpected);
	}

}
