import java.util.Scanner;

public class odev1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int math,phys,chem,bio,music,hist,total;
		double average;
		double threshold = 60;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Matematik notu: ");
		math = inp.nextInt();
		
		
		System.out.println("Fizik notu: ");
		phys = inp.nextInt();
	
		
		System.out.println("Kimya notu: ");
		chem = inp.nextInt();
	
		
		System.out.println("Biyoloji notu: ");
		bio = inp.nextInt();
		
		
		System.out.println("Müzik notu: ");
		music = inp.nextInt();
		
		
		System.out.println("Tarih notu: ");
		hist = inp.nextInt();
		
		
		total = math + phys + chem + bio + music + hist;
		
		average = total/6;
		
		String kosul = average >= threshold  ? "Sınıfı geçti" : "Sınıfta kaldı" ;
		
		System.out.println(kosul);
		
		
		
	}

}
