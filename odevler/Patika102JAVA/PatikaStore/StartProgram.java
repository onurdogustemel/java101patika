package PatikaStore;

import java.util.Scanner;

public class StartProgram {
	
	private static Scanner scanner = new Scanner(System.in);
	public Store store = new Store("PatikaStore");
	
	public void start() {
		
		boolean exit = true;
		
		while(exit) {
			boolean showMenu = true;
			store.printMenu();
			System.out.print("Your choice: ");
			int select = scanner.nextInt();
			
			switch(select) {
				case 0:
					System.out.println("Thanks for shopping, have a nice day!!");
					exit = false;
					break;
				case 1:
					while(showMenu) {
						System.out.println("1 - Add Notebook\n2 - List Notebooks\n3 - Delete Notebook\n4 - Filter Notebooks by ID\n0 - Exit");
						System.out.print("Your choice: ");
						int choose = scanner.nextInt();
						while(choose < 0 || choose > 4) {
							System.out.println("You've entered a wrong number. Please try again.");
							choose = scanner.nextInt();
						}
						switch(choose) {
							case 0:
								System.out.println("Back to The Store Menu.");
								System.out.println();
								showMenu = false;
								break;
							case 1:
								store.addNotebook();
								break;
							case 2:
								store.listNotebooks();
								break;
							case 3:
								System.out.println("Enter id: ");
								int id = scanner.nextInt();
								store.clearNotebook(id);
								System.out.println("Cell Phone with the id " + id + " has been deleted.");
								System.out.println();
								break;
							case 4:
								System.out.print("Enter the product id you want to filter: ");
								int filtid = scanner.nextInt();
								store.filterNotebooksByID(filtid);
								System.out.println("Notebook with the id " + filtid + " has been filtered.");
								System.out.println();
								break;
						}
					}
					break;
				case 2:
					while(showMenu) {
						System.out.println("1 - Add Cell Phone\n2 - List Cell Phones\n3 - Delete Cell Phone\n4 - Filter Cell Phones by ID\n0 - Exit");
						System.out.print("Your choice: ");
						int c = scanner.nextInt();
						while(c < 0 || c > 4) {
							System.out.println("You've entered a wrong number. Please try again.");
							c = scanner.nextInt();
						}
						switch(c) {
							case 0:
								System.out.println("Back to The Store Menu.");
								System.out.println();
								showMenu = false;
								break;
							case 1:
								store.addCellPhone();
								break;
							case 2:
								store.listCellPhones();
								break;
							case 3:
								System.out.println("Enter id: ");
								int id = scanner.nextInt();
								store.clearCellPhone(id);
								System.out.println("Cell Phone with the id " + id + " has been deleted.");
								System.out.println();
								break;
							case 4:
								System.out.print("Enter the product id you want to filter: ");
								int filtid = scanner.nextInt();
								store.filterCellPhonesByID(filtid);
								System.out.println("Cell Phone with  the id " + filtid + " has been filtered.");
								System.out.println();
								break;
						}
					}
					break;
				case 3:
					store.ListBrands();
					break;
				default:
					System.out.println("You've entered a wrong number.");
					break;
			}
		}
	}

}
