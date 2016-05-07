package se_java_travisCI_coveralls;
//### IMPORTS ##############################################################################################################################
public final class Mathematics {
	
	public static final double PI = 3.141592653589;
	
	
	public static double pow(double base) {
		return base * base;
	}
	
	public static double pow(double base, int exp) {
		
		for(int i = 0; i < exp; i++) {
			base *= base;
		}
		
		return base;
	}
}
//### EOF ##################################################################################################################################