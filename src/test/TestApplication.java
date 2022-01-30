package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

import main.AddStringNumbers;

public class TestApplication {
	private AddStringNumbers addNumber = new AddStringNumbers();

	@Test
	public void testingJUnit() {
		String str = "testing JUnit";
		assertEquals("testing JUnit", str);
	} // testing JUnit connection

	@Test
	public void nullStringReturnIllegalArgumentException() {
		assertThrows(IllegalArgumentException.class, () -> {
			addNumber.add(null);
		});
	} // null String should return IllegalArgumentException

	@Test
	public void emptyStringReturnZero() {
		assertEquals(0, addNumber.add(""));
	} // empty String should return Zero

	@Test
	public void onlyContainSpaceStringReturnZero() {
		assertEquals(0, addNumber.add("   "));
	} // only contain space String should return Zero

	@Test
	public void stringContainOnlyOneNumberReturnNumberItself() {
		assertEquals(1, addNumber.add("1"));
	} // 05. only contain one integer in the String should return number as it is
		// (Made mistake while committing not write '05. ' prefix)

	@Test
	public void stringContainCommaDelimiterTwoNumberReturnSum() {
		assertEquals(3, addNumber.add("1,2"));
	} // contain two comma Delimiter integer in the String should return Sum of them

	@Test
	public void stringContainCommaAndNewlineDelimiterThreeNumberReturnSum() {
		assertEquals(6, addNumber.add("1\n2,3"));
	} // contain three comma and new line Delimiter integer in the String should return Sum of them
}
