package se_java_travisCI_coveralls;

import static org.junit.Assert.assertEquals;
import se_java_travisCI_coveralls.Sum;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.junit.Assert;
import org.junit.Test;

public class SumTest {

	
	public void testIfClassIsWellDefined(final Class<?> sum) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		//Check if class is final:
		Assert.assertTrue("class must be final", Modifier.isFinal(sum.getModifiers()));
		//Check there is only one constructor:
	    Assert.assertEquals("There must be only one constructor", 1, sum.getDeclaredConstructors().length);
	    //Get the declared constructor of the class:
	    final Constructor<?> constructor = sum.getDeclaredConstructor();
	    //Check that Constructor is not accessible and private:
	    if (constructor.isAccessible() || !Modifier.isPrivate(constructor.getModifiers())) {
	        Assert.fail("Constructor is not private");
	    }
	    
	    //The following lines are necessary to get full code coverage:
	    
	    //Set the constructor to accessible:
	    constructor.setAccessible(true);
	    //Should throw a InstantiationException
	    constructor.newInstance();
	    //Set back to not accessible:
	    constructor.setAccessible(false);
	    
	    //Check if every method of the class is static:
	    for (final Method method : sum.getMethods()) {
	        if (!Modifier.isStatic(method.getModifiers()) && method.getDeclaringClass().equals(sum)) {
	            Assert.fail("there exists a non-static method:" + method);
	        }
	    }
	}
	
    @Test
    public void testClass() throws Exception {
    	
    	//Call function that test the class:
        this.testIfClassIsWellDefined(Sum.class);	    
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