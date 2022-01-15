package InsuranceManagementSystem;

import java.util.Date;

public class ResidenceInsurance extends Insurance {
	
	public ResidenceInsurance(String insuranceName, double insuranceFee, Date insuranceStartDate, Date insuranceEndDate) {
		super(insuranceName, insuranceFee, insuranceStartDate, insuranceEndDate);
	}

	@Override
	public double calculate() {
		
		return 1234.45;
	}

}
