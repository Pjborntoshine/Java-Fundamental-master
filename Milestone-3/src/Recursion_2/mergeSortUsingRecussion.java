package Recursion_2;

public class mergeSortUsingRecussion {

	private static void mergeSort(int[] arr) {
		// TODO Auto-generated method stub
		if(arr.length <=1) {
			return ;
		}
//			for(int i=0;i<arr.length;i++) {
//			
//			System.out.print(arr[i] + " ");
//		}
//			System.out.println();
			int mid =arr.length/2;
		int[] firstHalf = new int[mid];
		int[] secHalf = new int[arr.length-mid];
//		System.out.println(arr.length-mid + " "+ mid);
		for(int i=0;i<firstHalf.length;i++) {
			firstHalf[i]=arr[i];
		}
		int k=0;
		for(int i=mid;i<arr.length;i++) {
//			System.out.println("asda"+arr[i]);
			secHalf[k]=arr[i];k++;
		}
		int rertArr[] = new int[mid];
		  mergeSort(firstHalf);		
		 mergeSort(secHalf);
		 merger(firstHalf,secHalf,arr);

	}
	public static void merger(int[] firstHalf,int[] secHalf,int[] arr) {
//		System.out.println("arrlength"+firstHalf.length);
		int i=0;
		int j=0;
		int k=0;
		while(i<firstHalf.length && j<secHalf.length) {
			//System.out.print(firstHalf[i]+" "+secHalf[j]);j++;
			if(firstHalf[i]<=secHalf[j]) {
				//System.out.print(firstHalf[i]+" "+secHalf[j]);
				arr[k]=firstHalf[i];
				k++;
				i++;
			}else {
				arr[k]=secHalf[j];
				k++;
				j++;
			} 
			
		}
		if(i<firstHalf.length) {
			while(i<firstHalf.length) {
				arr[k] = firstHalf[i];k++;i++;
			}
		}
		if(j<secHalf.length) {
			while(j<secHalf.length) {
				arr[k] = secHalf[j];k++;j++;
			}
		}
//		for(int l=0;l<arr.length;l++) {
//			//System.out.print(arr[l] + " ");
//		}
//		System.out.println();
		
	}

//	  public static void mergeSort(int a[]){
//	        if(a.length<=1){
//	            return;
//	        }
//	        int b[]=new int[a.length/2];
//	        int c[]=new int[a.length-b.length];
//	  
//		      for(int i=0;i<a.length;i++){
//		          System.out.print(a[i]+" ");
//		      }
//		      System.out.println(" ");
//	        for(int i=0;i<a.length/2;i++){
//	            b[i]=a[i];
//	        }
//	        for(int i=a.length/2;i<a.length;i++){
//	            c[i-a.length/2]=a[i];
//	        }
//	        mergeSort(b);
//	        mergeSort(c);
//	       // merge(b,c,a);
//	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] ={6,5,4,3,2,1};
		int arr[] = {2 ,6 ,8 ,5 ,4 ,3};
		mergeSort(arr);
	}

	

}
