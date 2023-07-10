package String;
/**************
 * 
 * @author RAHUL
 *VVI wherever we need to compare two strings we must and should Always use equals or compareTO in java not ==
 *beacause String is non primitive data type so String variable will alyays contain the eference of the the value ans that reference will be compared not vale
 */
public class StringComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1 = "asa";
String str2 = "asa";
if(str1==str2) { // beacause of string pool
	System.out.println("elual");
}else {
	System.out.println("not equal");
}
String str3 = new String("asa");
if(str1==str3) { // beacause of string pool will not equal as it new will create new value in string pool
	System.out.println("elual");
}else {
	System.out.println("not equal");
}

if(str1.equals(str3)) { // this will check the and compare the value and we should prohibit to use == should use euals or compareTo
	System.out.println("elual");
}else {
	System.out.println("not equal");
}


	}

}
