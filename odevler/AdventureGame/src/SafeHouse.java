
public class SafeHouse extends NormalLoc{
	
	
	public SafeHouse(Player player) {
		super(1, player, "Safe House");
	}
	
	@Override
	public boolean onLocation() {
		System.out.println("You are in the Safe House.");
		System.out.println("Your health is regenerated.");
		this.getPlayer().setHealth(this.getPlayer().getOriginalHealth());
		return true;
	}

}
