package InsuranceManagementSystem;

import java.util.Scanner;

public class StartInsuranceSystem {
	
	public AccountManager acm;
	
	public void start() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("----Welcome to Insurance Management System----");
		System.out.print("Please enter your e-mail: ");
		String email = input.next();
		System.out.print("Please enter your password: ");
		String password = input.next();
		acm.login(email, password);
	}

}
