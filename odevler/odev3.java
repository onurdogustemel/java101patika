import java.util.Scanner;

public class odev3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
				
		Scanner input = new Scanner(System.in);
		System.out.println("First side length: ");
		a=input.nextInt();
		System.out.println("Second side length: ");
		b=input.nextInt();
		System.out.println("Third side length: ");
		c=input.nextInt();
		
		if(a<=0 && b<=0 && c<=0) {
			System.out.println("Side lengths cannot be less than or equal to zero.");
			return;
		}
		
		double u= (a+b+c)/2;
		double perimeter=2*u;
		double area = Math.sqrt(u*(u-a)*(u-a)*(u-c));
		
		System.out.println("Perimeter: "+area);
		System.out.println("Area: "+area);
	}

}
