package staticRoutinesTest;

import org.junit.*;
import static org.junit.Assert.*;
import staticRoutines.StaticRoutines;

public class MaxTest {

	@Test
	public void max01() {
		int a = 1;
		int b = 3;
		int res = StaticRoutines.max(a, b);
		assertTrue(res == 3);
	}

	@Test
	public void max02() {
		String a = "chau";
		String b = "hola";
		String res = StaticRoutines.max(a, b);
		assertTrue(res == "hola");
	}

	@Test(expected=NullPointerException.class)
	public void max03() {
		Integer a = null;
		Integer b = 3;
		Integer res = StaticRoutines.max(a, b);
	}
	
	@Test
	public void max04() {
		float a = -3;
		float b = 100;
		float res = StaticRoutines.max(a, b);
		assertTrue(res == 100);
	}
	
	@Test
	public void max06() {
		int a = -11;
		int b = -10;
		int res = StaticRoutines.max(a, b);
		assertTrue(res == -10);
	}
	
	@Test(expected=NullPointerException.class)
	public void max07() {
		Integer a = 3;
		Integer b = null;
		Integer res = StaticRoutines.max(a, b);
	}

	@Test(expected=NullPointerException.class)
	public void max08() {
		Comparable a = null;
		Comparable b = new String("hola");
		Comparable res = StaticRoutines.max(a, b);
		
	}
	
	@Test(expected= ClassCastException.class)
	public void max09() {
		Comparable a = new Integer(2);
		Comparable b = new String("hola");
		Comparable res = StaticRoutines.max(a, b);
		
	}

	
	
}
