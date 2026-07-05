package Day27;

import java.util.*;

public class Main{
	
    public static void main(String args[]) {    	


    	Hashtable<Integer, String> table = new Hashtable<>(10);
    	
    	table.put(84, "Charity");
    	table.put(85, "Maureen");
    	table.put(83, "Veronica");
    	table.put(82, "Michelle");
    	table.put(81, "Kalewa");
    	  	
    	for(Integer key : table.keySet()) {
    		System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
    	}
    }
}