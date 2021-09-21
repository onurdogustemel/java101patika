import java.util.Scanner;
public class odev_35 {

	 static boolean isPrime(int n, int k) {
		  if (n == 1) {
			  
			  return false;
			  
		  }else if (n == k || n == 2) {
			  
			  return true;
			  
		  }else if (n % k == 0) {
			  
			  return false;
			  
		  }
		  return isPrime(n,k+1);
				  
	    }

	    public static void main(String[] args) {
	        
	    	Scanner input = new Scanner(System.in);
		    System.out.print("Sayı giriniz: ");
		    int n = input.nextInt();
		    
		    if(isPrime(n,2)){
		    	System.out.println(n + " sayısı ASALDIR !");
		    }
		    else
		    	System.out.println(n + " sayısı ASAL değildir !");
	    }

}
