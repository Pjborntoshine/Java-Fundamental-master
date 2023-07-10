package Array1;

import java.util.Scanner;

public class LinearSearch {
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
    public static int linearSearch(int arr[], int x) {
		//Your code goes here
        int searchIndex=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                searchIndex=i;
                return searchIndex;
            }
        }
    return searchIndex;
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
	int arr[] = takeInput();
	int searchIndex=linearSearch(arr,5);
	System.out.println(searchIndex);
	}
}
