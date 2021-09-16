import java.util.Scanner;

public class odev19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int n;
		
		System.out.println("Enter a number: ");
		n = input.nextInt();
		
		for(int i = 1; i <= n; i*=4) {
			System.out.println("Power of 4: " + i);
		}
		
		System.out.println("");
		
		for(int j = 1; j <= n; j*=5) {
			System.out.println("Power of 5: " + j);
		}

	}

}
