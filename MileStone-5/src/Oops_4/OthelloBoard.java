package Oops_4;

public class OthelloBoard {
	private int board[][];
	final static int player1Symbol = 1;
	final static int player2Symbol = 2;
	final static int[] xDir = {-1,-1,0,1,1,1,0,-1};
	final static int[] yDir = {0,1,1,1,0,-1,-1,-1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

	public OthelloBoard() {
		board = new int[8][8];
		board[3][3] = player1Symbol;
		board[3][4] = player2Symbol;
		board[4][3] = player2Symbol;
		board[4][4] = player1Symbol;
	}

	public void print() {
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public boolean move(int symbol, int x, int y){
		// Complete this function
		/* Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		if(x<0 || x>=8 || y<0 || y>=8 || board[x][y]!=' ') {
			return false;
		}
		
		boolean movePossible = false;
		for(int i=0;i<xDir.length;i++) {
			int xStep = xDir[i];
			int yStep = yDir[i];
			int currX = x+xStep;
			int currY = y+yStep;
			int count =0;
			while(currX>=0 && currX<8 && currY>=0 && currY<8) {
				if(board[currX][currY] == 0) {
					break;
				}
				else if(board[currX][currY] !=symbol) {
					currX+=xStep;
					currY+=yStep;
					count++;
				}else {
					// conversion possible
					if(count>0) {
						movePossible = true;
						int convertX = currX - xStep;
						int convertY = currY - yStep;
						while(convertX !=x || convertY!=y) {
							board[convertX][convertY] = symbol;
							convertX = convertX - xStep;
							convertY = convertY - yStep;
						}
					}
					break;
				}
			}
		}
		if(movePossible) {
			board[x][y] = symbol;
		}
		return movePossible;

	}
}
