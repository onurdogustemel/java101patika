import java.util.Scanner;

public class odev7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int a,e,d,m,p; // kilogramlar
		double armut=2.14,elma=3.67,domat=1.11,muz=0.95,patli=5.0; // 1 Kilogram fiyati
		
		System.out.println("Armut Kaç Kilo ? :");
		a=input.nextInt();
		System.out.println("Elma Kaç Kilo ? :");
		e=input.nextInt();
		System.out.println("Domates Kaç Kilo ? :");
		d=input.nextInt();
		System.out.println("Muz Kaç Kilo ? :");
		m=input.nextInt();
		System.out.println("Patlıcan Kaç Kilo ? :");
		p=input.nextInt();
		
		double total= armut*a + elma*e + domat*d + muz*m + patli*p;
		
		System.out.println("Toplam Tutar : " + total + " TL");

	}

}
