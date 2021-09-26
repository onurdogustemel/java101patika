import java.util.Arrays;

public class odev_42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
		int count;
		System.out.println("Dizi : " + Arrays.toString(dizi));
		System.out.println("Tekrar Sayıları");
		
		for (int i = 0; i < dizi.length; i++) {
			
			count = 1;
			
			for ( int j = 0; j < dizi.length; j++) {
				
				if(i == j) {
					
					continue;
				}
				
				if(dizi[i]==dizi[j]) {
					
					if(j<i) {
						
						break;
					}
					count++;
					
				}
					
			}
			if(count >1) {
				System.out.println(dizi[i] + " sayısı "+ count + " kere tekrar edildi.");
			}
		}
	}

}
