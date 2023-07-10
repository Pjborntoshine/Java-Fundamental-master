package Array2;

import java.util.Scanner;

public class CheckArrayRotation {
	 public static int arrayRotateCheck(int[] arr){
	    	//Your code goes here
		 int i=1;
		 int count = 1;
		 while(i<arr.length)
		 {
			 if(arr[i-1]>arr[i]) {
				 return count;
			 }else {
				 count++;
			 }
			 i++;
		 }
	      return 0;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner s = new Scanner(System.in);
			//int n = s.nextInt();
//			int[] arr = {5,6,1,2,3,4};
		  int[] arr = {3,6,8,9,10};
		  int a = arrayRotateCheck(arr);
			System.out.println(a);
	}

}
