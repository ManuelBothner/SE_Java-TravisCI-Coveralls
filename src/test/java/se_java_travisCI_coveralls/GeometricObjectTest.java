package se_java_travisCI_coveralls;

import se_java_travisCI_coveralls.GeometricObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import org.junit.Assert;
import org.junit.Test;

//### IMPORTS ##############################################################################################################################
public class GeometricObjectTest {

	
//	@Test(expected=InstantiationException.class)
//	public void testIfClassWellDefined() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//		
//		Class<?> geoObj = GeometricObject.class;
//		
//		//Check if class is abstract:
//		Assert.assertTrue("class must be abstract", Modifier.isAbstract(geoObj.getModifiers()));
//		//Check that class is packet visible:
//		Assert.assertFalse("class must be not private", Modifier.isPrivate(geoObj.getModifiers()));
//		Assert.assertFalse("class must be not public", Modifier.isPublic(geoObj.getModifiers()));
//		Assert.assertFalse("class must be not protected", Modifier.isProtected(geoObj.getModifiers()));
//		
//		//Check there is only one constructor:
//	    Assert.assertEquals("There must be only one constructor", 1, geoObj.getDeclaredConstructors().length);
//	    //Get the declared constructor of the class:
//	    final Constructor<?> constructor = geoObj.getDeclaredConstructor();
//	    //Check that Constructor is not accessible and private:
//	    
//	    System.out.println(Modifier.isProtected(constructor.getModifiers()));
//	    System.out.println(Modifier.isPrivate(constructor.getModifiers()));
//	    System.out.println(Modifier.isPublic(constructor.getModifiers()));
//	    
//	    if (constructor.isAccessible()) {
//	        Assert.fail("Constructor is Acessible");
//	    }
//	    
//	    //The following lines are necessary to get full code coverage:
//	    
//	    //Set the constructor to accessible:
//	    constructor.setAccessible(true);
//	    //Should throw a InstantiationException
//	    constructor.newInstance();
//	    //Set back to not accessible:
//	    constructor.setAccessible(false);
//		
//	}
	
}
//### EOF ##################################################################################################################################