package InsuranceManagementSystem;

import java.util.ArrayList;

public abstract class Account implements Comparable<Account>{
	
	private User client;
	private AuthenticationStatus authenticationStatus;
	private ArrayList<Insurance> insuranceList;
	
	public Account(User client) {
		this.client = client;
		this.authenticationStatus = AuthenticationStatus.FAIL;
		this.insuranceList = new ArrayList<>();
	}
	
	public User getClient() {
		return client;
	}
	
	public void setClient(User client) {
		this.client = client;
	}

	public AuthenticationStatus isAuthenticationStatus() {
		return authenticationStatus;
	}

	public void setAuthenticationStatus(AuthenticationStatus authenticationStatus) {
		this.authenticationStatus = authenticationStatus;
	}

	public ArrayList<Insurance> getInsuranceList() {
		return insuranceList;
	}

	public void setInsuranceList(ArrayList<Insurance> insuranceList) {
		this.insuranceList = insuranceList;
	}

	public final void showUserInfo() {
		
		System.out.println("User Name: " + this.client.getName());
		System.out.println("User Surname: " + this.client.getSurname());
		System.out.println("User email: " + this.client.getEmail());
		System.out.println("User password: " + this.client.getPassword());
		System.out.println("User occupation: " + this.client.getOccupation());
		System.out.println("User age: " + this.client.getAge());
		System.out.println("User Address: " + this.client.getAddressList());
		System.out.println("User lastEntryDate: " + this.client.getLastEntryDate());
	}
	
	public void login(String email, String password) throws InvalidAuthenticationException {
		if(this.client.getEmail().equals(email) && this.client.getPassword().equals(password)) {
			this.authenticationStatus = AuthenticationStatus.SUCCESS;
		}
		else throw new InvalidAuthenticationException("Incorrect email or password");
	}
	
	@Override
	public int hashCode() {
		return this.client.getEmail().hashCode()*this.client.getPassword().hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
        if(this == obj){ return true; }
        if(obj == null || this.getClass() != obj.getClass()){ return false; }
        Account account = (Account) obj;
        return client.getEmail().equals(account.client.getEmail()) && client.getPassword().equals(account.client.getPassword());
    }
	
	public abstract void addInsurance(Insurance insurance);

}
