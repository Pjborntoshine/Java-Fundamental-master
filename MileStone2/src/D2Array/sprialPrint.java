package D2Array;

public class sprialPrint {
	public static void spiralPrint(int matrix[][]){
		//Your code goes here
		int totaltravs = matrix.length*matrix[0].length;
		int i=0;
		int j=0;
		int traves=0;
		int cs = 0;
		int ce=matrix[0].length;
		int rs = 0;
		int re = matrix.length;
		int check=0;
		int d=0;
		int upRow=0;
		int upcol=0;
		int upRowEnd = matrix.length;
		int upColEnd = matrix[0].length;
		int sec=0;

		while(traves<totaltravs) {
			// section wisaw loop
			if(sec==0) {
				if(j<=ce) {
					// need to pring the rows
					System.out.print(matrix[i][j]+" ");j++;traves++;
					if(j==ce) {
						sec++;i++;j--;
						rs++;
						
						
					}
				}
			}else  if(sec==1) {
				// need to print col wise
//				System.out.println("asdasd");
				if(i<=re) {
					System.out.print(matrix[i][j]+" ");i++;traves++;
					
					if(i==re) {
						i--;sec++;ce--;j=ce-1;
					}
				}
			}else  if(sec==2) {
				// printing in reverse order
			//System.out.println(j+" "+cs+" "+ce);
				if(j>=cs) {
					System.out.print(matrix[i][j]+" ");j--;traves++;
				}
				if(j==cs-1) {
					sec++;re--;i=re-1;j=cs;
				}
				
			}
			else if(sec==3) {
				
				if(i>=rs) 
				{
					//System.out.println("rs"+rs);
					System.out.print(matrix[i][j]+" ");i--;traves++;
					if(i==rs-1) {
						sec++;
					}
				}
			}
			else if(sec==4) {
			        upRow++;
		            upcol++;
		            upRowEnd--;
		            upColEnd--;
		            sec=(sec)%4;
					rs = upRow;
					cs = upcol;
					upRowEnd = re;
					upColEnd = ce;
					i=rs;
					j=cs;
					

			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { {1,2,3},
		 		 		{4,5,6},
		 		 		{7,8,9},
		 		 		{10,11,12},
		 		 		{13,14,15}};
		
		int[][] arr2 = { {1,2,3,4},
 		 				{14,15,16,5},
 		 				{13,20,17,6},
 		 				{12,19,18,7},
 		 				{11,10,9,8}
 		 		};
		int[][] arr3 = { {1,2,3,4},
	 				{5,6,7,8},
	 				{9,10,11,12},
	 				{13,14,15,16},
	 				{17,18,19,20}
	 				};
		spiralPrint(arr3);
	}

}
