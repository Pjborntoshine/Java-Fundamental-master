package Oppos_4TryByMe_TictokToe;

public class Boardcl {
	char [][] board;
	char player1sym,player2sym;
	int size = 9;
	int count = 0;
	int Boardsize = 3;
	private static final char EMPTY = ' ';
	public static final int PLAYER1WIN= 1;
	public static final int PLAYER2WIN = 2;
	public static final int DRAW = 3;
	public static final int INCOMPLETE = 4;
	public static final int INVALIDMOVE = 5;
	public Boardcl(char player1sym, char player2sym) {
		board = new char[Boardsize][Boardsize];
		for(int i=0;i<Boardsize;i++) {
			for(int j=0;j<Boardsize;j++){
				board[i][j] = EMPTY;
			}
		}
		this.player1sym = player1sym;
		this.player2sym = player2sym;
	}
	
	public void print() {
		for(int i=0;i<Boardsize;i++) {
			for(int j=0;j<Boardsize;j++) {
				System.out.print("| " + board[i][j] + " |");
			}System.out.println();
		}
		System.out.println();
	}

	public int move(char symbol, int x, int y) {
		// TODO Auto-generated method stub
		if(x<0 || x>=Boardsize || y<0 || y>=Boardsize || board[x][y]!=EMPTY) {
			return INVALIDMOVE;
		}
		board[x][y] = symbol;
		count++;
		if(board[x][0] == board[x][1] && board[x][0] == board[x][2]) {
			if(symbol == player1sym) {
				return PLAYER1WIN;
			}else {
				return PLAYER2WIN;
			}
		}
		
		if(board[0][y] == board[1][y] && board[0][y] == board[2][y]) {
			if(symbol == player1sym) {
				return PLAYER1WIN;
			}else {
				return PLAYER2WIN;
			}
		}
		
		if(board[0][0] !=EMPTY && board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
			if(symbol == player1sym) {
				return PLAYER1WIN;
			}else {
				return PLAYER2WIN;
			}
		}
		
		if(board[0][2] !=EMPTY && board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
			if(symbol == player1sym) {
				return PLAYER1WIN;
			}else {
				return PLAYER2WIN;
			}
		}
		
		
		if(count == size) {
			return DRAW;
		}
		
		return INCOMPLETE;
	}
	
}
