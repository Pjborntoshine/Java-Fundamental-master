package D2Array;

public class test1 {
	 public static void print2DArray(int input[][]) {
			// Write your code here
		 int noOfTimes = input.length;
			for(int i=0;i<input.length;i++){
				for(int k=0;k<noOfTimes;k++){
					 for(int j=0;j<input[0].length;j++){
					       System.out.print(input[i][j]+" ");
					   
						} System.out.println();
				}
			  
				noOfTimes--;
			}

		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr2d = {{1,2,3},{5,6,7},{9,10,11}};
	    print2DArray(arr2d);
	}

}
