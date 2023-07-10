package HashMap;

import java.util.HashMap;
import java.util.Set;

public class InbuiltMapUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		map.put("abc", 1);
		map.put("def", 2);
		// presence
		if(map.containsKey("abc")) {
			System.out.println("it contain abc");
		}
		if(map.containsKey("abc1")) {
			System.out.println("it contain abc1");
		}
		// getting
		int v = map.get("abc");
		System.out.println(v);
		if(map.containsKey("abc1")) {
			int v1 = map.get("abc1");
			System.out.println(v1);
		}
//		// for removing
//		map.remove("abc");
//		// for size
//		map.size();
//		
		// iterate on map
		Set<String> keys= map.keySet();
		for(String s:keys) {
			System.out.println(s);
		}
		
	}

}
