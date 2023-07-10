package D2Array;

public class TotalSumontheBoundariesandDiagonals {

	public static void totalSum(int[][] mat) {
		//Your code goes here
		int travs = 0;
		int i=0;
		int j=0;
		int ri5=1;
		int ri6 = 1;
		int rj6 = mat[0].length-2;
		boolean f= true;
		int r4=mat[0].length-2;
		int t4 = mat.length-2;
		int sum=0;
		while(travs<6) {
			while(f) {
				if(travs==0) {
					if(j<mat[0].length-1) {
						sum+=mat[i][j];
						//System.out.print(mat[i][j]+" ");
						j++;
						
					}
					else {
						//System.out.println();
						travs++;
						
						
					}
				}else if(travs==1) {
					if(i<mat.length) {
						sum+=mat[i][mat[0].length-1];
						//System.out.print(mat[i][mat[0].length-1]+" ");
						i++;
					}else {
						//System.out.println();
						travs++;
//						
					}
				}else if(travs==2) {
					i=mat.length-1;
				
					if(r4>=0) {
						sum+=mat[i][r4];
						//System.out.print(mat[i][r4]+" ");
						r4--;
					}else {
						//System.out.println();
						travs++;
						
					}
				}else if(travs==3) {
					int k=0;
					if(t4>0) {
						sum+=mat[t4][k];
						//System.out.print(mat[t4][k]+" ");
						t4--;
					}
					else {
						//System.out.println();
					travs++;
				}
			}else if(travs==4) {
					if(ri5<mat.length-1) {
						sum+=mat[ri5][ri5];
						//System.out.print(mat[ri5][ri5]+" ");
						ri5++;
					}else {
						//System.out.println();
						travs++;
						
					}
			}
			else if(travs==5) {
//				System.out.print(ri6+" - "+rj6+" ");
				if(ri6<mat.length-1 && rj6>=0) {
					 if(ri6==rj6) {
						 ri6++;rj6--;
						 continue;
					 }
					sum+=mat[ri6][rj6];
					//System.out.print(mat[ri6][rj6]+" ");
						ri6++;rj6--;
				}else {
					travs++;
				
				}
			}else if(travs==6) {
				System.out.println(sum);
				f=false;
				return;
//				break;
			}
				
				
			}

		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr = {{1,2,3},
					   {4,5,6},
					   {7,8,9}
		};	
//		int [][]arr = {
//					   {1,2,3,4,5},
//				   	   {6,7,8,9,10},
//				   	   {11,12,13,14,15},
//				   	   {16,17,18,19,20},
//				   	   {21,22,23,24,25}
//	};	
		
		totalSum(arr);
	}
	
}


