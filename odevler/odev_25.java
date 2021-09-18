import java.util.Scanner;

public class odev_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String user,password;
		
		Scanner input = new Scanner(System.in);
		
		int number, attempt = 3, balance=1500;
		
		while(attempt > 0) {
			System.out.println("Username: ");
			user=input.nextLine();
			System.out.println("Password: ");
			password = input.nextLine();
			
			if (user.equals("dogus") && password.equals("cisco123")) {
				System.out.println("Hello, Welcome to the Kodluyoruz Bank !");
				do {
					System.out.println("1-Deposit\n" +
                            "2-Withdrawal\n" +
                            "3-Balance Inquiry\n" +
                            "4-Exit");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    number=input.nextInt();
                    
                    switch(number) {
                    	case 1:
                    		System.out.println("Enter value: ");
                    		int value=input.nextInt();
                    		balance += value;
                    		break;
                    		
                    	case 2:
                    		System.out.println("Enter withdrawal value: ");
                    		int witd = input.nextInt();
                    		if (witd > balance) {
                    			System.out.println("Insufficient balance, try again.");
                    		}
                    		else
                    			balance -= witd;
                    		break;
                    	
                    	case 3:
                    		System.out.println("Balance: " + balance);
                    		break;
                    }
					
				}while(number != 4);
				System.out.println("See you again.");
				break;
				}
			else {
				attempt--;
                System.out.println("Wrong username or password. Try again.");
                switch(attempt) {
                	case 0:
                		System.out.println("Your account has been blocked. Please contact the bank.");
                		break;
                	default:
                		System.out.println("Remaining attempt: " + attempt);
                		break;
                	}
				}		
		}
	}

}
