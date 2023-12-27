package ticTacToe;
import java.util.Scanner;
public class TicTacToe2 {

	
	public TicTacToe2() {
		
	}
	
	public String[][] board = new String[3][3];
	public String mark = "X";
	public int row = 0;
	public int col = 0;
	Scanner scr = new Scanner(System.in);
	public boolean player1 = true;
	

	public void initalizeBorad() {
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				board[i][j] = " ";
			}
		}
	}
	
	public void displayWelcomeMessage() {
		System.out.println("Welcome to Tic Tac Toe");
		System.out.println("++++++++++++++++++++++");
		System.out.println();
	}
	
	
	public void displayGrid() {
		for (int i = 0; i < board.length; i++) {
			System.out.println("| "+board[i][0] + " | " + board[i][1] + " | " + board[i][2] +  " |");
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		}
	}
	
	
	public boolean isWinner() {
		for(int i = 0; i < board.length; i++) {
			if(board[i][0] == mark && board[i][1] == mark && board[i][2] == mark) {
				return true;
			}
			
			if(board[0][i] == mark && board[1][i] == mark && board[2][i] == mark) {
				return true;
			}
		}
		if((board[0][0] == mark && board[1][1] == mark &&board[2][2] == mark) || (board[2][0] == mark && board[1][1] == mark && board[0][2] == mark)) {
			return true;
		}
		return false;
	}
	
	
	public boolean isBoardFull() {
		for (int i = 0; i < board.length; i++) {
			if(board[i][0] == " " && board[i][1] == " " && board[i][2] == " ") {
				return false;
			}
		}
		return true;
	}
	
	public String isPlayer1() {
		if(player1 == true) {
			mark = "X";
		}else {
			mark = "O";
		}
		return mark;
	}
	
	
}
