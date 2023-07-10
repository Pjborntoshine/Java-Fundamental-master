package Array2;

import java.util.Scanner;

public class PushZerostoend {
	public static void pushZerosAtEnd(int[] arr) {
    	//Your code goes here
		int i=0;
		int j=0;
		while(i<arr.length && j<arr.length)
		{
			
				System.out.println("dasda"+" "+arr[i]+" "+ arr[j]);
				if(arr[j]==0) {
						// swap them
					if(arr[i]!=0) {
						int temp = arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						j++;
					}
				
				}else if(arr[j]!=0){
					j++;
				}
				
		if(i<arr.length) {
			i++;
			}
		}
		for(int l=0;l<arr.length;l++) {
			System.out.print(arr[l]+" ");
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		//int n = s.nextInt();
		int[] arr = {9,0,0,8,2};
		pushZerosAtEnd(arr);
	}

}
