package Array1;

import java.util.Scanner;

public class ArrangeNumbersInArray {
	public static void arrange(int[] arr, int n) {
    	//Your code goes here
		
		int front=0;
		int back=n-1;
		for(int i=0;i<=n;i++) {
			if(front==back) {
				arr[front]=n;
				break;
			}
			if(i%2==0) {
				//System.out.println("f->"+ (i+1));
				arr[front]=i+1;front++;
			}else {
				//System.out.print("b"+(i+1));
				arr[back]=i+1;back--;
			}
			
			
		}
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		arrange(arr,n);
	}

}
