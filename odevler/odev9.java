import java.util.Scanner;
public class odev9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String u1="patika",p1="cisco123",username,password;
		int answer;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Username: ");
		username = input.nextLine();
		
		System.out.println("Password: ");
		password = input.nextLine();
		
		if(username.equals(u1) && password.equals(p1)) {
			System.out.println("Login successful.");
		}
		else {
			System.out.println("Username or password is wrong.");
			System.out.println("Do you want to reset your password? (1/0)");
			answer=input.nextInt();
			switch(answer) {
				case 1:
					String newPass;
					Scanner inp= new Scanner(System.in);
					System.out.println("Enter new password: ");
					newPass=inp.nextLine();
					if (newPass.equals(p1) || newPass.equals(password)) { 
						System.out.println("Couldn't create password, please enter another password."); 
					}
					else
						System.out.println("New password created.");
					password=newPass;
					break;
				case 0:
					System.out.println("Try again :(");
					break;		
			}
			
		}
			
	}

}
