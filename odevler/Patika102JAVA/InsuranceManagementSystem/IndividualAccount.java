package InsuranceManagementSystem;

public class IndividualAccount extends Account{
	
	public IndividualAccount(User client) {
		super(client);
	}
	
	@Override
	public void addInsurance(Insurance insurance) {
		getInsuranceList().add(insurance);
	}

	@Override
	public int compareTo(Account o) {
		 if(super.hashCode() < o.hashCode()){
	            return -1;
	        }
	     return 1;
	}

}
