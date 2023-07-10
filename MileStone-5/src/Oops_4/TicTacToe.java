package Oops_4;

import java.util.Scanner;

public class TicTacToe {
	private Player player1, player2;
	private Board board;
	private int numPlayers;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicTacToe t = new TicTacToe();
		t.startGame();
	}
	public void startGame() {
		Scanner s = new Scanner(System.in);
		// take the player
		player1 = takePlayerInput(++numPlayers);
		player2 = takePlayerInput(++numPlayers);
		while(player1.getSymbol() == player2.getSymbol()) {
			System.out.println("symbol already taken please take other symbol");
			player2.setSymbol(s.next().charAt(0));
			
		}
		board = new Board(player1.getSymbol(), player2.getSymbol());
		// create the game board
		board = new Board(player1.getSymbol(), player2.getSymbol());
		
		// play the game
		boolean player1Trun = true;
		int status = Board.INCOMPLETE;
		while(status== Board.INVALIDMOVE || status == Board.INCOMPLETE) {
			if(player1Trun) {
				System.out.println("Player 1 trun" + player1.getPlayer());
				System.out.println("Enter x cord:");
				int x = s.nextInt();
				System.out.println("Enter y cord:");
				int y = s.nextInt();
				 status = board.move(player1.getSymbol(),x,y);
				if(status ==Board.INVALIDMOVE) {
					System.out.println("Invalid move !! please try again");
					continue;
				}
//				else {
//					player1Trun = false;
//					board.print();
//				}
			
			}else {
				System.out.println("Player 2 trun" + player2.getPlayer());
				System.out.println("Enter x cord:");
				int x = s.nextInt();
				System.out.println("Enter y cord:");
				int y = s.nextInt();
				 status = board.move(player2.getSymbol(),x,y);
				if(status ==Board.INVALIDMOVE) {
					System.out.println("Invalid move !! please try again");
					continue;
				}
//				else {
//					player1Trun = true;
//					board.print();
//				}
			}
			
			player1Trun = false;
			board.print();
			if(status == Board.PLAYER1WIN) {
				System.out.println("player 1 win" + " " + player1.getPlayer());
			}else if(status ==Board.PLAYER2WIN) {
				System.out.println("player 2 win" + " " + player2.getPlayer());
			}else if(status ==Board.DRAW){
				System.out.println("Draw !!");
			}
		}
	}
	private Player takePlayerInput(int num) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter palyer " + num + " name:" );
		String name  = s.nextLine();
		System.out.println("Enter palyer " + num + " symbol:" );
		char symbol = s.next().charAt(0);
		Player p = new Player(name, symbol);
		return p;
		
	}
}
