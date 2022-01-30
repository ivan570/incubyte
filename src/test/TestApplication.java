package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestApplication {
	@Test
	public void testingJUnit() {
		String str = "testing JUnit";
		assertEquals("testing JUnit", str);
	}
}
