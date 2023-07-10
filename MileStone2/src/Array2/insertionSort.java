package Array2;

public class insertionSort {
//	public static void insertionSort(int[] arr) {
//    	//Your code goes here
//		if(arr.length==0) {
//			System.out.println("");return;
//		}
//		for(int i=0;i<arr.length;i++) {
//		int compop = arr[i];
//		int checkind =0;int swapindj=1;
//		for(int j=i+1;j<arr.length;j++) {
//			System.out.println(j+" "+compop);
//			for(int l=0;l<arr.length;l++) {
//				System.out.print(arr[l]+" ");
//			}
//			System.out.println();
//			if(compop>arr[j]) {
//			
//				int temp = arr[j];
//				arr[j]=arr[checkind];
//				arr[checkind]=temp;
//				checkind++;
//				// comp index
//				
//			}
//			//System.out.println(arr[checkind-1]);
//			for(int k=checkind;k>0;k--) {
//				if(arr[k]<arr[k-1]) {
//					int temp2 = arr[k];
//					arr[k]=arr[k-1];
//					arr[k-1]=temp2;
//				}
//			}
//			
//		}
//		
//		}
////		for(int l=0;l<arr.length;l++) {
////			System.out.print(arr[l]+" ");
////		}
//    }


	
//	public static void insertionSort(int[] arr) {
//		int sorted =0;
//		int unsorted = 1;
//		for(int i=0;i<arr.length;) {
////			int key=arr[i];
//			for(int j=i+1;j<arr.length;) {
//				
//				System.out.println("round"+" "+j+" "+arr[j]);
//				for(int l=0;l<arr.length;l++) {
//					System.out.print(arr[l]+" ");
//				}
//				System.out.println();
//				if(arr[i]>arr[j]) {
//					
//					int lastind = j;
//					System.out.println(arr[lastind]);
//					int temp = arr[j];
//					arr[j]=arr[i];
//					arr[i]=temp;
//					// checking the array;
//					if(arr[lastind]<arr[lastind-1]) {
//						int temp1 = arr[lastind];
//						arr[lastind] = arr[lastind-1];
//						arr[lastind-1]=temp;
//					}
//				}else {
//					j++;
//				}
//			}
//			i++;
//		}
//		for(int l=0;l<arr.length;l++) {
//			System.out.print(arr[l]+" ");
//		}
//	}

//	public static void insertionSort(int[] arr){
//	    int n=arr.length;
//	    for(int i=1;i<n;i++){
//	        //Insert ith element in sorted position
//	        int j=i-1;
//	        int temp=arr[i];
//	        while(j>=0 && arr[j]>temp){
//	        	
//				System.out.println();
//	            arr[j+1]=arr[j];
//	            j--;
//	        }
//	        //Position will be j+1;
//	        arr[j+1]=temp;
//	        System.out.println("round"+" "+j);
//			for(int l=0;l<arr.length;l++) {
//				System.out.print(arr[l]+" ");
//			}
//	       
//	    }
//	}
	

/******************
 * 
 * @param arr
 * done by ME on 1 day revision vvi
 */
	   public static void insertionSort(int[] arr) {
			 int i=0;
			 while(i<arr.length-1) {
				 if(arr[i]>arr[i+1]) {
//					 System.out.println(arr[i]);
//					 int compElement = arr[i];
					 // swap
					 int temp = arr[i];
					 arr[i]=arr[i+1];
					 arr[i+1]=temp;
					 int j=i;
//					 System.out.println(i+" "+j+" "+arr[j]+" "+arr[j-1]);
					 // need to swap among sorted part
					 while(j>0 && arr[j]<=arr[j-1] ) {
						 int t2 = arr[j];
						 arr[j]=arr[j-1];
						 arr[j-1]=t2;
						 j--;
					 }
//					
				 }else {
					 i++;
				 }
//				 for(int l=0;l<arr.length;l++) {
//						System.out.print(arr[l]+" ");
//					}
//				 System.out.println("");
//				 
			 }
			   for(int l=0;l<arr.length;l++) {
					System.out.print(arr[l]+" ");
				}
			 
		 }
	   
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[]={9,7,6,8,4,2,3 };
//		int arr[]={1,7,4,0,9,4 };
		int arr[]={1,7,14,0,9,4,18,18,2,4,5 };
		insertionSort(arr);
	}

}
