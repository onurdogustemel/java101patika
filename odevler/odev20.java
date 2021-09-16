import java.util.Scanner;

public class odev20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input =new Scanner(System.in);
		
		int t, u, tFact = 1, uFact = 1, diFact = 1;
		
		System.out.println("First number: ");
		t = input.nextInt();
		
		// Factorial of the first number T
		
		for(int i = 1; i <= t; i++) {
			tFact *= i;
		}
		
		// Factorial of the second number U
		
		System.out.println("Second number: ");
		u = input.nextInt();
		
		for(int j = 1; j <= u; j++) {
			uFact *= j;
		}
		
		// Factorial of (T-U)
		
		for(int k = 1; k <= (t-u); k++) {
			diFact *= k;
		}
		
		int comb = tFact/(uFact*diFact); //Formula of combination

		if(t>u) {
			System.out.println("Result: " + comb);
			
		}
		else
			System.out.println("The first number cannot be smaller than the second number.");
		
	}

}
