package InsuranceManagementSystem;

import java.util.TreeSet;

public class AccountManager{
	
	private TreeSet<Account> account;
	
	public AccountManager() {
		this.account = new TreeSet<>();
	}

	public TreeSet<Account> getAccount() {
		return account;
	}

	public void setAccount(TreeSet<Account> account) {
		this.account = account;
	}

	public void login(String email, String password){
		for(Account a: account) {
			try {
				a.login(email, password);
				System.out.println("Login successful.");
			}catch(InvalidAuthenticationException e) {
				System.out.println(e.getMessage());
			}	 
		}
	}	
}
