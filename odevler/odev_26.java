import java.util.Scanner;

public class odev_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("First number: ");
		int n1 = input.nextInt();
		
		System.out.println("Second number: ");
		int n2 = input.nextInt();
		
		int ebob = 1;
		int ekok = 1;
		int i = n1, j = 1;
		
		// If Statement sayesinde,input ile girilen sayılardan hangisi küçük ise ebob ona göre hesaplanıyor.
		//While döngüsüyle
		
		if(n1 < n2) {
			while(i >= 1) {
				if(n1 % i == 0 && n2 % i == 0) {
					ebob=i;
					break;
				}
				i--;
			}
		}
		else {
			while (i >= 1) {
				if(n1 % i == 0 && n2 % i == 0) {
					ebob=i;
					break;
				}
				i--;
			}
		}
		
		while(j <= n1*n2) {
			if(j % n1 == 0 && j % n2 == 0) {
				ekok = j;
				break;
			}
			j++;
		}
		
		System.out.println("Ebob: " + ebob);
		System.out.println("Ekok: " + ekok);

	}

}
