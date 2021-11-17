import java.util.Scanner;

public class Game {
	
	private Scanner input = new Scanner(System.in);
	public Location location;

	
	public void start() {
		System.out.println("Welcome to The Adventure Game !");
		System.out.print("Please enter a player name : ");
		String playerName = input.nextLine();
		
		Player play = new Player (playerName);
		
		System.out.println("Welcome " + play.getName());
		play.selectChar();

		
		System.out.println();
		Location[] locList = {new SafeHouse(play) , new WareHouse(play), new Cave(play),new Forest(play),new River(play),new Mine(play)};
		Location locs = null;

		while(true) {
			
			play.printInfo();
			
			System.out.println("You can select these locations :");
			System.out.println("##############################################################################");
			
			for(Location location: locList) {
				System.out.println("ID : " + location.getId() + "\t Location : " + location.getName());
			}
			System.out.println("0 - Exit Game");
			System.out.println("##############################################################################");
			System.out.println();
			
			System.out.print("Please select a location : ");
			int choose = input.nextInt();
			
			switch(choose){
				case 0:
					locs = null;
					break;
				case 1:
					locs = new SafeHouse(play);
					break;
				case 2:
					locs = new WareHouse(play);
					break;
				case 3:
					locs = new Cave(play);
					break;
				case 4:
					locs = new Forest(play);
					break;
				case 5:
					locs = new River(play);
					break;
				case 6:
					locs = new Mine(play);
					break;
				default:
					System.out.println("Invalid selection.Please try again.");
			}
			
			
			if(locs == null) {
				System.out.println("You quickly gave up on this misty and dark island.");
				break;
			}
			if(!locs.onLocation()) {
				System.out.println("GAME OVER!!");
				break;
			}
			System.out.println();
			
		}
		
	}

}
