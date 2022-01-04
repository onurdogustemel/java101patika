package PatikaStore;

public class Product {
	
	private int id;
	private String productName;
	private double unitPrice;
	private double discountRate;
	private int amountOfStock;
	private String brandName;

	
	public Product(int id, String productName, double unitPrice, String brandName ,double discountRate, int amountOfStock) {
		this.id = id;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.discountRate = discountRate;
		this.brandName = brandName;
		this.amountOfStock = amountOfStock;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}

	public int getAmountOfStock() {
		return amountOfStock;
	}

	public void setAmountOfStock(int amountOfStock) {
		this.amountOfStock = amountOfStock;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

}
