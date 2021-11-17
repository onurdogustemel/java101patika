import java.util.Scanner;

public class Player  {
	
	private boolean isTrue = false;
	private Inventory inventory;
	private int damage;
	private int health;
	private int originalHealth;
	private int money;
	private String playerName;
	private String charName;
	private Scanner input = new Scanner(System.in);
	
	public Player(String playerName) {
		this.playerName = playerName;
		this.inventory = new Inventory();
	}
	
	public void selectChar() {
		
		System.out.println();
		System.out.println("You can select these heroes : ");
		
		GameChar[] charList = {new Samurai(), new Archer(), new Paladin()};
		
		System.out.println("##############################################################################");
		
		for(GameChar gameChar : charList) {
			System.out.println("ID : " + gameChar.getId() + 
					"\t Character : " + gameChar.getName() + 
					"\t Damage : " + gameChar.getDamage() + 
					"\t Health : " + gameChar.getHealth() + 
					"\t Money : " + gameChar.getMoney());
		}
		System.out.println("##############################################################################");
		System.out.println();
		
		while (!isTrue) {
			System.out.print("Please select a hero : ");
			int select = input.nextInt();
			
			switch(select) {
				case 1:
					initPlayer(new Samurai());
					isTrue = true;
					break;

				case 2:
					initPlayer(new Archer());
					isTrue = true;
					break;

				case 3:
					initPlayer(new Paladin());
					isTrue = true;
					break;
			
				default:
					System.out.println("You've entered a wrong number.");
					System.out.println("Please select again.");
					break;
		}
			
		}
		
		System.out.println("Your character : " + this.getCharName() +
				"\t Damage : " + this.getDamage() + 
				"\t Health : " + this.getHealth() + 
				"\t Money : " + this.getMoney());
	}
	
	public void initPlayer(GameChar gameChar) {
		
		this.setDamage(gameChar.getDamage());
		this.setHealth(gameChar.getHealth());
		this.setOriginalHealth(gameChar.getHealth());
		this.setMoney(gameChar.getMoney());
		this.setCharName(gameChar.getName());
	}
	
	public void printInfo() {
		
		System.out.println("Weapon : " + this.getInventory().getWeapon().getName()+
				"\t Damage : " + this.getTotalDamage() + 
				"\t Armor : " + this.getInventory().getArmor().getName() +
				"\t Block : " + this.getInventory().getArmor().getBlock() + 
				"\t Health : " + this.getHealth() + 
				"\t Money : " + this.getMoney());
		
	}
	

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	
	public int getTotalDamage() {
		return damage + this.getInventory().getWeapon().getDamage();
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getName() {
		return playerName;
	}

	public void setName(String PlayerName) {
		this.playerName = playerName;
	}

	public String getCharName() {
		return charName;
	}

	public void setCharName(String charName) {
		this.charName = charName;
	}
	public int getOriginalHealth() {
		return originalHealth;
	}

	public void setOriginalHealth(int originalHealth) {
		this.originalHealth = originalHealth;
	}
	

}
