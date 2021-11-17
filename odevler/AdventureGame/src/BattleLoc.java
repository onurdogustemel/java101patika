import java.util.Random;

public abstract class BattleLoc extends Location {
	
	private Monster monster;
	private String reward;
	private int maxMonster;
	
	public BattleLoc(int id, Player player, String name, Monster monster, String reward,int maxMonster) {
		super(id, player, name);
		this.monster = monster;
		this.reward = reward;
		this.maxMonster = maxMonster;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean onLocation() {
		// TODO Auto-generated method stub
		int monstNumber = this.randomMonster();
		System.out.println("Your location : " + this.getName());
		if(monstNumber > 1) {
			System.out.println("Be careful ! " +"There are "+ monstNumber +" "+ this.getMonster().getName() + "s roaming here !!");
		}
		else {
			System.out.println("Be careful ! " +"There is "+ monstNumber +" "+ this.getMonster().getName() + " roaming here !!");
		}
		
		System.out.print("<B> To Battle ----- <E> To Escape");
		String selectCase = input.nextLine().toUpperCase();
		
		if (selectCase.equals("B") && battle(monstNumber)) {
			System.out.println(this.getPlayer().getName() + " have defeated all the monsters!");
			return true;
		}
		
		if(this.getPlayer().getHealth() <= 0) {
			System.out.println("YOU DIED!");
			return false;
		}
		
		return true;
	}
	
	public boolean battle(int monsterNumber) {
		
		for(int i=1; i <= monsterNumber; i++) {
			this.getMonster().setHealth(this.getMonster().getOriginalHealth());
			playerStats();
			monsterStats(i);
			randomFirstBlood();
			while(this.getPlayer().getHealth() > 0 && this.getMonster().getHealth() > 0) {
				System.out.print("Hit (H) or Escape (E): ");
				String selectBattle = input.nextLine().toUpperCase();
				if(selectBattle.equals("H")) {
					System.out.println(this.getPlayer().getName() + " hit the monster.");
					this.getMonster().setHealth(this.getMonster().getHealth() - this.getPlayer().getTotalDamage());
					afterHit();
					if(this.getMonster().getHealth() > 0) {
						System.out.println();
						System.out.println(this.getMonster().getName() + " hit you!");
						int monsterDamage = this.getMonster().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
						if(monsterDamage < 0) {
							monsterDamage = 0;
						}
						this.getPlayer().setHealth(this.getPlayer().getHealth() - monsterDamage);
						afterHit();
					}
				}else {
					return false;
				}
			}
			
			if(this.getMonster().getHealth()<this.getPlayer().getHealth()) {
				
				if(this.getReward().equals("multipleRewards")) {
					if(randomExtras(0.25)) {
						if(randomAwards(0.20)) {
							this.getPlayer().setMoney(this.getPlayer().getMoney() + 10);
						}else if(randomAwards(0.30)) {
							this.getPlayer().setMoney(this.getPlayer().getMoney() + 5);
						}else if(randomAwards(0.50)) {
							this.getPlayer().setMoney(this.getPlayer().getMoney() + 1);
						}
					}
					
					
				}
				else {
					System.out.println("You've defeated the enemy, YEEEEHA!!");
					System.out.println("You won " + this.getMonster().getReward() + " coins. Good for you !!");
					this.getPlayer().setMoney(this.getMonster().getReward() + this.getPlayer().getMoney());
					System.out.println("Total money: " + this.getPlayer().getMoney());
				}
				
			}else {
				return false;
			}
		}
		
		return true;
	}
	public void randomFirstBlood() {
		Random random = new Random();
		int r = random.nextInt(10);
		if(r < 5) {
			System.out.println(this.getPlayer().getName() + " hit the monster first.");
			this.getMonster().setHealth(this.getMonster().getHealth()-this.getPlayer().getTotalDamage());
		}else {
			System.out.println();
			System.out.println(this.getMonster().getName() + " hit you first!");
			int monsterDamage = this.getMonster().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
			if(monsterDamage < 0) {
				monsterDamage = 0;
			}
			this.getPlayer().setHealth(this.getPlayer().getHealth() - monsterDamage);
		}
	}
	
	public void afterHit() {
		System.out.println("Your Health: " + this.getPlayer().getHealth());
		System.out.println(this.getMonster().getName() + "'s Health: " + this.getMonster().getHealth());
		System.out.println();
	}
	
	public void playerStats() {
		System.out.println("Player Stats");
		System.out.println("-------------------------");
		System.out.println("Health: " + this.getPlayer().getHealth());
		System.out.println("Weapon: " + this.getPlayer().getInventory().getWeapon().getName());
		System.out.println("Damage: " + this.getPlayer().getTotalDamage());
		System.out.println("Armor: " + this.getPlayer().getInventory().getArmor().getName());
		System.out.println("Block: " + this.getPlayer().getInventory().getArmor().getBlock());
		System.out.println("Money: " + this.getPlayer().getMoney());
	}
	public void monsterStats(int i) {
		System.out.println(i + "." + this.getMonster().getName() + " Stats");
		System.out.println("--------------------------");
		System.out.println("Health: " + this.getMonster().getHealth());
		System.out.println("Damage: " + this.getMonster().getDamage());
		System.out.println("Reward: " + this.getMonster().getReward());
		
	}
	public int randomMonster() {
		Random r = new Random();
		return r.nextInt(this.getMaxMonster()) + 1;
	}
	
	public boolean randomAwards(double value) {
		return Math.random() <= value;
	}
	public boolean randomExtras(double possibility) {
		return Math.random() <= possibility;
	}
	
	public int getMaxMonster() {
		return maxMonster;
	}

	public void setMaxMonster(int maxMonster) {
		this.maxMonster = maxMonster;
	}

	public Monster getMonster() {
		return monster;
	}

	public void setMonster(Monster monster) {
		this.monster = monster;
	}

	public String getReward() {
		return reward;
	}

	public void setReward(String reward) {
		this.reward = reward;
	}
	
	

}
