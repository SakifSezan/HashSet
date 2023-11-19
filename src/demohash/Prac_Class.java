package demohash;

import java.util.HashSet;

public class Prac_Class {
       public static void main(String[] args) {
    	   
    	   HashSet<String> h_set = new HashSet<String>();
    	   // use add() method to add values in the hash set
    	   h_set.add("Red");
    	   h_set.add("Green");
    	   h_set.add("Black");
    	   h_set.add("White");
    	   h_set.add("Pink");
    	   h_set.add("Yellow");
    	   
    	   System.out.println("The Hash Set: " + h_set);
    	   for(String a:h_set) {
    	   System.out.println(a);

    	   
    	   
	}
       }
}
