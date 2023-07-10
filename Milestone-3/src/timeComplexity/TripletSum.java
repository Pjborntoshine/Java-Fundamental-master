package timeComplexity;

import java.util.Arrays;

public class TripletSum {
	public static int tripletSum(int[] arr, int num) {
		//Your code goes here
		Arrays.sort(arr);
		int c=0;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length-1;i++) {
			
		
		int l=i+1;
		int r=arr.length-1;
		int k = arr[i];
		while(l<r) {
			
			int sum = arr[l] + k + arr[r];
			System.out.println("sum"+ arr[l]+" "+sum);
			if(sum==num) {
				c++;
				System.out.println(arr[l] + " "+ k+ " "+arr[r]);
				l++;r--;
			}else if(sum<num) {
				l++;
			}
			else if(sum>num) {
				r--;
			}
			
		}
		}
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[] = {1, 2, 3, 4, 5, 6, 7} ;
		int[] arr= {2, -5, 8, -6, 0, 5, 10, 11, -3};
		System.out.println(tripletSum(arr,10));
	}

}
