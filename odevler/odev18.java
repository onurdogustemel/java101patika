import java.util.Scanner;

public class odev18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int value, sum = 0;
		do {
			System.out.println("Enter a number: ");
			value=input.nextInt();
			// Adds the numbers that are even and multiples of 4.
			if((value % 2 == 0) && (value % 4 == 0)) {
				sum += value;
			}
		}
		while(value % 2 == 0);
		
		System.out.println("Sum: " + sum);
	}

}
