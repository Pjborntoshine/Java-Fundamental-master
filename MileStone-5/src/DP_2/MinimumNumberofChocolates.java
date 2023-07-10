package DP_2;

public class MinimumNumberofChocolates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,4,4,6};
		getMin(arr,4);
	}

	public static int getMin(int arr[], int N){
		int lArr[] = new int[arr.length];
		lArr[0] =1;
		int rArr[] = new int[arr.length];
		rArr[N-1] =1;
		int opArr[] = new int[arr.length];
//		int anrec = getMinREC(arr,0,arr.length-1, lArr,rArr ,opArr);
//		System.out.println(anrec);
//        return anrec;
//    
	int ansRec = 	getMinRECRetry(arr,0,arr.length-1, lArr,rArr);
	return ansRec;
	}

	private static int getMinRECRetry(int[] arr,int si ,int n,int[] lArr ,int[] rArr) {
		for(int i=0;i<arr.length-1;i++) {
				
			if(arr[i+1] > arr[i]) {
				
				lArr[i+1] = lArr[i] +1; 
			}else {
				lArr[i+1] =1;
			}
		}
		for(int i=si;i<lArr.length;i++) {
			System.out.print(lArr[i]);
		}
		System.out.println();
		
		for(int i=arr.length-1;i>0;i--) {
			
			if(arr[i-1] > arr[i]) {
				
				rArr[i-1] = rArr[i] +1; 
			}else {
				rArr[i-1] =1;
			}
		}
		
		for(int i=si;i<lArr.length;i++) {
			System.out.print(rArr[i]);
		}
		
		int ans =0;
		for(int i=arr.length-1;i>=0;i--) {
			ans+=Math.max(lArr[i], rArr[i]);
		}
		System.out.println(ans);
		
		return 0;
	}
	
	
	private static int getMinREC(int[] arr,int si ,int n,int[] lArr ,int[] rArr,int opArr[]) {
		// TODO Auto-generated method stub
	
		if(si == arr.length-1 || n==0) {
			System.out.println(si);
			return 1;
		}
		
		
		if(arr[si+1] > arr[si]) {
		
			lArr[si+1] = lArr[si] +1; 
		}else {
			lArr[si+1] =1;
		}
		
		
		int siMin = getMinREC(arr,si+1,n,lArr,rArr,opArr);
		
		for(int i=si;i<lArr.length;i++) {
			System.out.print(lArr[i]);
		}
		System.out.println();
		
		if(arr[n-1] > arr[n]) {			
			rArr[n-1] = rArr[n] +1; 
		}else {
			rArr[n-1] =1;
		}
//		
		int ei = getMinREC(arr,si,n-1,lArr,rArr,opArr);
		
		for(int i=si;i<lArr.length;i++) {
			System.out.print(rArr[i]);
		}
		System.out.println();
		opArr[n] = 	Math.max(lArr[n], rArr[n]);
		return 0;
	}
	
}
