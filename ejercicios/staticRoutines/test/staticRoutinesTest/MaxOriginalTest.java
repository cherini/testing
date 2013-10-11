package staticRoutinesTest;

import static org.junit.Assert.*;

import org.junit.Test;

import staticRoutines.StaticRoutines;

public class MaxOriginalTest {

	@Test
	public void max01() {
		int a = 1;
		int b = 3;
		int res = StaticRoutines.originalMax(a, b);
		assertEquals(b, res);
	}

	@Test
	public void testMax02() {
		int a = 3;
		int b = 1;
		int res = StaticRoutines.originalMax(a, b);
		assertEquals(a, res);
	}
}
