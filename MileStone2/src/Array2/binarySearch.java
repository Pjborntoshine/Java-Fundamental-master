package Array2;

import java.util.Scanner;

public class binarySearch {
    public static int binarySearch(int[] arr, int x) {
	  	//Your code goes here
	 if(x==0 ||  arr.length==0) {
		 return -1;
	 }
	
	 int start  = 0;
	 int end = arr.length-1;
	 int mid = (start+end)/2;
//	 System.out.println(start+" "+end+" "+mid);
    if(arr[mid]==x) {
		 return mid;
	 }
	 while(start!=end) {
		 if(arr[mid]<x){
				
				start = mid+1;
				mid = (start+end)/2;
				if(arr[mid]==x) {
//					return x;
					return mid;
				}
			
				
			 }else {
				 end= mid-1;
				 mid =(start+end)/2;
				 if(arr[mid]==x) {
//						return x;
					 return mid;
					}
			 }
	 }
	
	 return -1; 
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
		
			arr[i]=s.nextInt();
		}
		System.out.println("Enter element you need to search");
		int x = s.nextInt();
		System.out.println(binarySearch(arr,x));
	}

}
