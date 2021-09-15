import java.util.Scanner;

public class odev12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("First number: ");
		a=input.nextInt();
		
		System.out.println("Second number: ");
		b=input.nextInt();
		
		System.out.println("Third number: ");
		c=input.nextInt();
		
		if(a < b & a < c) {
			if(b < c) {
				System.out.println("a < b < c");
			}
			else
				System.out.println("a < c < b");
		}
		else if(b < a && b < c) {
			if(a < c) {
				System.out.println("b < a < c");
			}
			else
				System.out.println("b < c < a");
		}
		else {
			if(a < b) {
				System.out.println("c < a < b");
			}
			else
				System.out.println("c < b < a");
		}

	}

}
