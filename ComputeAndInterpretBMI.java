/* Java BMI health application. Program accepts any input for weight and height (feet & inches). 
Program calculates Body Mass Index (BMI) to two decimal places and outputs to console.
*/

import java.util.Scanner;

public class ComputeAndInterpretBMI {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

    		//Console prompts for user weight
		
		System.out.println("Enter weight in pounds: ");
		double weight = input.nextDouble();
		

   		 //Console prompts for user's height in feet & inches
		
		System.out.print("Enter height in feet: ");
		double heightFeet = input.nextDouble();
		System.out.print("Enter height in inches: ");
		double heightInches = input.nextDouble();
		

    		// Converts input to inches
	   	double height = ((heightFeet * 12) + heightInches);
		
    		// Declare variables for calculations

	   	final double KILOGRAMS_PER_POUND = 0.45359237;
	 	final double METERS_PER_INCH = 0.0254;
	    
		// Compute BMI
		double weightInKilograms = weight * KILOGRAMS_PER_POUND; 
		double heightInMeters = height * METERS_PER_INCH; 
		double bmi = weightInKilograms / (heightInMeters * heightInMeters);

		// Output result to console
		System.out.println("BMI is: ");
		System.out.printf("%.2f", bmi);

		if (bmi < 18.5)
			System.out.printf(" Underweight");
		else if (bmi < 25)
			System.out.printf(" Normal");
		else if (bmi < 30)
			System.out.printf(" Overweight");
		else
			System.out.printf(" Obese");
	}
}
