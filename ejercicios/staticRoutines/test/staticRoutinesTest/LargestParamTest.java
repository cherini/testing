package staticRoutinesTest;

import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;

import staticRoutines.StaticRoutines;

@RunWith(Parameterized.class)
public class LargestParamTest {

	private Integer [] array;
	private Integer res;
	
	public LargestParamTest(Object [] array, Object res) {
		this.array = (Integer[]) array;
		this.res = (Integer) res;
	}
	
	@Parameters
	public static Collection<Object[]> firstValues() {
	 return Arrays.asList(new Object[][] {
	   {new Integer [] { 1,2,3 }, 3 },
	   {new Integer [] { 2,1,3 }, 3 },
	   {new Integer [] { 3,1,2 }, 3 }
	 });
	}
	
	@Test(timeout=1000)
	public void testFirst() {
		int max = StaticRoutines.largest((Integer[]) array);
		org.junit.Assert.assertTrue(res == max);
	}

}

