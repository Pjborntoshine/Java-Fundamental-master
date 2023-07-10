package Array1;

import java.util.Scanner;

public class intersections {
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
	
    public static void intersections(int arr1[], int arr2[]) {
    	//Your code goes here
    	
    	int[] smallArr = arr1.length<arr2.length?arr1:arr2;
    	int[] largeArr = arr1.length>arr2.length?arr1:arr2;
    	int smArr = arr1.length<arr2.length?arr1.length:arr2.length;
    	int intersectArr[] = new int[smArr+1];
    	for(int l=0;l<intersectArr.length;l++) {
    		intersectArr[l] = -1;
    	}
    	int intind=0;

 	for(int i=0;i<arr1.length;i++) {
    		
    		for(int j=0;j<arr2.length;j++) {
    		
    			if(arr2[j]==arr1[i]) {
    				arr2[j]=Integer.MIN_VALUE;
    				intersectArr[intind]=arr1[i];intind++;
    				break;
    			}
    		}
    	}
    	for(int k=0;k<intersectArr.length;k++) {
    		if(intersectArr[k]!=-1) {
    			System.out.print(intersectArr[k]+" ");	
    		}
    		
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int[] arr1 = takeInput();
	 int[] arr2 = takeInput();
	 intersections(arr1,arr2);
	}

}
