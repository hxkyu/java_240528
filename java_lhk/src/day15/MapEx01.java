package day15;

import java.util.HashMap;

public class MapEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String > map = new HashMap<String,String>();
		map.put("admin", "admin123");
		System.out.println(map.put("admin", "admin12345"));
	
		System.out.println(map);
		
		map.remove("admin");
		
		System.out.println(map);
		
		map.put("abc123", "def123");
		map.put("asdasd", "def123");
		
		System.out.println(map);
		/*containsKey(key) :  주어진 key와 일치하는 키가 있는지 없는지 반환*/
		System.out.println(map.containsKey("admin"));
		System.out.println(map.containsKey("asdasd"));
	}
	
}
