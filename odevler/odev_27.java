import java.util.Scanner;

public class odev_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int number, big = 0, small = 0;
		
		System.out.println("Kaç tane sayı gireceksiniz: ");
		number = input.nextInt();
		
		for (int i = 1; i <= number; i++) {
			
			System.out.println(i + ". Sayıyı giriniz: " );
			int value = input.nextInt();
			
			if (i == 1) {
				big = value;
				small=value;
				
			}else if (big < value) {
				
				big = value;
				
			}else if (small > value) {
				
				small = value;
			}
			
		}
		
		System.out.println("En büyük sayı: " + big + "\nEn küçük sayı: " + small);

	}

}
