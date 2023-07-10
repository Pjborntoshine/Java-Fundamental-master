package Lec_3_howDataisStore;

public class TYpeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			char ch = 'a';
			int i = ch; // implicite conversion
			System.out.println(i); // int is 4 byte ad ch is of 2 bytes
//			ch =i // wont workk
			// using explicit conversion
//			ch =(char)i
//					ch = ch+1; // not work as the result will be of integer type but right hand we have ch which is character data type
					
					System.out.println(ch);
//					ch = (char)(ch+1)  work

	short s = 17;
//	int i = s; // work s=i will not work
	int j = (int)10.6;
	// NOTE: All descimal is double by defaule
	float f = 10.6f;
	}

}
