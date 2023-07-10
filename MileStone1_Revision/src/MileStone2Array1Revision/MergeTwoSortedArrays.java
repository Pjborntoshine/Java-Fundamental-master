package MileStone2Array1Revision;

public class MergeTwoSortedArrays {
	public static int[] merge2SortedArrays(int[] arr1,int[]arr2){
		int largearr = arr1.length>arr2.length?arr1.length:arr2.length;
		int smallarr = arr1.length<arr2.length?arr1.length:arr2.length;
		int arr3[] =new int[largearr+smallarr];
		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length){
			
//			i<largearr && j<smallarr
			if(arr1[i]<=arr2[j]) {
				arr3[k]=arr1[i];i++;k++;
			
			}
			else if( arr1[i]>arr2[j]){
				arr3[k]=arr2[j];j++;k++;
			}
			
		}
		int remInd = i==arr1.length?j:i;
		int[] remArr = i==arr1.length?arr2:arr1;
		while(remInd<remArr.length) {
			arr3[k]=remArr[remInd];k++;remInd++;
		}
		return arr3;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,3,4,7,11};
		int[]arr2 = {2,4,6,13};
		  int arr3[]=merge2SortedArrays(arr1,arr2);
		  for(int i=0;i<arr3.length;i++) {
			  System.out.println(arr3[i]);
		  }
	}

}
