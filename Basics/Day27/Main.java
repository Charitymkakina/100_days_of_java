package Day27;

import java.util.*;

public class Main{
	
    public static void main(String args[]) {    	


    	Hashtable<Integer, String> table = new Hashtable<>(10);
    	
		// adding an element on the Hashtable.
    	table.put(84, "Charity");
    	table.put(85, "Maureen");
    	table.put(83, "Veronica");
    	table.put(82, "Michelle");
    	table.put(81, "Kalewa");

		table.remove(82); // removing an element on the hashtable.

		System.out.println(table.get(85)); //accessing an element 
    	  	
    	for(Integer key : table.keySet()) { //Displaying the contents in the hashtable tohether with their indeces.
    		System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
    	}
    }
}