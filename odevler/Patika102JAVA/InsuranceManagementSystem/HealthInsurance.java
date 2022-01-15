package InsuranceManagementSystem;

import java.util.Date;

public class HealthInsurance extends Insurance{
	
	public HealthInsurance(String insuranceName, double insuranceFee, Date insuranceStartDate, Date insuranceEndDate) {
		super(insuranceName, insuranceFee, insuranceStartDate, insuranceEndDate);
	}

	@Override
	public double calculate() {
		
		return 4000.56;
	}
}
