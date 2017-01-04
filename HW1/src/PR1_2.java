import java.util.Scanner;

public class PR1_2 {
	public static void main(String[] args){
		int userInput;
		final double PI = 3.14;
		double area;
		
		do{
			System.out.println("Please enter the radius of a circle, 0 to exit: ");
			
			Scanner input = new Scanner(System.in);
			userInput = input.nextInt();
			
			if(userInput == 0)
				break;
			
			area = PI*(userInput*userInput);
			
			System.out.printf("The area of the circle is: %f\n", area);
		}while(userInput != 0);
	}
}