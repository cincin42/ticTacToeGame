package ticTacToe;
import java.util.Scanner;
public class TicTacToe {	
	public char[][] board = new char[3][3];
	public char player;
	public int row, col;
	Scanner scr = new Scanner(System.in);
	boolean player1 = true;
	
	public TicTacToe(){

	}
	
	
	public void initalizeBoard(char[][] board) {
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				board[i][j] = ' ';
			}
		}
	}
	
	
	public boolean isPlayer1Turn() {
		if(player1 == true) {
			return true;
		}
		return false;
	}
	
	public void displayGrid() {
		System.out.println("+---+---+---+");
		for(int i = 0; i < board.length; i++) {
			System.out.println("| " + board[i][0] + " | "+ board[i][1] + " | " + board[i][2] + "|");
			System.out.println("+---+---+---+");
		
		}
	}
	
	
	public void displayWelcomeMessage() {
		System.out.println("Welcome to Tic Tac Toe|");
		System.out.println();
	}
	

	
	public boolean isValidEntry() {
		if(row > 0 && row <= 3 || col > 0 && col <= 3) {
			return true;
		}else {
			return false;
		}
	}
	public boolean isSpotTaken() {
		if(board[row][col] == ' ') {

			return false;
		}
		return true;
	}
	
	public boolean isWinner(char[][] board) {
		
		//To check index of board
		for(int i = 0; i < board.length; i++) {
			
			//check each row  and col for a winner
			if(board[i][0] == player && board[i][1] == player && board[i][2] == player) {
				return true;
			}else if(board[0][i] == player && board[1][i] == player && board[2][i] == player) {
				return true;
			}else{
				break;
			}
		}
		
		//Check diagonally for winner
		if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) || (board[0][2] == player && board[1][1] == player && board[0][2] == player)) {
			return true;
		}
		return true;
	}
	
	

	public void takeTurn() {
		
		if(isPlayer1Turn()) {
			player = 'X';
			
		}
		else {
			player = 'O';
		}
		
		System.out.println("\n" + player + "'s turn");
		System.out.print("Pick a row (1, 2, 3): ");
		row = scr.nextInt();
		isValidEntry();
		System.out.print("Pick a column(1, 2, 3): ");
		col = scr.nextInt();
		isValidEntry();
	
		row = row - 1;
		col = col - 1;
		board[row][col] = player;
		player1 = !player1;
	}
	
	
	
	
	public static boolean boardIsFull (char[][] board) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(board[i][j] == ' ') {
					return false;
				}	
			}
		}
		return true;
	}
	
	public static char playerHasWon(char[][] board) {
		for(int i = 0; i < 3; i++) {
			if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
				return board[i][0];
			}
		}
		for(int j =0; j < 3; j++) {
			if(board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != ' ') {
				return board[0][j];
			}
		}
		if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {
			return board[0][0];
		}
		if(board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[2][0] != ' ') {
			return board[2][0];
		}
	
		return ' ';
	}
	
	public void startGame(char[][] board, ]) {
		boolean gameEnded = true;
		
		while(!gameEnded) {
			takeTurn();
			isWinner(board);
			gameEnded = isWinner(board);
		}
	}

}
