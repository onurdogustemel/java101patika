import java.util.Scanner;
public class odev10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int mat,fiz,turk,kim,mzk,timer=0,newMat=0,f=0,t=0,k=0,m=0;
		
		System.out.println("Matematik notu: ");
		mat=input.nextInt();
		if (mat<100 && mat>0){
            newMat=mat;
			timer++;
        }
		
		System.out.println("Fizik notu: ");
		fiz=input.nextInt();
		if (fiz<100 && fiz>0){
            f=fiz;
			timer++;
        }
		
		System.out.println("Türkçe notu: ");
		turk=input.nextInt();
		if (turk<100 && turk>0){
            t=turk;
			timer++;
        }
		
		System.out.println("Kimya notu: ");
		kim=input.nextInt();
		if (kim<100 && kim>0){
            k=kim;
			timer++;
        }
		
		System.out.println("Müzik notu: ");
		mzk=input.nextInt();
		if (mzk<100 && mzk>0){
            m=mzk;
			timer++;
        }
		
		double average = (newMat + f + t + k + m)/timer;
		
		if(average<55) {
			System.out.println("Üzgünüm, sınıfta kaldın.");
		}
		else
			System.out.println("Tebrikler, sınıfı geçtin.");
		
		System.out.println("Not ortalaman: " + average);

	}

}
