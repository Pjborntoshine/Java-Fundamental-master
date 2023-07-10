package Recursion21Day;

public class BiarySarch {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] ={1,2,3,4,5,6,7};
		int si=0;
		int ei = arr.length-1;
		System.out.println(binarySearchUsingRec(arr,si,ei,5));
	}

//	private static int binarySearchUsingRec(int[] arr, int si, int ei, int x) {
//		// TODO Auto-generated method stub
//		if(si>ei) {
//			return -1;
//		}
//		int mid = (si + ei)/2 ;
////		System.out.println(mid);
//		if(arr[mid] == x) {
//			return mid;
//		}
//		if(x>arr[mid]) {
//			si = mid+1;
//			ei = arr.length-1;
//		int smallop = 	binarySearchUsingRec(arr,si,ei,x);
//		return smallop;
//		}else  {
//			si=0;
//			ei = mid-1;
//			int smallOp= binarySearchUsingRec(arr,si,ei,x);
//		return smallOp;
//		}
//		
//		//return 1;
//	}

	private static int binarySearchUsingRec(int[] arr, int si, int ei, int x) {
		
		int mid = (si+ei) / 2;
		if(arr[mid] == x) {
			return mid;
		}
		if(x<arr[mid]) {
			si=0;
			ei = mid-1;
			return binarySearchUsingRec(arr,si,ei,x);
		}else {
			si = mid+1;
			ei = arr.length-1;
			return binarySearchUsingRec(arr,si,ei,x);
		}
		
		
		
	}

	
	
}
