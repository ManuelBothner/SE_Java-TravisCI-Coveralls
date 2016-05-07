package se_java_travisCI_coveralls;

import java.lang.reflect.Modifier;

import org.junit.Assert;
import org.junit.Test;

//### IMPORTS ##############################################################################################################################
public class GeometricObjectTest {

	
	@Test
	public void testIfClassWellDefined() {
		
		Class<?> geoObj = GeometricObject.class;
		
		//Check if class is abstract:
		Assert.assertTrue("class must be abstract", Modifier.isAbstract(geoObj.getModifiers()));
	}
	
	@Test
	public void testGetSurfaceAreaToVolumeRatio() {
		
	}
}
//### EOF ##################################################################################################################################