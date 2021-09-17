import java.util.Scanner;
public class odev22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int num,diff,result = 0;
		
		
		System.out.println("Enter a number: ");
		num = input.nextInt();
		
		while(num != 0) {
			diff = num % 10;
			result += diff; 
			num /= 10;
		}
		
		System.out.println("Result: " + result);

	}

}
