import java.util.Scanner;

public class odev23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int number;
		double result = 0.0;
		
		System.out.println("Enter a number: ");
		number=input.nextInt();
		
		for(double i = 1; i <= number; i++) {
			
			result += (1/i);
		}
		
		System.out.println("Result is " + result);

	}

}
