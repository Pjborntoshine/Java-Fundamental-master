package D2Array;

public class RowWiseSum {
	public static void rowWiseSum(int[][] mat) {
		//Your code goes here
		int row = mat.length;
		int col = mat[0].length;
		System.out.println(row);
		for(int i=0;i<row;i++) {
			int sum=0;
			for(int j=0;j<col;j++) {
				sum+=mat[i][j];
			}
			System.out.println(sum);
		}
	}
	public static int fun(int[][] arr2d)
	{
	    int sum=0;
	    for(int i=0;i<arr2d.length;i++)
	    {
	        for(int j=0;j<arr2d[i].length;j++)
	        {
	            sum+=arr2d[i][j];
	        }
	    }
	    return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] arr1 = { {}, {} }; 
		 rowWiseSum(arr1);
		 int[][] arr = { {0,1,2,4,5}, {3,4,5,6,7},{5,6,7,8,9} }; 
		    System.out.println(fun(arr)); 
	}

}
