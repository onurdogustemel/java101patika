import java.util.Scanner;

public class odev17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int j;
		double sum = 0;
		
		System.out.println("Enter a number: ");
		j = input.nextInt();
		
		for(int i = 0; i <= j;i++) {
			if(i%3 == 0 && i%4 == 0) {
				sum += i;
			}
		}
		
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + sum/j);

	}

}
