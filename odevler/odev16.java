import java.util.Scanner;

public class odev16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int year;
		
		System.out.println("Yıl Giriniz: ");
		year = input.nextInt();
		
		boolean leap = false;
		 
        if(year % 4 == 0) {
            if( year % 100 == 0){
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;
 
        if(leap)
            System.out.println(year + " bir artık yıldır !");
        else
            System.out.println(year + " bir artık yıl değildir !");
	}

}
