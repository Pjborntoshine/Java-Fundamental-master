package TimeComplexity;

public class arrayEquilibriumIndex1ayRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = {1, 4, 9, 3, 2};
		int arr[] = {2, 3, 10, -10, 4, 2, 9};
		System.out.println(arrayEquilibriumIndex(arr));
	}

	private static int arrayEquilibriumIndex(int[] arr) {
		// TODO Auto-generated method stub
		int lSum = arr[0];
		int rsum =0;
		for(int i=2;i<arr.length;i++) {
			rsum+=arr[i];
		}
		System.out.println(rsum);
		int i=2;
		int j=0;
		int eq=0;
		while(i<arr.length) {
			System.out.println("array elem" + arr[i]);
			
				lSum += arr[i-1];
				rsum-= arr[i];
				System.out.println(lSum +" ->" + rsum);
				if(lSum == rsum) {
					
					return i;
					
				}
			i++;
		}
		System.out.println(eq);
		if(eq!=0) {
			return eq;
		}
		return -1;
	}

}
