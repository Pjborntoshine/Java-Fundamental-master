package Array1;

import java.util.Scanner;

public class SwapAlternate {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
		
			System.out.println("enter @ "+i);
				arr[i]=s.nextInt();
				}
		return arr;
		
	}
	
public static int[] swapAlt(int arr[]) {
		System.out.println("asda"+arr.length);
		for(int i=0;i<arr.length;i+=2) {
			if(i==arr.length-1) {
				return arr;
			}
			int temp = arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
			
			
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = takeInput();
		int[] newarr = swapAlt(arr);
	for(int j=0;j<newarr.length;j++) {
		System.out.print(newarr[j]+" ");
	}
	}

}
