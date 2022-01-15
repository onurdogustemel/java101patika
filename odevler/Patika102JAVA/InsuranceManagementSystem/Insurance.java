package InsuranceManagementSystem;

import java.util.Date;

public abstract class Insurance {
	
	private String insuranceName;
	private double insuranceFee;
	private Date insuranceStartDate;
	private Date insuranceEndDate;
	
	public Insurance(String insuranceName, double insuranceFee, Date insuranceStartDate, Date insuranceEndDate) {
		this.insuranceName = insuranceName;
		this.insuranceFee = insuranceFee;
		this.insuranceStartDate = insuranceStartDate;
		this.insuranceEndDate = insuranceEndDate;
	}
	
	public String getInsuranceName() {
		return insuranceName;
	}
	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}
	public double getInsuranceFee() {
		return insuranceFee;
	}
	public void setInsuranceFee(double insuranceFee) {
		this.insuranceFee = insuranceFee;
	}
	public Date getInsuranceStartDate() {
		return insuranceStartDate;
	}
	public void setInsuranceStartDate(Date insuranceStartDate) {
		this.insuranceStartDate = insuranceStartDate;
	}
	public Date getInsuranceEndDate() {
		return insuranceEndDate;
	}
	public void setInsuranceEndDate(Date insuranceEndDate) {
		this.insuranceEndDate = insuranceEndDate;
	}

	public abstract double calculate();

}
