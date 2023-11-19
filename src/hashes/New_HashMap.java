package hashes;

import java.util.HashMap;
import java.util.Map;

public class New_HashMap {

	public static void main(String[] args) {
		
		Map<String, Integer> Z = new HashMap<>();
		
		Z.put("ID1", 10);
		Z.put("ID2", 20);
		Z.put("ID3", 30);
		Z.put("ID4", 40);
		Z.put("ID5", 50);
		Z.put("ID5", null);
		System.out.println(Z);

	}

}
