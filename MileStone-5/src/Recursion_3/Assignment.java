package Recursion_3;

public class Assignment {

	/*
		
		public static String[] permutationOfString(String input){
		// Write your code here
        if(input.length() == 0){
          return new String[1]; 
        }
        if(input.length() == 1){
            String[] arr = new String[1];
            arr[0] = input;
            return arr;
            
        }
		char c = input.charAt(0);
        String[] temp = permutationOfString(input.substring(1));
        String[] output = new String[temp.length * input.length()];
        int k = 0;
        for(int i =0; i< temp.length; i++){
            String newstr = temp[i];
            for(int j=0; j<newstr.length();j++){
               output[k] = newstr.substring(0,j)+c+newstr.substring(j);
                k = k + 1;
            }
            output[k] = newstr + c;
            k = k + 1;
            
        }
        return output;
	}
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
////		subsetsSumK();
////		int arr[] = {15, 20, 12};
////		subsets(arr);
////		System.out.println(fact(3));
////		permutationOfString("abc");
//		String[] st =new String[2];
//		st[0] = "gd";
//		st[1] = "dg";
//		
//		String a = "agd";
//		int ind = 3;
//
//		String newStr = "";
//		for(int i=0;i<st.length;i++) {
//			String st12 = st[i];
//			for(int j=0;j<st12.length()+1;j++) {
//				String onehf = st12.substring(0, i);
//				String secehf = st12.substring(i, st12.length());
//				String 
//				System.out.println(onehf + " " + secehf);
//			}
//			
//		}
//		System.out.println(newStr);
//		permutationOfStringHelper("adg");
//		int[] ip = {15,20,12};
//		printSubsets(ip);
//		int[] in = {5,12,3,17,1,18,15,3, 17 };
//		printSubsetsSumTok(in,6);
		permutations("abc");
	}
	//Strat Print Permutations of a String
	public static void permutations(String input){
		
//		int lenArr = fact(input.length());
//		String[] op = new String[lenArr];
//		permutationsHelper(input,0,op,0);
		permutationsHelper2(input,"");

	}
	private static void permutationsHelper2(String input, String ans) {
		// TODO Auto-generated method stub
//		System.out.println("das --" + input);
		if(input.length()==0) {
//			System.out.println("dasd");
			System.out.println(ans);
			return;
		}
		for(int i=0;i<input.length();i++) {
			char ch = input.charAt(i);
			String lfStr = input.substring(0, i);
			String rStr = input.substring(i+1);
			String rem = lfStr+rStr;
			permutationsHelper2(rem,ans+ch);
		}
	}
	private static void permutationsHelper(String input, int si, String[] op,int hInd) {
		// TODO Auto-generated method stub
		if(si ==input.length()) {
			for(int i=0;i<op.length;i++) {
				System.out.println("--" +op[i]);
			}
		
			return;
		}
		String str = input.substring(0,si) + input.substring(si+1,input.length());
		System.out.println(str+ "   [[[]");
		int chInd=0;
		for(int i=0;i<str.length()+1;i++) {
			boolean isPresent = false;
			StringBuilder sb;
			if(op[i] == null) {
				sb = new StringBuilder(" ");
			}else {
//				sb = new StringBuilder();
			}
			sb = new StringBuilder(str);
			 System.out.println("sb==" + sb + " -- "+ input.charAt(si) );
			sb.insert(chInd, input.charAt(si));chInd++;
			System.out.println(chInd + " ");
			String sbStr = sb+"";
			
			for(int j=0;j<op.length;j++) {
				System.out.println(sbStr + " " + op[j]);
				String st = op[j]+"";
				if(st!=null &&  st.equals(sbStr)) {
					System.out.println(sbStr + " 45");
					isPresent = true;break;
				}
			}
			if(!isPresent) {
				op[hInd] = sb+"";
				hInd++;
			}
			
		}
		chInd=0;
		permutationsHelper(input,si+1,op,hInd);
	}
	//end Print Permutations of a String
	// Start Print Subset Sum to K
	public static void printSubsetsSumTok(int input[], int k) {	
		// Write your code here
		int op[] = new int[1];
		printSubsetsSumTokhelper(input,k,0,op);
	}
	
	
	
	private static void printSubsetsSumTokhelper(int[] input, int k, int si, int[] op) {
//		System.out.println("dasda====" + input[si]);
		// TODO Auto-generated method stub
		if(si == input.length) {
//			System.out.println("dasd" + k);
			if(k==0) {// list is found
				for(int i=1;i<op.length;i++) {
					System.out.print(op[i]+" ");
				}
				System.out.println();
			}
			
			return;
		}
			int newop[] = new int[op.length+1];
			int ind=0;
			for(int i=0;i<op.length;i++) {
				newop[ind] = op[i];
//				System.out.print(newop[ind] + " ");
				ind++;
			}
//			System.out.println();
//			System.out.println("si" +  si + " == " + newop.length + " " + input[si]);
			newop[ind] = input[si];
//			System.out.println("dasda-------");
			printSubsetsSumTokhelper(input,k-input[si],si+1,newop); // with
			printSubsetsSumTokhelper(input,k,si+1,op); // without
		}
	
/*
	if(si == op.length) {
			if(k==0) {
				for(int i=0;i<op.length;i++) {
					System.out.print(op[i] + " ");
				}
			}
			System.out.println();
			return;
		}
		int ind=0;
		int newArr[] = new int[op.length+1];
		for(int i=0;i<op.length;i++) {
			newArr[ind] = op[i];ind++;
		}
		newArr[ind] = op[si];
		int newSi=si+1;
		printSubsetsSumTokhelper(input,k-input[si],newSi,newArr);
		printSubsetsSumTokhelper(input,k,newSi,op);
 */

	// End Print Subset Sum to K
	// Print Subsets of Array
	public static void printSubsets(int input[]) {
		// Write your code here
		int ip[] = new int[1];
		printSubsetshelper(input,ip,0);
	}
	
	
	
	private static void printSubsetshelper(int[] input,  int[] ip,int si) {
		if(si == input.length) {
			for(int i=1;i<ip.length;i++) {
				System.out.print(ip[i] + " ");
			}
			System.out.println();
			return;
		}
		int op[] = new int[ip.length+ 1];
		int ind=0;
		for(int i=0;i<ip.length;i++) {
			op[ind] = ip[i];ind++;
		}
		op[ind] = input[si]; 
		printSubsetshelper(input,op,si+1);
		printSubsetshelper(input,ip,si+1);
	}
	// Print Subsets of Array
	
	
	//Return Permutations of a String
	public static String[] permutationOfString(String input){
		// Write your code here
		return permutationOfStringHelper(input);
	}
	
	
	private static String[] permutationOfStringHelper(String input) {
		// TODO Auto-generated method stub
		if(input.length() == 1) {
			String [] st = new String [1];
//			st[0] = "";
			return st;
		}
		String[]  smallop= permutationOfStringHelper(input.substring(1));
//		System.out.println("asdas" + input + "--" + smallop[0].length());
		int lenArr = fact(input.length());
		String opp[] = new String[lenArr];
		int ind=0;
		int conb = 0;
		
		for(int i=0;i<lenArr;i++) {
			for(int j=0;i<smallop.length;j++) {
				String str ;
				if(smallop[i] == null) {
					str="";
				}else {
					str = smallop[i];
				}
				System.out.println("--" + str);
				StringBuilder sb = new StringBuilder(str);
				for(int k=0;k<str.length()+1;k++) {
					sb.insert(conb, input.charAt(0));
					opp[ind] = sb+"";conb++;
					System.out.println(opp[ind] + " " + opp.length);
				}
				ind++;
			}
		}
//		System.out.println("----------");
		return opp;
	}
	private static int fact(int ip) {
		// TODO Auto-generated method stub
		if(ip ==0) {
			return 1;
			
		}
		return ip*fact(ip-1);
	}
	//Return subset of an array
	public static int[][] subsets(int input[]) {
		// Write your code here
		return subsetshelper(input,0);
	}
	
	
	private static int[][] subsetshelper(int[] input, int si) {
		// TODO Auto-generated method stub
		if(si == input.length) {
			// traverse till last
			return new int [1][1];
			}
		
		
		int[][] smallop =  subsetshelper(input, si+1);
		int index=0;
        
		int op[][] = new int[2*smallop.length][];
//        System.out.println(op.length);
        
		for(int i=0;i<smallop.length;i++) {
			op[i] = new int[smallop[i].length];
			for(int j=0;j<smallop[i].length;j++) {
				op[index][j] = smallop[i][j];
//				System.out.println(op[index][j] + " asdsa");
			}index++;
		}
		
		for(int i=0;i<smallop.length;i++) {
			op[i+index] = new int[smallop[i].length+1];
//			System.out.println(input[si]);
			op[i+index][0] = input[si];
			for(int j=0;j<smallop[i].length;j++) {
				op[index+i][j+1] = smallop[i][j];
			}
		}
		
		return op;
	}
	
	//Return subset of an array
	
	
	
	
	public static int[][] subsetsSumK(int input[], int k) {
		// Write your code here
		return subsetsSumKhelper(input,k,0);

	}

	
	
	
	
	
	
	
	
	
	
	private static int[][] subsetsSumKhelper(int[] input, int k, int si) {
		// TODO Auto-generated method stub
		if(si == input.length) {
			if(k == 0) {
				return new int[1][0];
			}else {
				return new int[0][0];
			}
		}
		
		int[][] ndar =  subsetsSumKhelper(input,k-input[si],si+1);
		int[][] ndar2 = subsetsSumKhelper(input,k,si+1);
		int op[][] = new int[ndar.length + ndar2.length][];
		int lenghth = 0;
		for(int i=0;i<ndar2.length;i++) {
			op[i] = new int[ndar2[i].length];
			for(int j=0;j<ndar2[i].length;j++) {
				op[lenghth][j] = ndar2[i][j];
			}
			lenghth++;
		}
		
		for(int i=0;i<ndar.length;i++) {
			op[i+lenghth] = new int[ndar[i].length+1];
			op[i+lenghth][0] = input[si];
			for(int j=1;j<=ndar[i].length;j++) {
				op[i+lenghth][j] = ndar[i][j-1];
			}
		}
		
		
		return op;
	}
	
}
