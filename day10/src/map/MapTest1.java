package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest1 {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "c");
		map.put(4, "D");
		System.out.println(map);
		System.out.println(map.get(1));
		System.out.println(map.containsValue("D"));//boolean
		System.out.println(map.containsKey(4));//boolean
		
		Set<Integer> keys= map.keySet();
		System.out.println(keys.toString());
		for(int a:keys) {
			System.out.println(map.get(a));
		}
	}

}
