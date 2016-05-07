package se_java_travisCI_coveralls;
//### IMPORTS ##############################################################################################################################
public class Ball extends GeometricObject {

	private double radius;
	
	public Ball(double radius) {
		
		//If radius is negativ set it to 0:
		if(radius < 0) {
			this.radius = 0;
		}
		else {
			this.radius = radius;
		}
	}
	
	@Override
	public double getSurfaceArea() {
		//Surface area = 4 * Pi * r^2 :
		return 4 * Mathematics.PI * Mathematics.pow(this.radius);
	}

	@Override
	public double getVolume() {
		//Volume = (4 * Pi * r^3) / 3 :
		return ( 4 * Mathematics.PI * Math.pow(this.radius, 3) ) / 3;
	}

	@Override
	public String toString() {
		return "Object: Ball - Radius: " + this.radius +
			   " - Surface area: " + this.getSurfaceArea() +
			   " - Volume: " + this.getVolume() +
			   " - Surface area to volume ratio: " + this.getSurfaceAreaToVolumeRatio();
	}

}
//### EOF ##################################################################################################################################