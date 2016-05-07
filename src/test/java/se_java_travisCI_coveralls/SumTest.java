package se_java_travisCI_coveralls;

import static org.junit.Assert.assertEquals;
import se_java_travisCI_coveralls.Sum;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import org.junit.Assert;
import org.junit.Test;

public class SumTest {

	
	public void isConstructorWellDefined(final Class<?> sum) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		//Check there is only one constructor:
	    Assert.assertEquals("There must be only one constructor", 1, sum.getDeclaredConstructors().length);
	    //Get the declared constructor of the class:
	    final Constructor<?> constructor = sum.getDeclaredConstructor();
	    //Check that Constructor is not accessible and private:
	    if (constructor.isAccessible() || !Modifier.isPrivate(constructor.getModifiers())) {
	        Assert.fail("Constructor is not private");
	    }
	    constructor.setAccessible(true);
	    constructor.newInstance();
	    constructor.setAccessible(false);
	    
	}
	
    @Test
    public void testConstructor() throws Exception {
    	
    	//Call function that test the Constructor:
        this.isConstructorWellDefined(Sum.class);	    
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