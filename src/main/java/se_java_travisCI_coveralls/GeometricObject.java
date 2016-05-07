package se_java_travisCI_coveralls;
//### IMPORTS ##############################################################################################################################
public abstract class GeometricObject {
	
	
	public abstract double getSurfaceArea();
	
	public abstract double getVolume();
	
	public abstract String toString();
	
	public double getSurfaceAreaToVolumeRatio() {
		return this.getSurfaceArea() / this.getVolume();
	}
	
}
//### EOF ##################################################################################################################################