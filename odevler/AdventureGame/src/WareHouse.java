
public class WareHouse extends NormalLoc{
	
	public WareHouse(Player player) {
		super(2, player, "Warehouse");
	}
	
	@Override
	public boolean onLocation() {
		
		System.out.println("You are in the Warehouse.");
		
		boolean showMenu = true;
		
		while(showMenu) {
			
			System.out.println("1 - Weapons");
			System.out.println("2 - Armors");
			System.out.println("3 - Exit");
			System.out.println();
			System.out.print("Select: ");
			int selectCase = input.nextInt();
			
			while (selectCase < 1 || selectCase > 3) {
				System.out.println("Invalid selection, please try again.");
				selectCase = input.nextInt();
			}
			
			switch(selectCase) {
				case 1:
					printWeapons();
					buyWeapons();
					break;
				case 2:
					printArmors();
					buyArmors();
					break;
				case 3:
					System.out.println("Till we meet again!!");
					showMenu = false;
					break;
			}
		}
		
		return true;
	}
	
	public void printWeapons() {
		System.out.println("------Weapons------");
		
		for(Weapons w : Weapons.weapons()) {
			System.out.println("ID : " + w.getId() + 
					"\tWeapon Name: " + w.getName() + 
					" < Price: " + w.getPrice() + " , Damage: " + w.getDamage() + " >");
		}
		System.out.println("0 - Exit");
	}
	
	public void buyWeapons() {
		
		System.out.println("Choose a weapon: ");
		int selectWeaponId = input.nextInt();
		
		while(selectWeaponId < 0 || selectWeaponId > Weapons.weapons().length) {
			System.out.println("Invalid value, try again.");
			selectWeaponId = input.nextInt();
		}
		
		if(selectWeaponId != 0) {
			
			Weapons selectWeapon = Weapons.getWeaponsObjByID(selectWeaponId);
			
			if (selectWeapon != null) {
				if(selectWeapon.getPrice() > this.getPlayer().getMoney()) {
					System.out.println("Insufficient money. You can't purchase this item.");
				}
				else {
					System.out.println( "You have purchased " + selectWeapon.getName());
					
					int balance = this.getPlayer().getMoney() - selectWeapon.getPrice();
					this.getPlayer().setMoney(balance);
					System.out.println("Your balance: " + this.getPlayer().getMoney());
					this.getPlayer().getInventory().setWeapon(selectWeapon); 
				}
			}
		}
	}
	
	public void printArmors() {
		System.out.println("------Armors------");

		
		for(Armors a : Armors.armors()) {
			System.out.println("ID : " + a.getId() + 
					"\tArmor Type: " + a.getName() + 
					" < Price: " + a.getPrice() + " , Block: " + a.getBlock() + " >");
		}
		System.out.println("0 - Exit");
	}
	
	public void buyArmors() {
		
		System.out.println("Choose an armor: ");
		int selectArmorId = input.nextInt();
		
		while(selectArmorId < 0 || selectArmorId > Armors.armors().length) {
			System.out.println("Invalid value, try again.");
			selectArmorId = input.nextInt();
		}
		
		if (selectArmorId != 0) {
			Armors selectArmor = Armors.getArmorsObjByID(selectArmorId);
			
			if (selectArmor != null) {
				if(selectArmor.getPrice() > this.getPlayer().getMoney()) {
					System.out.println("Insufficient money. You can't purchase this item.");
				}
				else {
					System.out.println( "You have purchased " + selectArmor.getName());
					
					int balance = this.getPlayer().getMoney() - selectArmor.getPrice();
					this.getPlayer().setMoney(balance);
					System.out.println("Your balance: " + this.getPlayer().getMoney());
					this.getPlayer().getInventory().setArmor(selectArmor); 
				}
			}
		}		
	}
}
