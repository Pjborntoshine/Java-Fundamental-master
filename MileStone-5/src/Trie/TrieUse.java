package Trie;

import java.util.ArrayList;

public class TrieUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trie tr = new Trie();
////		tr.add("RAHUL");
////		tr.add("RAH");
//		tr.add("there");
////		tr.add("their");
//		System.out.println();
////		System.out.println( tr.search("RAH"));
////		System.out.println( tr.search("the"));
////		System.out.println( tr.search("there"));
////		System.out.println( tr.search("theres"));
//		tr.add("AND");
//		tr.add("NOT");
//		System.out.println(tr.search("AND"));
//		System.out.println(tr.countWords());
//		tr.remove("AND");
//		System.out.print(tr.search("AND"));

		ArrayList<String> al = new ArrayList<>();
//		al.add("ABC");
//		al.add("DEF");
//		al.add("GHI");
//		al.add("CBA");
////		System.out.println( tr.patternMatching(al, "HI"));
//		System.out.println(tr.isPalindromePair(al));
//		String st = "abcde";
//		for(int i=st.length()-1;i>0;i--) {
//			System.out.println(st.substring(4, 1));
//		}
//		al.add("ABCM");
//		al.add("CBA");
//		al.add("ABCC");
//		al.add("CCBD");
//		System.out.println(tr.isPalindromePair(al));
		
		tr.add("DO");
		tr.add("DONT");
		tr.add("NO");
		tr.add("NOT");
		tr.add("NOTE");
		tr.add("NOTES");
		tr.add("DEN");
		tr.autoComplete(al, "NO");
	}

}
