package demohash;

import java.util.HashSet;

public class Demo {

	public static void main(String[] args) {
		HashSet<String> obj = new HashSet<>();
		
		obj.add("Good");
		obj.add("Evening");
		obj.add("To");
		obj.add("All");
		//obj.remove("Evening");
		//obj.removeAll(obj);
		//obj.clear();
		//obj.isEmpty();
		
		System.out.println(obj.isEmpty());
		

	}

}
