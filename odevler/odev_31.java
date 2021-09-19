import java.util.Scanner;

public class odev_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int element, n1 = 0, n2 = 1, n3;
		
		System.out.print("Eleman sayısını giriniz: ");
		element = input.nextInt();
		
		System.out.print(n1 + " " + n2);
		
		for (int i = 2; i < element; i++) {
			
				n3 = n1 + n2;
				System.out.print(" " + n3);
				n1 = n2;
				n2 = n3;
		}
	}

}
