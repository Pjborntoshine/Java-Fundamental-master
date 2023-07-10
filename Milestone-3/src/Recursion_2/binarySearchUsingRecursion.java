package Recursion_2;

public class binarySearchUsingRecursion {
public static int binarySearchUsingRec(int arr[], int si, int ei,int x) {
	if(si>ei) { // element not found
		return -1;
	}
	int mid = si+ei/2;
	System.out.println("mid" + mid);
	if(arr[mid]==x) {
		return mid;
	}
	if(arr[mid]<=x) {
		si = mid;
		ei =arr.length-1;
		int smallOp =  binarySearchUsingRec(arr,si+1,ei,x);
		return smallOp;
	}else{
		si=0;
		ei = mid-1;
		int smallOp =  binarySearchUsingRec(arr,si+1,ei,x);
		return smallOp;
	}

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] ={1,2,3,4,5,6};
		int si=0;
		int ei = arr.length-1;
		System.out.println(binarySearchUsingRec(arr,si,ei,100));
	}

}
