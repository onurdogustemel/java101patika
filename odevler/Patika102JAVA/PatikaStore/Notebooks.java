package PatikaStore;

public class Notebooks extends Product {
	private int ram;
	private int storage;
	private double screenSize;
	
	public Notebooks(int id, String productName, double unitPrice, String brandName, double discountRate, int amountOfStock, int ram, int storage, double screenSize) {
		super(id, productName, unitPrice, brandName, discountRate, amountOfStock);
		this.ram = ram;
		this.storage = storage;
		this.screenSize = screenSize;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getStorage() {
		return storage;
	}
	public void setStorage(int storage) {
		this.storage = storage;
	}
	public double getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
}
