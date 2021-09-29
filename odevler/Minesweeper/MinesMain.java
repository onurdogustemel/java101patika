import java.util.Scanner;

public class MinesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the row size of the board: ");
		int row = input.nextInt();
		
		System.out.print("Please enter the column size of the board: ");
		int col = input.nextInt();
		
		MineSweeper mine = new MineSweeper(row,col);
		mine.run();

	}

}
