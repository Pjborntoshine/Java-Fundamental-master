package Array2;

public class Sort012 {

//	
//	 public static void sort012(int[] arr){
//	    	//Your code goes here
//		   int i=0,j = arr.length-1;;
//		   while(i<j) {
//			   
//			  if(arr[i]==0 && i>0) {
//				  
//				  // checking the previous element 
//				  if(arr[i-1]>arr[i]) {
//					  // swap
//					  int temp = arr[i-1];
//					  arr[i-1]=arr[i];
//					  arr[i] = temp;
//					  i++;
//					  
//				  }
//			  }else if(arr[i]==2){
//				  // looping the j value
//				  if(arr[j]<arr[i]) {
//					  // swap 0 and 2
//					  int temp = arr[i];
//					  arr[i]=arr[j];
//					  arr[j]=temp;
//					  j--;
//					  // checking the the back of i
//					  if(i>0 && arr[i-1]>arr[i]) {
//						  int temp2 = arr[i-1];
//						  arr[i-1]=arr[i];
//						  arr[i] = temp2;
//						  i++;
//					  }
//				  }else {
//					  j--;
//				  }
//				 
//			  }else {
//				  // 1 is at right position
//				  i++;
//			  }
//			  for(int l=0;l<arr.length;l++) {
//					System.out.print(arr[l]+" ");
//				}
//			  System.out.println("");
//			  
//		   }
//		  
//		 
//	    }

	 public static void sort012(int[] arr){
//	    	//Your code goes here
//		   int i=0,nz=0,nt= arr.length-1;;
//		   while(i<=nt) {
//			   System.out.println(nz +" "+nt +" i"+i);
//			   System.out.println("zero"+arr[nz]+" sda"+arr[i]);
//			   if(arr[i]==0 && i>0) {
//				 
//				   if(arr[nz]>arr[i]) {
//					   int temp = arr[nz];
//					   arr[nz] = arr[i];
//					   arr[i] = temp;
//					   nz++;
//					   i++;
//				   }
//				   if(arr[i]==0) {
//					   nz++;
//					   int temp = arr[nz];
//					   arr[nz] = arr[i];
//					   arr[i] = temp;
//					   nz++;
//					   i++;
//				   }
//				  
//				   
//			   }else if(arr[i]==2) {
//				   int temp = arr[i];
//				   arr[i] = arr[nt];
//				   arr[nt]=temp;
//				   nt--;
//				   // again check 
//				   // swapping to nz pos
//				   if(i>0&& arr[i]<arr[nz]) {
//					   int temp2 = arr[i];
//					   arr[i] = arr[nz];
//					   arr[nz] = temp2;
//					   nz=i;
//					   i++;
//				   }
//			   }else {
//				   i++;
//			   }
		 
		 int swap = 0;
	        int l = arr.length-1;
	        int i =0;
	        
	        while (i <= l){
	            
	            if (arr[i] == 0){
	               
	                int temp = arr[swap];
	                arr[swap] = arr[i];
	                arr[i] = temp;
	                i++;
	                swap++;
	                
	            }else if(arr[i]==2){
	                
	                int temp=arr[l];
	                arr[l] = arr[i];
	                arr[i] = temp;
	                l--;
	                
	            }else{
	                i++;
	            }
	        }
		
			  for(int m=0;m<arr.length;m++) {
					System.out.print(arr[m]+" ");
				}
			  System.out.println("");
			  
		   }
		  
		 
	    
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,2,0,2,0,1};
//		int[] arr = {2,2,0,1,1};
//		int[] arr = {0,1,2,0,1,2,0};
//		int[] arr = {1,0,2,1,0,1,2,0};
		sort012(arr);
	}
}
