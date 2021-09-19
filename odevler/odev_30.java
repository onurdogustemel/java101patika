import java.util.Scanner;

public class odev_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int number, count = 0;
		
		System.out.print("Enter a number: ");
		number = input.nextInt();
		
		for (int i = 2; i <= number; i++) {
			
			for (int j=1; j <= i;j++) {
				
				if(i % j == 0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.print(i + " ");
				count = 0;
			}
			else
				count = 0;		
		}
		

	}

}
