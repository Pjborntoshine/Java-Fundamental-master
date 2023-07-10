package MileStone2Array1Revision;

public class CheckArrayRotation {
	public static int arrayRotateCheck(int[] arr){
		int and = 0;
		int c=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				return c;
			}else {
				c++;
			}
		}
		return 0;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {3,6,8,9,10};
		  int a = arrayRotateCheck(arr);
			System.out.println(a);
	}

}
