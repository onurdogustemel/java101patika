import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
	
	Random random = new Random();
	Scanner input = new Scanner(System.in);
	int rowNumber;
	int colNumber;
	int mineNumber;
	int remain;
	String[][] board;
	String[][] empty;
	boolean isOkay = true;
	
	MineSweeper(int rowNumber, int colNumber){
		
		this.rowNumber = rowNumber;
		this.colNumber = colNumber;
		this.board = new String[this.rowNumber][this.colNumber];
		this.empty = new String[this.rowNumber][this.colNumber];
		this.mineNumber = (this.board.length*this.board[0].length)/4;
		this.remain = (this.board.length*this.board[0].length) - this.mineNumber;
		
	}
	
	void generateBoard(String[][] str) {
		
		for (int i = 0; i < str.length; i++) {
			for(int j = 0; j < str[i].length;j++) {
				
				if(str[i][j] == null) {
					
					str[i][j] = "-";
					
				}
				
				System.out.print(str[i][j] + " ");
			}
			
			System.out.println();
		}
	}
	
	void generateMines() {
		
		int rowMine, colMine;
		
		for (int i = 0; i < this.mineNumber;i++ ) {
			
			rowMine = (int)random.nextInt(this.rowNumber);
			colMine = (int)random.nextInt(this.colNumber);
			
			if (this.empty[rowMine][colMine] != "*" ) {

				this.empty[rowMine][colMine] = "*";
				
			}
		}
	}
	
	void moves(int newRow,int newCol) {
		
		int value = 0;

		if (this.empty[newRow][newCol].equals("-")) {
			
					
			if ((newRow > 0) && (this.empty[newRow - 1][newCol]).equals("*")) {
				
						
				value++;
					
						
			}
			
			if ((newRow < this.rowNumber-1) && (this.empty[newRow + 1][newCol]).equals("*")) {
						
				value++;
						
						
			}
			if ((newCol > 0) && (this.empty[newRow][newCol - 1]  ).equals("*")) {
						
				value++;
					
						
			}
			if ((newCol < this.colNumber-1) && (this.empty[newRow][newCol + 1] ).equals("*")) {
						
				value++;
					
						
			}
			if ((newCol < this.colNumber-1)&& (newRow < this.rowNumber-1) && (this.empty[newRow + 1][newCol + 1] ).equals("*")) {
						
				value++;
						
						
			}
			if ((newCol > 0) && (newRow > 0) && (this.empty[newRow - 1][newCol - 1]  ).equals("*")) {
						
				value++;
						
						
			}
			if ((newCol > 0) && (newRow < this.rowNumber-1) && (this.empty[newRow + 1][newCol - 1]  ).equals("*")) {
						
				value++;
						
						
			}
			if ((newCol < this.colNumber-1) && (newRow > 0) && (this.empty[newRow - 1][newCol + 1]  ).equals("*")) {
						
				value++;
		
			}
		}
		String number = Integer.toString(value);
		this.board[newRow][newCol] = number;
		
		generateBoard(this.board);	
	}
	
	void run() {
		
		int counter = 0;
		
		generateMines();
		System.out.println("The location of the mines");
		generateBoard(this.empty); // empty board mined
		
		System.out.println("=====================");
		System.out.println("Welcome to Minesweeper");
		generateBoard(this.board); //game board
		
		while(isOkay) {
			
			
			System.out.print("Enter the row coordinate: ");
			int playerRow = input.nextInt();
			System.out.print("Enter the column coordinate: ");
			int playerCol = input.nextInt();
			System.out.println("=====================");
			
			if (playerRow < 0 || playerRow >= this.rowNumber) {
				
				System.out.println("Oops! Invalid value, please try again.");
				continue;
				
			}else if (playerCol < 0 || playerCol >= this.colNumber) {
				
				System.out.println("Oops! Invalid value, please try again.");
				continue;
				
			}
			
			if (!this.empty[playerRow][playerCol].equals("*")) {
				
				moves(playerRow,playerCol);
				counter++;
				
				if(counter == this.remain){
					System.out.println("CONGRATS YOU WON !!!");
		            break;
				}
			}
			else {
				isOkay = false;
				System.out.println("YOU LOST, GAME OVER!!");
			}
		}
	}
}
