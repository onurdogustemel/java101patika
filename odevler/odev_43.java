import java.util.Arrays;

public class odev_43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] arr = {
				{1, 2, 3}, 
				{4, 5, 6}, 
				{7, 8, 9}, 
				{10, 11, 12}
				};
		
		int [][] value = new int [arr[0].length][arr.length];
		
		System.out.println("Matris: ");
		
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Transpoze: ");
		
		for (int i = 0; i < value.length; i++) {
			for(int j = 0; j < value[i].length; j++) {
				
				value[i][j] = arr[j][i];
				System.out.print(value[i][j] + " ");
				
			}
			System.out.println();
		}
		
		
		

	}

}
