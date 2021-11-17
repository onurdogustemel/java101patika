
public class Weapons {
	
	private String name;
	private int id;
	private int damage;
	private int price;
	
	public Weapons(String name, int id, int damage, int price) {
		super();
		this.name = name;
		this.id = id;
		this.damage = damage;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static Weapons[] weapons() {
		
		Weapons[] weaponList = new Weapons[3];
		
		weaponList[0] = new Weapons("Pistol",1,2,15);
		weaponList[1] = new Weapons("Sword",2,3,25);
		weaponList[2] = new Weapons("Rifle",3,7,35);
		
		return weaponList;
		
	}
	
	public static Weapons getWeaponsObjByID(int id) {
		
		for(Weapons w : Weapons.weapons()) {
			
			if (w.getId() == id)
				return w;
			
		}
		return null;
		
	}
	
	

}
