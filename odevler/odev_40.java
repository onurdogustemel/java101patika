import java.util.Arrays;

public class odev_40 {
	
	static boolean isFound(int[] arr, int value) {
		
		for(int i: arr) {
			if(i == value) {
				return true;
			}
		}
		
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] list = {2,3,3,2,5,8,9,7,7,14,6,6,16,5,5,12,12,4,8,4,12,15,16,14};
		
		int[] duplicate = new int[list.length];
		
		int count = 0;
		
		
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length; j++) {
				
				if(i != j && (list[i]==list[j]) && list[i] % 2 == 0) {
					if(!isFound(duplicate,list[i])) {
						
						duplicate[count++] = list[i];
					}
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(duplicate));
		

	}

}
