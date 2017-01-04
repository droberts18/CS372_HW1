import java.util.Scanner;

public class PR1_4 {
	public static void main(String[] args){
		double userWeightInPounds;
		double userHeightInInches;
		double BMI;
		
		System.out.printf("Please enter your weight in pounds: ");
		Scanner input = new Scanner(System.in);
		userWeightInPounds = input.nextDouble();
		System.out.printf("Please enter your height in inches: ");
		userHeightInInches = input.nextDouble();
		
		BMI = (userWeightInPounds*703)/(userHeightInInches * userHeightInInches);
		System.out.printf("Your BMI is %f\n", BMI);
		
		System.out.println("\nBMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal: between 18.5 and 24.9");
		System.out.println("Overweight: between 25 and 29.9");
		System.out.println("Obese: 30 or greater");
	}
}