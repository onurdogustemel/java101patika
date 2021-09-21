import java.util.Scanner;

public class odev_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		sdfdsfdsfg
		int number;
		
		System.out.println("Enter a number: ");
		number = input.nextInt();
		
		for (int i = number; i >= 0 ; i--) {
            for (int j = (number - i); j > 0 ; j--) {
                System.out.print(" ");
            }
            for (int k = (2 * i + 1); k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

	}

}
