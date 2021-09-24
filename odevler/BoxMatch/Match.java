
public class Match {
	
	Fighter f1;
	Fighter f2;
	
	int minWeight;
	int maxWeight;
	
	
	Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
		
		this.f1 = f1;
		this.f2 = f2;
		this.maxWeight = maxWeight;
		this.minWeight = minWeight;
		
	}
	
	
	boolean isCheck() {
		return (this.f1.weight >= this.minWeight && this.f1.weight <= this.maxWeight) 
				&& (this.f2.weight >= this.minWeight && this.f2.weight <= this.maxWeight);
	}
	
	void beginFight() {
		
		if (isCheck()) {
			
			if (Math.random()*10<=5) { //randomly picks the first hit
				
				while (this.f1.health > 0 && this.f2.health > 0) {
					
					System.out.println("========NEW ROUND========");
					
					
					this.f2.health=this.f1.hit(this.f2);
					
					if (isWin()) {
						break;
					}
					
					this.f1.health = this.f2.hit(this.f1);

					if (isWin()) {
						break;
					}
					System.out.println(this.f1.name + " Health: " + this.f1.health + "\n" + this.f2.name + " Health: " + this.f2.health);
				}
				
			}else {
				
				while (this.f1.health > 0 && this.f2.health > 0) {
					
					System.out.println("========NEW ROUND========");
					
					
					this.f1.health=this.f2.hit(this.f1);
					
					if (isWin()) {
						break;
					}
					
					this.f2.health = this.f1.hit(this.f2);

					if (isWin()) {
						break;
					}
					System.out.println(this.f1.name + " Health: " + this.f1.health + "\n" + this.f2.name + " Health: " + this.f2.health);
				}
			}

		}
		else
			System.out.println("Sporcuların sikletleri uymuyor.");
		
	}
	
	boolean isWin() {
		if(this.f1.health == 0) {
			System.out.println(this.f2.name + " wins !");
			return true;
		}
		
		if (this.f2.health == 0) {
			System.out.println(this.f1.name + " wins !");
			return true;
		}
		
		return false;
	
	}

}
