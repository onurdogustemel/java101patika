import java.util.Scanner;
public class odev11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input =new Scanner(System.in);
		
		int temp;
		
		System.out.println("Enter the temperature: ");
		temp=input.nextInt();
		
		if(temp<5) {
			System.out.println("You should go skiing.");
		}
		else if(temp>=5 && temp<15) {
			System.out.println("You should go to the cinema.");
		}
		else if(temp>15 && temp<=25) {
			System.out.println("You should go on a picnic.");
		}
		else
			System.out.println("You should go swimming.");
	}

}
