
public class BoxingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fighter Marc = new Fighter("Marc",10,100,100,30);
		Fighter Paul = new Fighter("Paul",15,100,85,40);
		
		Match m = new Match(Marc, Paul,85,100);
		
		m.beginFight();
		
	}

}
