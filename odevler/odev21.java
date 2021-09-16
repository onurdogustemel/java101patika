import java.util.Scanner;

public class odev21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int x,y, total = 1;
		
		System.out.println("Enter the number: ");
		x = input.nextInt();
		
		System.out.println("Enter the power: ");
		y = input.nextInt();
		
		for(int i = 1; i <= y; i++) {
			total*=x;
		}
		
		System.out.println("Result: " + total);

	}

}
