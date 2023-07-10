package D2Array;

public class how2dArrayAreStored {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// in case of 2d array we generally store 1D row,[][] so each row is 1d array 
		int[][] arr2d = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		System.out.println(arr2d);
		System.out.println(arr2d[0]);
		System.out.println(arr2d[1]);
		System.out.println(arr2d.length);
		System.out.println(arr2d[0].length);
		  int[][] arr = { { 1, 2 }, { 3, 4 } }; 
		    System.out.println(arr[0][0]+arr[1][1]); 
		    /*
		     * vvi 
		     * to get no of "rows" arr.length
		     * to get no of "col" arr[0].length
		     */
	}

}
