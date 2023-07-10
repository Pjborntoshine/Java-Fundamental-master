package D2Array;

public class fun {public static void  fun(int[][] arr2d)
{

    for(int i=0;i<arr2d.length;i++)
    {
        for(int j=0;j<arr2d[i].length;j++)
        {
            arr2d[i][j]=2*i+j;
        }
    }
}
	public static void main(String[] args) 
	{ 
	    int[][] arr = new int[2][2]; 
	    fun(arr);
	    for(int i=0;i<2;i++)
	    {
	        for(int j=0;j<2;j++)
	        {
	            System.out.print(arr[i][j]+" " );
	        }
	    }
}
}
