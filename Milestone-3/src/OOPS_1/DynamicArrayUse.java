package OOPS_1;

public class DynamicArrayUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DynamicArray da = new DynamicArray();
		for(int i=0;i<=5;i++) {
			da.add(i+1);
		}
//		System.out.println(da.size());
//		System.out.println(da.get(50));
//		da.set(2, 0);
//		System.out.println(da.get(2));
////		System.out.println(da.remove());
//		da.add(0, 69);
		System.out.println(da.size());
		da.remove(3);
	//	da.add(12);
//		da.add(12);	
//		da.add(12);
//		da.add(12);
//		da.add(12);
//		da.add(12);
//		da.add(12);
	}

}
