package InsuranceManagementSystem;

import java.util.Date;

public class TravelInsurance extends Insurance {
	
	public TravelInsurance(String insuranceName, double insuranceFee, Date insuranceStartDate, Date insuranceEndDate) {
		super(insuranceName, insuranceFee, insuranceStartDate, insuranceEndDate);
	}

	@Override
	public double calculate() {
		
		return 2050.99;
	}

}
