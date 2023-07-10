package generics;

public class GenericMethods {
// creatig generic methods
	public static<T> void printArray(T arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
//	public static<T> T[] retArray(int n) {
//		T[] arr = new T[n];
//		for(int i=0;i<n;i++) {
//		arr[i] = i;
//		}
//		return arr;
//		
//	} 
	// extends Vehicle bounding the method with vehicle class i.e it will only reive vehicle or sub class of vehicle
	public static<T extends Vehicle> void printArray2(T arr[]) {
		for(int i=0;i<arr.length;i++) {
		arr[i].print();
		}
		System.out.println();
	}
	
	public static<T extends PrintInterface > void printArray3(T arr[]) {
		for(int i=0;i<arr.length;i++) {
		arr[i].print();
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[]= new Integer[5];
		for(int i=0;i<arr.length;i++) {
			arr[i] = i+1;
		}
		printArray(arr);
		String arr2[] = new String[5];
		for(int i=0;i<arr2.length;i++) {
			arr2[i]="abc";
		}
		printArray(arr2);
		Vehicle v[] =new Vehicle[5];
		for(int i=0;i<v.length;i++) {
			v[i]=new Vehicle();
			v[i].setComp("Rahuk" + i);
			v[i].setMaxSpeed(i);
		}
		printArray2(v);
		printArray3(v);
		
		Student st[] =new Student[5];
		for(int i=0;i<st.length;i++) {
			st[i]=new Student(55);
			
		}
		printArray3(st);
	}

}
