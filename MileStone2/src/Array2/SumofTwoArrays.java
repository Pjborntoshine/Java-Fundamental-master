package Array2;

public class SumofTwoArrays {

    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	//Your code goes here
    	int largestArr = arr1.length>arr2.length?arr1.length:arr2.length;
    	int small = arr1.length<arr2.length?arr1.length:arr2.length;
    	int i=largestArr-1;
    	int j = small-1;int carry=0;
    	int m = output.length-1; 	int count=0;
    	while(i>=0 || j>=0) {
   	
    		int sum=0;
//    		System.out.println(arr1[i]);
    		if(j>=0) {
    		
    			sum=arr1[i]+arr2[j]+carry;
    			if(sum>9 && i!=0) {
    				carry=1;
    				int elem = sum%10;
    				output[m]=elem;
    				m--;
    			}else if(sum>9 && i==0) {
    				
    				int elem = sum%10;
    				output[m]=elem;
    				m--;
    				output[m] = 1;
    			}
    			
    			else {
    				System.out.println(sum);
    				output[m]=sum;m--;
    				carry=0;
    			}
    			j--;
    		}else{
    			System.out.println("asdas");
    			sum = arr1[i]+carry;
    			if(sum>9 && i!=0) {
    				carry=1;
    				int elem = sum%10;
    				output[m]=elem;
    				m--;
    			}else if(sum>9 && i==0) {
    				
    				int elem = sum%10;
    				output[m]=elem;
    				m--;
    				output[m] = 1;
    			}
    			
    			else {
    				System.out.println(sum);
    				output[m]=sum;m--;
    				carry=0;
    			}
    			
    		}
    		i--;
    	}
//    	for(int l=0;l<output.length;l++) {
//    		System.out.print(output[l]+" " );
//    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {9,7,6,1};
		int[] arr2= {4,5,9};
//		int[] arr1= {8,5,2};
//		int[] arr2= {1,3};
//		int[] arr1= {6,2,4};
//		int[] arr2= {7,5,6};
		int largestArr = arr1.length>arr2.length?arr1.length:arr2.length;
		int[] output =new int[largestArr+1]; 
		sumOfTwoArrays(arr1,arr2,output);
		
	}

}
