package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,2,2,3,1,6,2,5};
//		ArrayList<Integer> op = removeDulpicate(arr);
//		for(Integer i: op) {
//			System.out.print(i + " ");
//		}
		int[] arr2 = {2 ,12, 2, 11, 12, 2, 1, 2, 2, 11, 12, 2, 6 }; 
		//System.out.println( maxFrequencyNumber(arr2));	
		int[] arr1 = {2 ,6, 8, 5, 4, 3};
		int[] arr3 = {2 , 3, 4, 7};
		printIntersection(arr1,arr3);
		int[] arr4 = {-2,2,6,-2,2,-6,3};
		System.out.println(PairSum(arr4,arr4.length));
	}
	
	/******* start Pair Sum to 0 ********/
	public static int PairSum(int[] input, int size) {
	HashMap<Integer, Integer> mp = new HashMap<>();int ans =0;
		for(int i=0;i<input.length;i++) {
			if(mp.isEmpty()) {
				mp.put(input[i], 1);
			}else {
				int tt = input[i];
				tt*=-1;
				System.out.println("tt" + tt);
				if(mp.containsKey(tt)) {
//					System.out.println(input[i]);
//					int v = mp.get(input[i]) ;
//					System.out.println("--" + mp.get(tt));
//					System.out.println("v" + v);
//					ans+=v;
				}
				
				if(mp.containsKey(input[i])) {	
					int value = mp.get(input[i]);
					mp.put(input[i],value +1);
				}else {
					mp.put(input[i], 1);
				}
			}
			
		}
		
		Set<Integer> key = mp.keySet();
		for(Integer kt:key) {
			System.out.println("key "+ key + " val " + mp.get(kt)) ;
		}
	return ans;
	}
	/*******End Pair Sum to 0 ********/

	/******* Start Print Intersection ********/

	public static void printIntersectionSirWay(int[] arr1,int[] arr2){
	
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<arr1.length;i++) {
			if(map.containsKey(arr1[i])) {
				int val = map.get(arr1[i]);
				map.put(arr1[i], val+1);
			}else {
				map.put(arr1[i],1);
			}
		}
		for(int i=0;i<arr2.length;i++) {
			if(map.containsKey(arr2[i])) {
				int freq = map.get(arr2[i]);
				if(freq>0) {
					System.out.println(arr2[i]);
					map.put(arr2[i], freq-1);
				}
			}
		}
		
	}
	
	
	public static void printIntersection(int[] arr1,int[] arr2){
		int smallArr[] ;
		int largeArr[];
		if(arr1.length<=arr2.length) {
			smallArr = arr1;
			largeArr = arr2;
		}else {
			smallArr = arr2;
			largeArr = arr1;
		}
		HashMap<Integer, Boolean> hmp = new HashMap<>();
		for(int i=0;i<largeArr.length;i++) {
			hmp.put(largeArr[i], true);
		}
		
		for(int i=0;i<smallArr.length;i++) {
			if(hmp.containsKey(smallArr[i])){
				System.out.println(smallArr[i]);
			}
		}
//		Set<Integer> keys= hmp.keySet();
//		for(Integer k:  keys) {
//			System.out.println(k);
//		}
		
	}
	
	/******* End Print Intersection ********/
	
	
	
	
	/****maximum occ
	 * 
	 * @param arr
	 * @return
	 */
	
	public static int maxFrequencyNumber(int[] arr){ 
		int ans = Integer.MIN_VALUE;
		HashMap<Integer, Integer> mp = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(mp.containsKey(arr[i])) {
				mp.put(arr[i], mp.get(arr[i]) + 1);
			}
			else {
				mp.put(arr[i], 1);
			}
			
		}
		int compVal = Integer.MIN_VALUE;
		Set<Integer> keys= mp.keySet();
		for(Integer s:keys) {
//			System.out.println(s + " - " + mp.get(s));
			if(compVal<mp.get(s)) {
				compVal = mp.get(s);
				ans = s;
			}
			//System.out.println("ans" + ans);
		
		}
//		System.out.println("---" + ans);
		return ans;
		
    }
	
	/****maximum occ
	 * 
	 * @param arr
	 * @return
	 */
	
	private static ArrayList<Integer> removeDulpicate(int[] arr) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> op = new ArrayList<>();
		HashMap<Integer, Boolean> mp = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(mp.containsKey(arr[i])) {
				continue;
			}
			op.add(arr[i]);
			mp.put(arr[i],true);
		}
		return op;
	}

}
