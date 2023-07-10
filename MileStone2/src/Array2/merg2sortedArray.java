package Array2;

public class merg2sortedArray {
	  public static int[] merge(int arr1[], int arr2[]) {
	    	//Your code goes here
	        	//Your code goes here
			   int i=0,j=0,k=0;
			   int[] arr3 = new int[arr1.length+arr2.length];
			   int kcount;
			   while((i<arr1.length && j<arr2.length) && k<arr3.length) {
				   if(arr1[i]<arr2[j]) {
					 
					   arr3[k] = arr1[i];i++;k++;
				   }else if(arr1[i]>arr2[j]) {
					 					   arr3[k] = arr2[j];j++;k++;
				   }
				   else if(arr1[i]==arr2[j]){
					   arr3[k]=arr1[i];i++;k++;
					   arr3[k]=arr2[j];j++;k++;
				   }
			   }
			   
			  int[] largeArr = arr1.length>arr2.length?arr1:arr2;
			 int z=0,remArr[];  
					 if(i==arr1.length) {
						 z=j;
						 remArr = arr2;
					 }else{
						 remArr = arr1;
						 z=i;
					 }
					 System.out.println(i+" "+j+" "+k+" "+z +" "+remArr[z]);
			  while(z<remArr.length) {
				  arr3[k] = remArr[z];k++;z++;
			  }
			  for(int l=0;l<arr3.length;l++) {
					System.out.print(arr3[l]+" ");
				}
			return arr3;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,3,4,7,11};
		int[]arr2 = {2,4,6,13};
		merge(arr1,arr2);
	}

}
