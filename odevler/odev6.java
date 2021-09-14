import java.util.Scanner;
public class odev6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input =new Scanner(System.in);
		
		double kilo,height;
		
		System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
		height=input.nextDouble();
		System.out.println("Lütfen kilonuzu giriniz : ");
		kilo=input.nextDouble();
		
		double massIndex = kilo/(height*height);
		
		System.out.println("Vücut Kitle İndeksiniz : " + massIndex);

	}

}
