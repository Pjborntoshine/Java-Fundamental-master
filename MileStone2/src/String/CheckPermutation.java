package String;

import java.util.Scanner;

public class CheckPermutation {
		public static boolean isPermutation(String str1, String str2) {  
		//Your code goes here
		if(str1.length()!=str2.length()) {
			return false;
		}
		if(str1.equals(str2)) {
			return true;
		}
		int i=0;
		int j=0;
		int n=str1.length();
		boolean flag = false;
		while(i<str1.length() && j<str2.length())
		{
//			System.out.println(i);
			if(str1.charAt(i)== str2.charAt(j)) {
				i++;
				System.out.println(str1.substring(i));
//				str2=str2.substring(i)
				str1= str1.substring(i);
				//System.out.println(str1);
				flag=true;
				
				i=0;j=0;
			}else if(str1.charAt(i)!= str2.charAt(j)){
//				System.out.println(str1.length());
//				System.out.println(str2.length());
				j++;
			}
			 if(j==str2.length()-1 && str1.charAt(i)!= str2.charAt(j)){
//				System.out.println("adasd");
				flag=false;
				break;
			}
		}
		return flag;
		
	}
	/*public static boolean isPermutation(String str1, String str2) { 
		// check permutation 
     	if(str1.length()!=str2.length()) {
			return false;
		}
		if(str1.equals(str2)) {
			return true;
		}
        // check permutation 
		int[] arr =new int[255];
		int l=0;
		int k=0;
		while(l<str1.length() && k<str2.length()){
			for(int i=0;i<arr.length;i++) {
				if(i==(int)str1.charAt(l)) {
					arr[i]++;
				
				}
				if(i==(int)str2.charAt(k)) {
					arr[i]--;
				}
			}
			l++;k++;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0 || arr[i]<0) {
				return false;
			}
		}
		
	return true;
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		String str2 = s.nextLine();
//		System.out.println(str1.length());
//		System.out.println(str2.length());
		System.out.println(isPermutation(str1,str2));
	}

}
