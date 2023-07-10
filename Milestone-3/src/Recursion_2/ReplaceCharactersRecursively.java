package Recursion_2;

public class ReplaceCharactersRecursively {
	public static String replaceCharacter(String input, char c1, char c2) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		// base case
		if(input.length() == 0) {
			return input;
		}
		// hyothesis
		String smallOp = replaceCharacter(input.substring(1), c1, c2);
		//System.out.println(input +"-->"+ smallOp);
		if(input.charAt(0)==c1) {
			return c2+smallOp;
		}else {
			return input.charAt(0) + smallOp;
		}
//		return smallOp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(replaceCharacter("aaaabacd",'a','x'));
	}

}
