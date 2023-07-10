package Array1;

import java.util.Scanner;

public class FindUnique {
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
	public static int findunique(int arr[]) {
	    if(arr.length==1){
            return arr[0];
        }
        	int unique = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			boolean flag = false;
			for(int j=0;j<arr.length;j++) {
				if(i!=j) {
					if(arr[i]==arr[j]) {
						flag=false;
						break;
					}else {
						flag = true;
					}
					
				}
				
			}
			if(flag) {
				 unique=arr[i];
                return unique;
			}
            if(!flag){
                unique = arr.length;
            }
			
		}
        return unique;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = takeInput();
		findunique(arr);
		
	}

}
