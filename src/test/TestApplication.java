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
}
