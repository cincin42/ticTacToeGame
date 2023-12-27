package ticTacToe;
import java.util.Scanner;
public class TicTacToe2App {

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TicTacToe2 game = new TicTacToe2();
		Scanner scr = new Scanner(System.in);
		String[][] board = game.board;
		String mark = game.mark;
		int row = game.row;
		int col = game.col;
		boolean player1 = game.player1;
		
		game.displayWelcomeMessage();
		game.initalizeBorad();
		game.displayGrid();
	
				
		while((game.isBoardFull() == false) && (game.isWinner() == false)) {
			mark = game.isPlayer1();
			
			while(true) {
				System.out.println(mark + "'s turn");
				System.out.println("Pick a row (1, 2, 3): ");
				row = scr.nextInt();
				System.out.print("Pick a column ( 1, 2, 3); ");
				col = scr.nextInt();
				if(row <= 3 && row > 0 && col <= 3 && col > 0 && board[row][col] == " ") {
					row = row -1;
					col = col - 1;
				
					break;
				}else {
					System.out.println("That is an invalid move. Try again. ");
					
				}
				
			}
			
			board[row][col] = mark;
			game.displayGrid();
			player1 = !player1;
		}
	
		
		
	}

}
