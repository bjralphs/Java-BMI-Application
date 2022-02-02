import java.util.Scanner;

public class ComputeAndInterpretBMI {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

    // Prompt the user to enter weight in pounds
		
		System.out.println("Enter weight in pounds: ");
		double weight = input.nextDouble();
		

    // Prompt the user to enter height in inches
		
		System.out.print("Enter height in feet: ");
		double heightFeet = input.nextDouble();
		System.out.print("Enter height in inches: ");
		double heightInches = input.nextDouble();
		

    // Convert input to inches
		double height = ((heightFeet * 12) + heightInches);

	    final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
	    final double METERS_PER_INCH = 0.0254; // Constant 
	    
	    // Compute BMI
	    double weightInKilograms = weight * KILOGRAMS_PER_POUND; 
	    double heightInMeters = height * METERS_PER_INCH; 
	    double bmi = weightInKilograms / 
	    (heightInMeters * heightInMeters);

	    // Display result
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
