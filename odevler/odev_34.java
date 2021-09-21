import java.util.Scanner;
public class odev_34 {

	
	static int power(int base,int power) {
		
		if (base == 0) {
			return 0;
		}
		else if(power == 0) {
			return 1;
		}
		else
			return base * power(base, power - 1);			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Taban değeri giriniz : ");
		int base = input.nextInt();
		System.out.print("Üs değerini giriniz : ");
		int power = input.nextInt();
		System.out.println("Sonuç : " + power(base,power));

	}

}
