import java.util.Random;
public class Snake extends Monster{
	static Random random = new Random();
	public Snake() {
		
		super(4, "Snake", random.nextInt(3)+3, 12, 0);
		// TODO Auto-generated constructor stub
	}
	
}
