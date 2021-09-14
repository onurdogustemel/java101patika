import java.util.Scanner;

public class odev5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int r,a;
		double phi=3.14;
		
		System.out.println("Print radius: ");
		r=input.nextInt();
		System.out.println("Print central angle: ");
		a=input.nextInt();
		
		double perimeter = 2*phi*r;
		double area = phi*r*r;
		double sliceArea = (area*a)/360;
		
		System.out.println("Perimeter: " + perimeter);
		System.out.println("Area: " + area);
		System.out.println("The area of a slice of circle: " + sliceArea);

	}

}
