package D2Array;

public class wavePrint {
	public static void wavePrint(int mat[][]){
		 if(mat.length==0){
	            // System.out.println("0");
	            return;

	        }
		//Your code goes here
		int j=0;
		int i=0;
		int travs=0;
		System.out.println(mat[0].length-1);
		while(travs<mat[0].length) {
			int istart = j%2==0?0:mat.length-1;
			int cstart = j%2==0?0:1;
			while(istart<mat.length && istart>=0) {
				System.out.print(mat[istart][j]+" ");
				if(cstart==0) {
					istart++;
				}else {
					istart--;
				}
			
			}
			//System.out.println();
			travs++;
			j++;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] arr = { {1,2,3},
				 		 {4,5,6},
				 		 {7,8,9},
				 		 {10,11,12},
				 		 {13,14,15}}; 
		 int[][] arr2= {{}};
		 System.out.println();
		 wavePrint(arr2);
	}

}
