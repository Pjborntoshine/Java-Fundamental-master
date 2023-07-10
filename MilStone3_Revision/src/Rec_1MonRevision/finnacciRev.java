package Rec_1MonRevision;

public class finnacciRev {
	public static int fib(int n) {
		if(n==1 || n==2) {
			return 1;
		}
		int fin1 = fib(n-1);
		int fib2 = fib(n-2);
		return fin1 + fib2;
	}
	public static boolean arraySort(int[] arr) {
		if(arr.length == 1) {
			return true;
		}
		if(arr[0]>arr[1]) {
			System.out.println("dasda" + arr[0] +" =>" + arr[1]);
			return false;
		}
		
		int arrlen = arr.length-1;
		int newArr[] = new int[arr.length-1];
		for(int i=1;i<arr.length;i++) {
			newArr[i-1] =arr[i]; 
		}
		boolean isANs = arraySort(newArr);
		return isANs;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(fib(5));
	int[] arr2 = new int[] {1,2,3,4,5};
	System.out.println(arraySort(arr2));
	}

	
	
}
