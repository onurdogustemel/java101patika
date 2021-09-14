import java.util.Scanner;
public class odev8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in);
		
		int n1,n2,choose;
		
		System.out.println("Enter the first number: ");
		n1=input.nextInt();
		System.out.println("Enter the second number: ");
		n2=input.nextInt();
		
		System.out.println("1-Summation\n2-Substraction\n3-Multiplication\n4-Division");
		System.out.println("Choose a number: ");
		choose=input.nextInt();
		
		switch(choose) {
		
			case 1:
				System.out.println("Summation "+(n1+n2));
				break;
			case 2:
				System.out.println("Substraction " + (n1-n2));
				break;
			case 3:
				System.out.println("Multiplication " + (n1*n2));
				break;
			case 4:
				if(n2==0) {
					System.out.println("A number cannot be divided by 0.");
				}
				else
					System.out.println("Division "+(n1/n2));
				break;
			default:
				System.out.println("Invalid number.");
				
		}

	}

}
