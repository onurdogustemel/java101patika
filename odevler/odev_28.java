import java.util.Scanner;

public class odev_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int number, total = 0,count;
		
		System.out.print("Deneme sayısını giriniz: ");
		count = input.nextInt();
		
		while (count>0) {
			count--;
			total = 0;
			
			System.out.println("");
			System.out.print("Bir sayı giriniz: ");
			number = input.nextInt();
			
			for (int i = 1; i < number; i++) {
				if(number % i == 0) {
					total+=i;
				}
				
			}
			
			if (total==number) {
				System.out.println(number + " Mükemmel sayıdır.");
			}
			else
				System.out.println(number + " Mükemmel sayı değildir.");
			
		}
		

	}

}
