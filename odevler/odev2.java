import java.util.Scanner;


public class odev2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double fiyat;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Fiyat giriniz: ");
		fiyat=input.nextDouble();
		
		if (fiyat< 0){
            System.out.println("Fiyat 0 değerinden küçük olamaz.");
            return;
        }
		
		double kdvOran = fiyat<=1000 ? 0.18 : 0.08;
		
		System.out.println("KDV'siz fiyat: " + fiyat);
		System.out.println("KDV'li fiyat: " + fiyat*(1+kdvOran));
		System.out.println("KDV tutari: " + fiyat*kdvOran);
		
	}
}