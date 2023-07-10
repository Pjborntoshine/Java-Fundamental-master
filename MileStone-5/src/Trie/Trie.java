package Trie;

import java.util.ArrayList;

import TrieDoneByMe.isRemoved;

class TrieNode{
	char data;
	boolean isTerminal;
	int childCount;
	TrieNode children []; // child node Reference
	public TrieNode(char data) {
		this.data = data;
		this.isTerminal = false;
		this.children = new TrieNode[26];
		this.childCount = 0;
	}
	
}
public class Trie {
	private TrieNode root;
	private int numWords;
	public Trie() {
		root = new TrieNode('\0');
		numWords = 0;
	}

	public void add(String word) {
		addHelper(root,word.toUpperCase());
		numWords++;
	}
	
	private void addHelper(TrieNode roots, String word) {
		// TODO Auto-generated method stub
		if(word.length() == 0) {
			roots.isTerminal = true;
			return;
		}
		int childIndex = word.charAt(0) - 'A'; // if at 0 ->  A - A = 0 ifB - A->1 index
		System.out.println("childIndex" + childIndex);
		TrieNode child = roots.children[childIndex];
		if(child == null) {
			child = new TrieNode(word.charAt(0));
			roots.children[childIndex] = child;
			roots.childCount++;
		}
		addHelper(child, word.substring(1));
	}

	public boolean search(String word) {
		boolean ans= searchHelper(root,word.toUpperCase());
		return ans;
	}

	private boolean searchHelper(TrieNode root, String word) {
		// TODO Auto-generated method stub
		if(word.length() == 0) {
			if(root.isTerminal) {
				return true;
			}
			return false;
		}
		int childIndex = word.charAt(0) -'A';
		TrieNode cNode = root.children[childIndex];
		if(cNode == null) {
			return false;
		}
		boolean ch =  searchHelper(cNode, word.substring(1));
		return ch;
	}
	public void remove(String word) {
		removeHelper(root,word);
		numWords--;
	}

	private void removeHelper(TrieNode root, String word) {
		// TODO Auto-generated method stub
		if(word.length() == 0) {
			if(root.isTerminal) {
				root.isTerminal = false;
				return ;
			}
			int childIndex = word.charAt(0) -'A';
			TrieNode childNode = root.children[childIndex];
			if(childNode == null) {
				return;
			}
			removeHelper(childNode,word.substring(1));	
			// dry run and understand anain vvi and this is very important condition 
			if(!childNode.isTerminal && childNode.childCount == 0) {
				root.children[childIndex] = null; 
				root.childCount--;
			}
		}
	}
	
	// sir 's way
//	private void removeHelper(TrieNode root, String word) {
//		// TODO Auto-generated method stub
//		if(word.length() == 0) {
//			root.isTerminal = false;
//			return;
//		}
//		int childIndex = word.charAt(0) - 'A';
//		TrieNode childNode = root.children[childIndex];
//		if(childNode == null) { 
//			return;
//		}
//		removeHelper(childNode, word.substring(1));
//		
//	}


/****Count words*****/
	public int countWords() {
		// Write your code here
		return numWords;
	}
	
	/****Pattern Matching*****/

	public boolean patternMatching(ArrayList<String> vect, String pattern) {
        // Write your code here
		for(String st : vect) {
			add(st);

			for(int i=0;i<st.length();i++) {
				System.out.println("insertcheck" + st.substring(i,st.length()));
				add(st.substring(1));
				
			}
		}
		boolean ans = patternMatchingHelper(root, pattern);
		return ans;
	}

	private boolean patternMatchingHelper(TrieNode root, String word) {
		// TODO Auto-generated method stub
		if(word.length() == 0) {
			return true;
		}
		int chldIndx = word.charAt(0) - 'A';
		TrieNode childNode = root.children[chldIndx];
		if(childNode == null) {
			return false;
		}
		return patternMatchingHelper(childNode,word.substring(1));
		
	}

	/*..................... Palindrome Pair................... */


	public boolean isPalindromePair(ArrayList<String> words) {
		//Your code goes here
		for(String st:words) {
			add(st);
			for(int i=0;i<st.length();i++) {
				//System.out.println("insertcheck" + st.substring(i,st.length()));
				add(st.substring(1));
			}
			// added now
//			StringBuilder input1 = new StringBuilder(); 
//	        input1.append(st);
//	        String revWrd = ""+input1.reverse();
//	        add(revWrd);
//	        for(int i=0;i<revWrd.length();i++) {
//	        	add(st.substring(1));
//	        }
		}
		for(String st:words) {
			StringBuilder input1 = new StringBuilder(); 
	        input1.append(st);
	        String searchrd = ""+input1.reverse(); 
	        System.out.println("searched words" + searchrd);
	        boolean ans =  search(searchrd);
	        if(ans) {
	        	return ans;
	        }
		}
	return false;
	}
	/*..................... Auto Complete ................... */

	public void autoComplete(ArrayList<String> input, String word) {
		// adding the data first
		for(String st: input) {
			add(st);
		}
		TrieNode lastWordRef =  autoCompletehelper(root,word);
		System.out.println(lastWordRef.data);
//		while() {
//			for(int i=0;i<lastWordRef.children.length;i++) {
//				if(lastWordRef.children[i]!=null) {
//					System.out.println(lastWordRef.children[i].data);
//				}
//				
//			}
//			
//		}
		
    }

	private TrieNode autoCompletehelper(TrieNode root, String word) {
		// TODO Auto-generated method stub
		if(word.length() == 0) {
			return root;
		}
		int childIndex = word.charAt(0)-'A';
		TrieNode childNode = root.children[childIndex];
		if(childNode == null) {
			return childNode;
		}
		
		return autoCompletehelper(childNode, word.substring(1));
	}
}
