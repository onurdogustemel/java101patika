import java.util.Scanner;

public class odev4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int km;
		double perKm=2.20, total=10;
		
		System.out.println("Print KM: ");
		km=input.nextInt();
		
		total += km*perKm;
	
		total = total < 20 ? 20 : total;
		
		System.out.println("Total price: " + total);
	}

}
