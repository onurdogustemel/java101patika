import java.util.Scanner;

public class odev_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number;
		double sum = 0.0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		number = input.nextInt();
		
		double[] list = new double[number];
		
		for(int i = 0; i < list.length; i++) {
			
			list[i] = 1.0/(i+1);
		}
		
		for (int j = 0; j < list.length; j++) {
			
			sum += list[j];
			
		}
		
		double harmonicAverage = number/sum;
		
		System.out.println("Harmonik Ortalama: " + harmonicAverage);
	}

}
