package se_java_travisCI_coveralls;

import static org.junit.Assert.assertEquals;

//### IMPORTS ##############################################################################################################################


public class Main {

	public static void main(String[] args) {

		//Calculate a sum of two integers:
		int a = 10;
		int b = 20;
		
		int sum = Sum.sumInt(a, b);
	
		System.out.println("The sum of a = " + a + " and b = " + b + " is " + sum);
	}
	

}
//### EOF ##################################################################################################################################