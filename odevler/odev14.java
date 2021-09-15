import java.util.Scanner;

public class odev14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int km,age,type;
		double perKm = 0.10 , disc24 = 0.10, disc65 = 0.30,newTotal=0;
		boolean isError = false;
		
		System.out.println("Mesafeyi km türünden giriniz : ");
		km=input.nextInt();
		
		System.out.println("Yaşınızı giriniz : ");
		age=input.nextInt();
		
		System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
		type = input.nextInt();
		
		double total1 =km*perKm;
		
		if(km > 0 && age > 0) {
			if(age < 12) {
				newTotal = total1/2;
			}
			else if (age>=12 && age<=24) {
				newTotal = total1*(1-disc24);
			}
			else if (age > 65) {
				newTotal = total1*(1-disc65);
			}
			else
				newTotal=total1;
			
			switch (type) {
				case 1:
					System.out.println("");
					break;
				case 2:
					newTotal=newTotal*(1-0.20)*2;
					break;
				default:
					  isError = true;
			}
				
		}
		else
			isError = true;
		
		if(isError) {
			System.out.println("Hatalı Veri Girdiniz !");
		}
		else {
			System.out.println("Toplam Tutar = " + newTotal + " TL");
		}
		
	}

}
