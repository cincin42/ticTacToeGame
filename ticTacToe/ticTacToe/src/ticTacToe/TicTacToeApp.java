package ticTacToe;
import java.util.Scanner;

public class TicTacToeApp {

	

		
		TicTacToe game = new TicTacToe();
		
		char[][] board = game.board;
		char player = game.player;
		int row = game.row; 
		int col = game.col;
		Scanner scr = new Scanner(System.in);
		boolean player1 = true;
		
		
		game.initalizeBoard(board);
		game.displayWelcomeMessage();
		game.displayGrid();
		
		boolean gameEnded = true;
		
		game.startGame();
		
		
		
		
		
		/*
		TicTacToe game = new TicTacToe();
				char[][] board = game.board;
		char player = game.player;
		int row = game.row;
		int col = game.col;
		Scanner scr = new Scanner(System.in);
		
		game.displayWelcomeMessage();
		TicTacToe.initalizeBoard(board);
		game.displayGrid();
		
	
		boolean isWinner = game.isWinner(board, player);
		
		while(!isWinner) {
			player = 'X';
			game.turn(player);
			if(game.isValidMove(row, col)) {
				game.updateBoard(board, player);
				game.displayGrid();
			}
			else {
				System.out.println("That move is not allowed! Try again: ");
				break;
			}
			
			player = 'O';
			
			game.turn(player){
			if(game.isValidMove(row, col)) {
				game.updateBoard(board, player);
				game.displayGrid();
			}
			else {
				System.out.println("That move is not allowed! Try again: ");
			while (true) {
	         System.out.print("Enter a row number (1, 2, 3): ");
	         row = scr.nextInt();
	         System.out.print("Enter a column number (1, 2, 3): ");
	         col = scr.nextInt();
	         if (row < 0 || col < 0 || row > 2 || col > 2) {
	        	 System.out.println("Sorry you entered an invalid number. Try again");
			 } else if (board[row][col] != ' ') {
			     System.out.println("Someone has already made a "+ "move at this position! Try again.");
			 } else {
			     break;
			 }                        
		 }
			                         }
		 }
		
		
		*/
		
		
		
		
		/*
		while(game.isWinner(board, player) == false) {
	
				player = 'X';
				for(int i = 0; i < 2; i++) {
					game.turn(player);
					if(game.isValidMove(row, col)) {
						game.updateBoard(board, player);
						game.displayGrid();
					}else {
						System.out.println("Invalid Move! Try again");
					}
					player = 'O';
				}
				
				
				
				game.isWinner(board, player);
			}*/
	}


