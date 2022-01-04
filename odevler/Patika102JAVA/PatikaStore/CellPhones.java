package PatikaStore;

public class CellPhones extends Product{
	
	private int camera;
	private double battery;
	private double screenSize;
	private int storage;
	private int ram;
	private String color;
	
	public CellPhones(int id, String productName, double unitPrice, String brandName, double discountRate,
			int amountOfStock,int storage, int camera, double battery, double screenSize,int ram,String color) {
		super(id, productName, unitPrice, brandName, discountRate, amountOfStock);
		this.camera = camera;
		this.battery = battery;
		this.ram = ram;
		this.screenSize = screenSize;
		this.storage = storage;
		this.color = color;
	}
	public int getCamera() {
		return camera;
	}
	public void setCamera(int camera) {
		this.camera = camera;
	}
	public double getBattery() {
		return battery;
	}
	public void setBattery(double battery) {
		this.battery = battery;
	}
	public double getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	public int getStorage() {
		return storage;
	}
	public void setStorage(int storage) {
		this.storage = storage;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
