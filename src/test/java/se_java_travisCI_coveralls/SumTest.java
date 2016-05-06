package se_java_travisCI_coveralls;
//### IMPORTS ##############################################################################################################################
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumTest {

	
	@Test
	public void testSumInt() {
		
		int a = 10;
		int b = 20;
		int sum = 30;
		
		assertEquals(Sum.sumInt(a, b), sum);
	}
}
//### EOF ##################################################################################################################################