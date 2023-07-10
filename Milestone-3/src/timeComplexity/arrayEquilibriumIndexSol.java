package timeComplexity;

public class arrayEquilibriumIndexSol {

	public static int arrayEquilibriumIndex(int[] arr){  
		//Your code goes here
		//Your code goes here
        if(arr.length == 0){
            return -1;
        }
        int leftSum = 0;
		int rightsum = 0;
		int compElem = arr[0];
		int k=1;
//		 leftSum = arr[0];
		for(int i=1;i<arr.length;i++) {
			rightsum +=arr[i]; 
		}
		//System.out.println("right sum" + rightsum);
		for(int i=0;i<arr.length;i++) {
			if(i-1>=0 && i+1<=arr.length-1) {
				
				leftSum +=arr[i-1]; 
				rightsum -=arr[i]; 
				//System.out.println("i "+i +" "+ arr[i] + "->"+leftSum + " "+ rightsum);
//				System.out.println(rightsum);
//				System.out.println(leftSum);
				if(leftSum == rightsum) {
					return i;
				}
				
			}else if(i==arr.length-1) {
				//System.out.println("dasd");
			
				leftSum += arr[i-1];
				rightsum = 0;
				//System.out.println("i "+i +" "+ arr[i] + "->"+leftSum + " "+ rightsum);
				if(leftSum == rightsum) {
					return i;
				}
			}
			
			
		}
//		System.out.println(leftSum);
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = {1, 4, 9, 3, 2};
//		int arr[] = {1, 4, 6};
		int arr[] = {1, -1, 4};//TODO: need o check
//		int arr[] = {2, 3, 10, -10, 4, 2, 9};
		System.out.println(arrayEquilibriumIndex(arr));
	}

}
