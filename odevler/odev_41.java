import java.util.Scanner;
import java.util.Arrays;

public class odev_41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int n;
		
		System.out.print("Dizinin boyutu n : ");
		n = input.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Dizinin elemanlarını giriniz :");
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.print((i+1) + ". Elemanı : ");
			int elements = input.nextInt();
			
			arr[i] = elements;
		}
		
		Arrays.sort(arr);
		System.out.print("Sıralama : ");
		for (int i: arr) {
			System.out.print(i +" ");
		}

	}

}
