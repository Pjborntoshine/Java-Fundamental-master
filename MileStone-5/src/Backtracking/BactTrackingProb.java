package Backtracking;

public class BactTrackingProb {
/*
 * private static boolean isBoardSafe(int[][] board, int row, int column) {
		int N = board.length;
		// for each i and j you need to check in 6 directions, top down, 4 diagonals

		for (int i = row - 1, j = column - 1; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == 1) {
				return false;
			}
		}

		for (int i = row + 1, j = column + 1; i < N && j < N; i++, j++) {
			if (board[i][j] == 1) {
				return false;
			}
		}

		for (int i = row - 1, j = column + 1; i >= 0 && j < N; i--, j++) {
			if (board[i][j] == 1) {
				return false;
			}
		}

		for (int i = row + 1, j = column - 1; i < N && j >= 0; i++, j--) {
			if (board[i][j] == 1) {
				return false;
			}
		}

		for (int i = row - 1; i >= 0; i--) {
			if (board[i][column] == 1) {
				return false;
			}
		}

		for (int i = row + 1; i < N; i++) {
			if (board[i][column] == 1) {
				return false;
			}
		}

		return true;
	}
 * 
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int maze[][] = {{1,1,0},{1,1,0},{1,1,0}};
		int maze[][] = {{1,0,1},{1,0,1},{1,1,1}};
////		System.out.println(ratInAMaze(maze));
//		PrintratInAMaze(maze,maze.length);
//		ratInAMazeAllPath(maze,maze.length);
		placeNQueens(4);
	}
	
	// done by me
	public static void placeNQueens(int n){
		
		int board[][] = new int[n][n];
		placeQueenHel(board,n,0);

		}
	
	
	
private static void placeQueenHel(int[][] board, int n, int row) {
		// TODO Auto-generated method stub
		// base case
		if(row == n) {
			// print
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(board[i][j] + " ");
				}
			}
			System.out.println();
			return;
		}
		for(int col=0;col<n;col++) {
			// checking is board is safe to place 1
			if(isBoardSafe(board,row,col)) {
				board[row][col] = 1;
			}
			placeQueenHel(board,n,row+1);
			board[row][col] = 0;
		}
		return;
	}

	private static boolean isBoardSafe(int[][] board, int row, int col) {
	// TODO Auto-generated method stub
		for(int j=0;j<col;j++) {
			if(board[row][j] ==1) {
				return false;
			}
		}
		
		// top left diagonal check
		for(int i = row-1, j = col-1;i>=0 && j>=0;i--,j--) {
				if(board[i][j]==1) {
					return false;
				}
		}
		// top right diagonal 
		for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++) {
			if(board[i][j] ==1) {
				return false;
			}	
		}
		// bottome left diagonal 
		for(int i=row+1,j=col-1;i<board.length && j>=0;i++,j--) {
			if(board[i][j] ==1) {
				return false;
			}	
		}
		
		// bottom right diagonal 
		for(int i=row+1,j=col+1;i<board.length && j<board.length;i++,j++) {
			if(board[i][j] ==1) {
				return false;
			}	
		}
		for (int i = row + 1; i < board.length; i++) {
			if (board[i][col] == 1) {
				return false;
			}
		}
		
	return true;
}

	//	Code: Rat In a Maze All Paths 
	static void ratInAMazeAllPath(int maze[][], int n) {
		/* 
			* Your class should be named Solution.
			* Write your code here
		 */
     	int m = maze.length;
		int [][] path = new int[m][m];
		// System.out.println(ratInAMazeHelper(maze,0,0,path));
		ratInAMazeAllPathHelper(maze,0,0,path,n);
 
	}
	
	
	
private static void ratInAMazeAllPathHelper(int[][] maze, int i, int j, int[][] path, int n) {
		// TODO Auto-generated method stub
	//int n = maze.length;
	if(i<0 || i>=n || j<0 || j>=n || maze[i][j] == 0 || path[i][j] == 1) {
		return ;
	}
	
	if(i == n-1 && j == n-1) {
        //System.out.println("dasdas");
        path[i][j] = 1;
		for(int r = 0;r<n;r++){
        for(int c=0;c<n;c++) {
       		System.out.print(path[r][c] + " ");
        }
        	
        }
		path[i][j] = 0;
		
	}
	path[i][j] = 1;
	// top
	ratInAMazeAllPathHelper(maze,i-1,j,path,n);
	
	// right
	ratInAMazeAllPathHelper(maze,i,j+1,path,n);
	
	// down
	ratInAMazeAllPathHelper(maze,i+1,j,path,n);
	
	// left
	ratInAMazeAllPathHelper(maze,i,j-1,path,n);
	path[i][j] = 0;
	}



	//	Code: Rat In a Maze All Paths
	static int malen;
	static void PrintratInAMaze(int maze[][], int n) {
		int [][] path = new int[n][n];
		
		PrintratInAMaze(maze,0,0,path);
		
	}
	
	private static boolean PrintratInAMaze(int[][] maze, int i, int j, int[][] path) {
	// TODO Auto-generated method stub
		int n = maze.length;
		if(i<0 || i>=n || j<0 || j>=n  || maze[i][j] == 0 || path[i][j] == 1) {
//			System.out.print("0" + " ");
			return false;
		}
		path[i][j] = 1;
		if(i == n-1 || j == n-1) {
			for(int r=0;r<n;r++) {
				for(int c=0;c<n;c++) {
					System.out.print(path[r][c] + " ");
				}
			}
			return true;
		}
		
				// top
				if(PrintratInAMaze(maze,i-1,j,path)) {
					return true;
				}
				// right
				if(PrintratInAMaze(maze,i,j+1,path)) {
					return true;
				}
				// down
				if(PrintratInAMaze(maze,i+1,j,path)) {
					return true;
				}
				// left
				if(PrintratInAMaze(maze,i,j-1,path)) {
					return true;
				}
				return false;
	
}
	//Code: Rat In A Maze
	public static boolean ratInAMaze(int maze[][]){
		int n = maze.length;
		int [][] path = new int[n][n];
		return ratInAMazeHelper(maze,0,0,path);
	}
	private static boolean ratInAMazeHelper(int[][] maze,int i,int j, int[][] path) {
		// TODO Auto-generated method stub
		// base check
		int n = maze.length;
		if(i<0 || i>=n || j<0 || j>=n || maze[i][j] == 0 || path[i][j] == 1) {
			return false;
		}
		
		if(i == n-1 && j == n-1) {
			return true;
		}
		path[i][j] = 1;
		// top
		if(ratInAMazeHelper(maze,i-1,j,path)) {
			return true;
		}
		// right
		if(ratInAMazeHelper(maze,i,j+1,path)) {
			return true;
		}
		// down
		if(ratInAMazeHelper(maze,i+1,j,path)) {
			return true;
		}
		// left
		if(ratInAMazeHelper(maze,i,j-1,path)) {
			return true;
		}
		return false;
	}
	
	//Code: Rat In A Maze
}
