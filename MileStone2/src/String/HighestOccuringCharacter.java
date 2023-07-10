package String;

public class HighestOccuringCharacter {
	public static char highestOccuringChar(String str) {
		//Your code goes here
        char ch;
        int[] arr = new int[255];
        int i=0;
        while(i<str.length()) {
//        	System.out.println((int)str.charAt(i));
        	for(int j=0;j<arr.length;j++) {
        		if(j==(int)str.charAt(i)) {
//        			System.out.println("j"+j);
        			arr[j]++;
//        			System.out.println("j-->"+arr[j]);
        		}
        	}
        	
        	i++;
        }
        int maxVal = Integer.MIN_VALUE;
        int maxInd =0;
        for(int j=0;j<arr.length-1;j++) {
//        	System.out.print(arr[j] +" ");
        	if(maxVal<arr[j+1]) {
        		maxVal = arr[j+1];
        		maxInd =j;
        	}
        }
       System.out.println((char)(maxInd+1));
        return (char)(maxInd+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		highestOccuringChar("abcdeapapqarr");
	}

}
