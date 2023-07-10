package MileStone2Array1Revision;

import java.util.Scanner;

public class sort01_1Week {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			
			//System.out.println("enter @ "+i);
				arr[i]=s.nextInt();
				}
		int i=0,j=arr.length-2;
		while(i!=j) {
			if(arr[i]==1) {
				// checking value of 1 from back
				if(arr[j]==0) {
					// swap 
					System.out.println("dasdas");
					int temp= arr[i];
					arr[i] = arr[j];
					arr[j] = temp;i++;
				}else {
					j--;
				}
			}else {
				i++;
			}
		}
		for(int l =0;l<arr.length;l++) {
			System.out.print(arr[l]+" ");
		}
	}

}
