package Day17;

import java.util.ArrayList;

public class Main {
    public static void main(String []args){
        ArrayList <String> fruits =  new ArrayList<>(); //Creating the arraylist
    
        // Adding elements into our Fruit arraylist
        fruits.add("Mango");
        fruits.add("Oranges");
        fruits.add("Pineapples");
        fruits.add("Bananas");
        fruits.add("Apple");

        //fruits.remove(0);
        //fruits.set(0, "Grapes");

        //System.err.println(fruits.size());
        //System.out.println(fruits.get(4));
        //System.out.println(fruits); // Displaying the Array
        for (String Fruits : fruits){ // used the for enhanced for loop to print the Fruit arraylist
            System.out.println(Fruits);
        }
    }
}
