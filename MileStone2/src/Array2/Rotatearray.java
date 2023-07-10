package Array2;

public class Rotatearray {
//	  public static void rotate(int[] arr, int d) {
//	    	//Your code goes here
//		  int i=0;
//		  int pos = 0;
//		  while(i<arr.length) {
//			  if(arr[i]==d) {
//				  pos = i+1;
//				 int l=0;
//				  while(l<arr.length && pos<arr.length) {
//					//  System.out.println("pos"+pos + " "+ l);
//					  // swapping 1 an2
//					  int temp = arr[l]; 
//					  arr[l] = arr[pos];
//					  arr[pos]=temp;
//					  pos++;l++;
////					  for(int k=0;k<arr.length;k++) {
////							System.out.print(arr[k]+" ");
////						}
//					 
//				  }
//				  System.out.println(arr[i]);
//				  if(arr[i]!=arr[arr.length-1]) {
//					  int temp=arr[i];
//					  arr[i]=arr[arr.length-1];
//					  arr[arr.length-1] = temp;
//				  }
//				  for(int k=0;k<arr.length;k++) {
//						System.out.print(arr[k]+" ");
//					}
//				  return;
//			  }
//			  i++;
//		  }
////			for(int l=0;l<arr.length;l++) {
////				System.out.print(arr[l]+" ");
////			}
//	    }
	
	/*
	 * optimize algo
	 		 // code 
		 int temp[] = new int[d];
		 for(int i=0;i<d;i++) {
			 temp[i]=arr[i];
			 
		 }
		 int k=0;
		 // now 
		 for(int i=0;i<arr.length;i++) {
			 if((i+d)<=arr.length-1) {
				 arr[i]=arr[i+d];
				
			 }
			 if(i>=arr.length-d) {
				arr[i]=temp[k];k++;
			 }
			
		 }
		 for(int l=0;l<arr.length;l++) {
				System.out.print(arr[l]+" ");
			}
	  
	 */
	public static void rotate(int[] arr, int d) {
		 if(d==0){return;}
		int[] temp = new int[d];
		for(int i=0;i<d;i++) {
			temp[i]=arr[i];
			
		}
		int j=0,k=0;
		int secloopstart = arr.length-d;
		System.out.println(secloopstart);
		while(j<arr.length-d ||secloopstart<arr.length ) {
			if(j<arr.length-d) {
				arr[j]=arr[j+d];j++;
			}
		if(j==arr.length-d) {
			arr[secloopstart]=temp[k];k++;secloopstart++;
		}
		}
	
		for(int l=0;l<arr.length;l++) {
		System.out.print(arr[l]+" ");
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7};
		rotate(arr,5);
	}

}
