import java.util.Scanner;

public class odev_36 {

	 static int pattern(int n) {
	        System.out.print(n + " ");
	        if (n <= 0) {
	            return n;
	        }
	        int temp = pattern(n - 5) + 5;

	        System.out.print(temp + " ");

	        return temp;
	    }
	    public static void main(String[] args) {
	    	
	        Scanner input=new Scanner(System.in);
	        
	        System.out.print("N Sayısı : ");
	        int n = input.nextInt();

	        System.out.print("Çıktısı: ");
	        pattern(n);

	    }

}
