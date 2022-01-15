package InsuranceManagementSystem;

public class BusinessAddress implements Address{
	
	private String streetName ;
	private int streetNumber;
	private String districtName ;
	private String cityName; 
	private String buildingName;
	private int buildingNumber;
	private int flatNumber;
	
	public BusinessAddress(String streetName, int streetNumber, String districtName, String cityName,
			String buildingName, int buildingNumber, int flatNumber) {
		
		this.streetName = streetName;
		this.streetNumber = streetNumber;
		this.districtName = districtName;
		this.cityName = cityName;
		this.buildingName = buildingName;
		this.buildingNumber = buildingNumber;
		this.flatNumber = flatNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public int getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public int getBuildingNumber() {
		return buildingNumber;
	}

	public void setBuildingNumber(int buildingNumber) {
		this.buildingNumber = buildingNumber;
	}

	public int getFlatNumber() {
		return flatNumber;
	}

	public void setFlatNumber(int flatNumber) {
		this.flatNumber = flatNumber;
	}

	@Override
	public void printAddress(String streetName, int streetNumber,
			 				 String districtName, String cityName, String buildingName,
			 				 int buildingNumber, int flatNumber) {
		System.out.println("----Business Address----");
		System.out.println("Street Name: " + this.streetName);
		System.out.println("Street Number: " + this.streetNumber);
		System.out.println("District Name : " + this.districtName);
		System.out.println("City Name: " + this.cityName);
		System.out.println("Building Name: " + this.buildingName);
		System.out.println("Building Number: " + this.buildingNumber);
		System.out.println("Flat Number: " + this.flatNumber);
	}

}
