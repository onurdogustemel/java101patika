package InsuranceManagementSystem;

import java.util.Date;

public class CarInsurance extends Insurance{
	
	public CarInsurance(String insuranceName, double insuranceFee, Date insuranceStartDate, Date insuranceEndDate) {
		super(insuranceName, insuranceFee, insuranceStartDate, insuranceEndDate);
	}

	@Override
	public double calculate() {
		
		return 3000.67;
	}

}
