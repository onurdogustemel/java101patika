import java.util.Scanner;

public class odev15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int year,remainder;
		String zodiac = "";
		
		System.out.println("Doğum Yılınızı Giriniz: ");
		year = input.nextInt();
		
		remainder = year % 12;
		
		switch(remainder) {
			case 0:
				zodiac = "Maymun";
				break;
			case 1:
				zodiac = "Horoz";
				break;
			case 2:
				zodiac = "Köpek";
				break;
			case 3:
				zodiac = "Domuz";
				break;
			case 4:
				zodiac = "Fare";
				break;
			case 5:
				zodiac = "Öküz";
				break;
			case 6:
				zodiac = "Kaplan";
				break;
			case 7:
				zodiac = "Tavşan";
				break;
			case 8:
				zodiac = "Ejderha";
				break;
			case 9:
				zodiac = "Yılan";
				break;
			case 10:
				zodiac = "At";
				break;
			case 11:
				zodiac = "Koyun";
				break;
			default:
				System.out.println("Hatalı Giriş.");
		
		}
		
		System.out.println("Çin Zodyağı burcunuz: " + zodiac);

	}

}
