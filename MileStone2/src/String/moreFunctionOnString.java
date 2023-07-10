package String;

public class moreFunctionOnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[] = {'C','o','d','i','n','g'};
		String str1 = "Coding";
		String str2 = "is fun";
		String str3 = "Coding";
//		System.out.println(str1.equals(str3));
//		System.out.println(str1.compareTo(str3));
//		System.out.println(str1.contains("ing"));
//		str1+=str2;
//		
////		str1=str1.concat(str2);
//		System.out.println(str1);
////		System.out.println(str1+str2);
//		//TODO:Need to revise comapreTo
//		String a ="abcd";
//		String b="abcda";
//		System.out.println(a.compareTo(b));
//		
		String str4 = "Coding";
		System.out.println(str4.substring(6).length());
		System.out.println(str4.substring(5));
		String sunstr = str4.substring(1,5);
		System.out.println(sunstr);
		String a="coding";
		for(int i=2;i<5;i++)
		{
		    System.out.print(a.substring(i-2,i+1));
		}
	//codiodindii	
	}

}
