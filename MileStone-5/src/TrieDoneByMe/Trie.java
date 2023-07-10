package TrieDoneByMe;


import java.util.Map;



class TrieNode{
	char data;
	boolean isTerminable;
	TrieNode children [];
	public TrieNode(char data) {
		
		this.data = data;
		this.isTerminable = false;
		children = new TrieNode[26];
	}
	
}

public class Trie {
	// creating private node
//	private TrieNode root;
//
//	public Trie() {
//		this.root = new TrieNode('\0');
//	}
//	public void add(String word) {
//		Map<Character, Integer> map = new HashMap(); 
//	        int i=0;
//	            for (char ch = 'A'; ch <= 'Z'; ++ch) {
//	            	
//	                map.put(ch, i);i++; 
//	            }
//		addHelper(word ,map,root);
//	}
//	
//	private void addHelper(String word,Map<Character, Integer> map,TrieNode parentNode) {
//		// search in childArry ifElement exist or ot
////		if(word.length() == 1) {
////			return;
////		}
////		if(parentNode) {
////			// create new trie
////			TrieNode newChNode = new TrieNode(word.charAt(0));
////			Integer pos = map.get(word.charAt(0));
////			parentNode.children[pos] =newChNode;
////			addHelper(word.substring(1),map,newChNode);
////			
////		}else {
////			//
////			addHelper(word.substring(1),map,parentNode);
////		}
//		
//	}
//	public boolean search(String word) {
//		boolean ans= searchHelper(root,word.toUpperCase());
//		return ans;
//	}
//	
//	
//	private boolean searchHelper(TrieNode root, String word) {
//		// TODO Auto-generated method stub
//		if(word.length() == 0) {
//			if(root.isTerminable) {
//				return true;
//			}
//			return false;
//		}
//		int childIndex = word.charAt(0) -'A';
//		TrieNode cNode = root.children[childIndex];
//		if(cNode == null) {
//			return false;
//		}
//		boolean ch =  searchHelper(cNode, word.substring(1));
//		return ch;
//	}
//	
//	
//	public void remove(String word) {
//		removeHelper(root,word);
//	}
//	
//	// sir 's way
//	private void removeHelper(TrieNode root, String word) {
//		// TODO Auto-generated method stub
//		if(word.length() == 0) {
//			root.isTerminable = false;
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
	
	
//	private isRemoved removeHelper(TrieNode root, String word) {
//		// TODO Auto-generated method stub
//		isRemoved rir = null;
//		if(word.length() == 0) {
//			if(root.isTerminable) {
//				rir = new isRemoved(root.isTerminable);
////				rir.Iremove = root.isTerminable;
//			}
//			return rir;
//		}
//		int childIndex = word.charAt(0) - 'A';
//		TrieNode childNode = root.children[childIndex];
//		if(childNode == null) {
//			rir = new isRemoved(false);
//			return rir;
//		}
//		
//		isRemoved retVal=  removeHelper(childNode,word.substring(1));
//		if(retVal.Iremove) {
//			childNode.children[childIndex] = null;
//		}
//		return retVal;
//	}
}

