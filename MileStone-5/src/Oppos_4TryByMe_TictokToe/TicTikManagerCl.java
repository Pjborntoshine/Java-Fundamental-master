package Oppos_4TryByMe_TictokToe;

import java.util.Scanner;


public class TicTikManagerCl {
	private PlayerClass player1, player2;
	private Boardcl board;
	private int numPlayers;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicTikManagerCl t = new TicTikManagerCl();
		
		t.startGame();
	}
	private  void startGame() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		player1=  takeInput(++numPlayers);
		player2=  takeInput(++numPlayers);
		Boardcl board = new Boardcl(player1.getSymbol(), player2.getSymbol());
		
//		System.out.println(player1.getName() + " " + player2.getName());
		
		// crating new board
		while(player1.getSymbol() == player2.getSymbol()) {
			System.out.println(player2.getName() + " please select other symbol ");
			player2.setSymbol(s.next().charAt(0));
		}
		
		boolean player1Trun =true;
		int status =board.INCOMPLETE;
		while(status == board.INCOMPLETE || status == board.INVALIDMOVE) {
			
			if(player1Trun) {
				
				System.out.println(player1.getName());
				System.out.println("enter x coord - ");
				int x = s.nextInt();
				System.out.println("enter y coord - ");
				int y = s.nextInt();
				status = board.move(player1.getSymbol(),x,y);
				System.out.println(" status " + status);
				if(status == board.INVALIDMOVE) {
					System.out.println("Invalid please enter valid move");
					continue;
				}
				player1Trun = !player1Trun;
			}else {
			
				System.out.println(player2.getName());
				System.out.println("enter x coord - ");
				int x = s.nextInt();
				System.out.println("enter y coord - ");
				int y = s.nextInt();
				status =  board.move(player2.getSymbol(),x,y);
				System.out.println(" status p2" + status);
				if(status == board.INVALIDMOVE) {
					System.out.println("Invalid please enter valid move");
					continue;
				}
				player1Trun = !player1Trun;
			}
			board.print(); // priting the array
			if(status == board.PLAYER1WIN) {
				System.out.println("Player 1 ha won");
			}
			else if(status == board.PLAYER2WIN) {
				System.out.println("Player 2 ha won");
			}
			else if(status == board.DRAW) {
				System.out.println("Match is dwaw");
			}
			
			
			
		}
		
		
		
	}
	private PlayerClass takeInput(int noOfPlayer) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter player " + noOfPlayer );
		String player = s.next();
		System.out.println("Enter  symbol " + player);
		String symbol = s.next();
		PlayerClass pl = new PlayerClass(player, symbol.charAt(0));
		return pl;
		
		
	}

}
