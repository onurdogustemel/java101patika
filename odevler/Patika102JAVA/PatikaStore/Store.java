package PatikaStore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Store {
	
	Scanner input = new Scanner(System.in);
	private String name;
	
	static ArrayList<CellPhones> cellPhone = new ArrayList<>();
	static ArrayList<Notebooks> notebook = new ArrayList<>();
	
	public Store(String name) {
		 this.name = name;
	}
	
	static ArrayList<Brand> brand = new ArrayList<Brand>();
	
	static {
		brand.add(new Brand(1,"Samsung"));
		brand.add(new Brand(2,"Lenovo"));
		brand.add(new Brand(3,"Apple"));
		brand.add(new Brand(4,"Huawei"));
		brand.add(new Brand(5,"Casper"));
		brand.add(new Brand(6,"Asus"));
		brand.add(new Brand(7,"HP"));
		brand.add(new Brand(8,"Xiaomi"));
		brand.add(new Brand(9,"Monster"));
		
		cellPhone.add(new CellPhones(1,"SAMSUNG GALAXY A51", 3199.0, brand.get(0).getName(),0.0,12,128,32,4000.0,6.5,6,"Black"));
		cellPhone.add(new CellPhones(2,"IPhone 11 64 GB", 7379.0, brand.get(2).getName(),0.0,20,64,5,3046.0,6.1,6,"Blue"));
		cellPhone.add(new CellPhones(3,"Redmi Note 10 Pro 8GB", 3199.0, brand.get(7).getName(),0.0,45,128,35,4000.0,6.5,12,"White"));
		
		notebook.add(new Notebooks(1,"HUAWEI Matebook 14",7000.0,brand.get(3).getName(),0.0,30,16,512,14.0));
		notebook.add(new Notebooks(2,"LENOVO V14 IGL",3699.0,brand.get(1).getName(),0.0,25,8,1024,14.0));
		notebook.add(new Notebooks(3,"ASUS Tuf Gaming",8199.0,brand.get(5).getName(),0.0,15,32,2048,15.6));
	}
	
	public void printMenu() {
		System.out.println("PatikaStore Product Management Panel");
		System.out.println("1 - Notebook Transactions");
		System.out.println("2 - Cell phone Transactions");
		System.out.println("3 - List Brands");
		System.out.println("0 - Exit");
		
	}
	
	public void notebookTransactions() {
		System.out.println("Notebook Transactions");
	}
	
	public void ListBrands() {
		brand.sort(new SortBrandsByAlphabeticOrder());;
		System.out.println("Brands");
		System.out.println("--------------");
		for(Brand b : brand) {
			System.out.println("- " + b.getName());
		}
	}

	public void listCellPhones() {
		String headers = "| %-2s | %-20s | %-11s | %-9s | %-10s | %-24s | %-10s | %-9s | %-10s | %-9s | %-10s | %-5s |%n";
		System.out.println("Cell phones");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
		System.out.format(headers,"ID", "Product Name", "Unit price","Brand Name","Discount Rate","Amount Of Stock","Storage","Camera","Screen Size","RAM","Battery","Color");
		for(CellPhones cell : cellPhone) {
			System.out.format(headers,cell.getId(),cell.getProductName(),cell.getUnitPrice()+" TL",cell.getBrandName(),cell.getDiscountRate(),cell.getAmountOfStock(),cell.getStorage(),cell.getCamera(),cell.getBattery(),cell.getScreenSize(),
					cell.getRam(),cell.getColor());
		}
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
	}
	
	public void listNotebooks() {
		String headers = "| %-2s | %-20s | %-11s | %-9s | %-10s | %-14s | %-10s | %-5s | %-5s |%n";
		System.out.println("Notebooks");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
		System.out.format(headers,"ID", "Product Name", "Unit price","Brand Name","Discount Rate","Amount Of Stock","RAM","Storage","Screen Size");
		for(Notebooks nb : notebook) {
			System.out.format(headers,nb.getId(),nb.getProductName(),nb.getUnitPrice()+ " TL",nb.getBrandName(),nb.getDiscountRate(),nb.getAmountOfStock(),nb.getRam(),nb.getStorage(),nb.getScreenSize());
		}
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
	}
	
	public void addNotebook() {
		System.out.println("You are about to add another Notebook.");
		System.out.println();
		System.out.println("Enter product id: ");
		int id = input.nextInt();
		System.out.println("Enter product name: ");
		String pName = input.next();
		System.out.println("Enter unit price: ");
		double price = input.nextDouble();
		System.out.println("Enter Brand Name: ");
		String BrandName = input.next();
		System.out.println("Enter discount rate: ");
		double discountRate = input.nextDouble();
		System.out.println("Enter amount of stock: ");
		int amountOfStock = input.nextInt();
		System.out.println("Enter RAM: ");
		int ram = input.nextInt();
		System.out.println("Enter Storage: ");
		int storage = input.nextInt();
		System.out.println("Enter Screen Size: ");
		double ScreenSize = input.nextDouble();
		
		notebook.add(new Notebooks(id,pName,price,BrandName,discountRate,amountOfStock,ram,storage,ScreenSize));
		System.out.println("New Notebook data has been added.");
	}
	
	public void addCellPhone() {
		
		System.out.println("You are about to add another Cell Phone.");
		System.out.println("Enter product id: ");
		int id = input.nextInt();
		System.out.println("Enter product name: ");
		String pName = input.next();
		System.out.println("Enter unit price: ");
		double price = input.nextDouble();
		System.out.println("Enter Brand Name: ");
		String BrandName = input.next();
		System.out.println("Enter discount rate: ");
		double discountRate = input.nextDouble();
		System.out.println("Enter amount of stock: ");
		int amountOfStock = input.nextInt();
		System.out.println("Enter Storage: ");
		int storage = input.nextInt();
		System.out.println("Enter Camera Resolution: ");
		int camera = input.nextInt();
		System.out.println("Enter battery: ");
		double battery = input.nextDouble();
		System.out.println("Enter Screen Size: ");
		double ScreenSize = input.nextDouble();
		System.out.println("Enter RAM: ");
		int ram = input.nextInt();
		System.out.println("Enter color:");
		String color = input.next();

		cellPhone.add(new CellPhones(id,pName,price,BrandName,discountRate,amountOfStock,storage,camera,battery,ScreenSize,
					ram,color));
		System.out.println("New Cell Phone data has been added.");
	}
	
	public void addBrand() {
		System.out.println("You are about to add brand name.");
		System.out.println();
		System.out.print("Enter the brand id: ");
		int id = input.nextInt();
		System.out.print("Enter the brand name: ");
		String name = input.next();
		brand.add( new Brand(id, name));
		System.out.println("Brand has been added.");
	}
	
	public void clearCellPhone(int id) {
		
		Iterator<CellPhones> itr = cellPhone.iterator();
		
        while (itr.hasNext()) {
        	
            CellPhones removeID = itr.next();
            
            if(removeID.getId() == id) {
            	itr.remove();
            	break;
            }
        }
	}
	
	public void clearNotebook(int id) {
		
		Iterator<Notebooks> itr = notebook.iterator();
		
        while (itr.hasNext()) {
        	
            Notebooks removeID = itr.next();
            
            if(removeID.getId() == id) {
            	itr.remove();
            	break;
            }
        }
	}
	
	public void filterNotebooksByID(int id) {
		String headers = "| %-2s | %-20s | %-11s | %-9s | %-10s | %-14s | %-10s | %-5s | %-5s |%n";
		System.out.println("Notebooks");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
		System.out.format(headers,"ID", "Product Name", "Unit price","Brand Name","Discount Rate","Amount Of Stock","RAM","Storage","Screen Size");
		
		Iterator<Notebooks> itr = notebook.iterator();
		
        while (itr.hasNext()) {
        	
            Notebooks filterID = itr.next();
            
            if(filterID.getId() == id) {
            	System.out.format(headers,filterID.getId(),filterID.getProductName(),
            			filterID.getUnitPrice()+ " TL",filterID.getBrandName(),
            			filterID.getDiscountRate(),filterID.getAmountOfStock(),
            			filterID.getRam(),filterID.getStorage(),filterID.getScreenSize());
            	break;
            }
        }

		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
	}
	
	public void filterCellPhonesByID(int id) {
		String headers = "| %-2s | %-20s | %-11s | %-9s | %-10s | %-14s | %-10s | %-5s | %-5s |%n";
		System.out.println("Notebooks");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
		System.out.format(headers,"ID", "Product Name", "Unit price","Brand Name","Discount Rate","Amount Of Stock","RAM","Storage","Screen Size");
		
		Iterator<CellPhones> itr = cellPhone.iterator();
		
        while (itr.hasNext()) {
        	
            CellPhones filterID = itr.next();
            
            if(filterID.getId() == id) {
            	System.out.format(headers,filterID.getId(),filterID.getProductName(),
            			filterID.getUnitPrice()+ " TL",filterID.getBrandName(),
            			filterID.getDiscountRate(),filterID.getAmountOfStock(),
            			filterID.getRam(),filterID.getStorage(),filterID.getScreenSize());
            	break;
            }
        }
        
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");

	}
}
