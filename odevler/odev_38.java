import java.util.Scanner;

public class odev_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		
		int[] list = {15,12,788,1,-1,-778,2,0};
	      
		int min = n;
	    int max = n;

	    for (int i : list) {
	    	
	    	 if(i>n){
	                if(n==max){
	                    max=i;
	                }
	                if(i<max){
	                    max=i;
	                }
	            }
	            if(i<n){
	                if(n==min){
	                    min=i;
	                }
	                if(i>min){
	                    min=i;
	                }
	            }
	    }
	        
	    System.out.println("Girilen sayı: "+ n);
	    System.out.println("Minimum Değer " + min);
	    System.out.println("Maximum Değer " + max);

	}

}
