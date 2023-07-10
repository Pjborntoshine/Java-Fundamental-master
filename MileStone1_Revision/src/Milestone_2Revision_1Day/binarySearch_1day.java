package Milestone_2Revision_1Day;

import java.util.Scanner;

public class binarySearch_1day {
	public static int binarySearch(int[] arr, int x) {
		int st = 0;
		int end = arr.length-1;
		int mid = (st +end)/2;
		while(true) {
//			System.out.println("1");
			if(arr[mid]<x) {
				st = mid+1;
				mid = (st+end)/2;if(arr[mid]==x) {
					return mid;
				}
				//System.out.println("2 "+ arr[st]+" "+arr[mid]);	
			}else if(arr[mid]>x){
				end = mid-1;
				
				mid = (st+end)/2;
				if(arr[mid]==x) {
					return mid;
				}
				//System.out.println("3"+ arr[mid]);
			}else if(arr[mid]==x){
				return mid;
			}
		}
		
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
