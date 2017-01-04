import java.util.Scanner;

public class PR1_1 {
	public static void main(String[] args){
		int userInput;
		
		do{
			System.out.println("Please enter an integer, 0 to exit: ");
		
			Scanner input = new Scanner(System.in);
			userInput = input.nextInt();
		
			if(userInput%2 == 0)
				System.out.println("That is an even integer.");
			else
				System.out.println("That is an odd integer.");
		}while(userInput != 0);
	}
}
