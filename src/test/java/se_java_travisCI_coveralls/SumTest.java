package se_java_travisCI_coveralls;

//### IMPORTS ##############################################################################################################################
import se_java_travisCI_coveralls.Sum;
import static org.junit.Assert.assertEquals;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Assert;
import org.junit.Test;

public class SumTest {

	
	public void isConstructorWellDefined(final Class<?> sum) throws NoSuchMethodException, SecurityException {
		
		//Check there is only one constructor:
	    Assert.assertEquals("There must be only one constructor", 1, sum.getDeclaredConstructors().length);
	    //Get the declared constructor of the class:
	    final Constructor<?> constructor = sum.getDeclaredConstructor();
	    //Check that Constructor is not accessible and private:
	    if (constructor.isAccessible() || !Modifier.isPrivate(constructor.getModifiers())) {
	        Assert.fail("Constructor is not private");
	    }
	}
	
    @Test
    public void testConstructor() throws Exception {
    	
    	//Call function that test the Constructor:
        //this.isConstructorWellDefined(Sum.class);
    	final Class<?> sum = Sum.class;
		//Check there is only one constructor:
	    Assert.assertEquals("There must be only one constructor", 1, sum.getDeclaredConstructors().length);
	    //Get the declared constructor of the class:
	    final Constructor<?> constructor = sum.getDeclaredConstructor();
	    //Check that Constructor is not accessible and private:
	    if (constructor.isAccessible() || !Modifier.isPrivate(constructor.getModifiers())) {
	        Assert.fail("Constructor is not private");
	    }
    	
    	
	    
    }
	
    
    @Test(expected=IllegalAccessException.class)
    public void testConstructorPrivate() throws Exception {
        Sum.class.newInstance();
        Assert.fail("Utility class constructor should be private");
    }
    
    
	@Test
	public void testSumInt() {
		
		int a = 10;
		int b = 20;
		int sum = 30;
		
		assertEquals(Sum.sumInt(a, b), sum);
	}
	
}
//### EOF ##################################################################################################################################