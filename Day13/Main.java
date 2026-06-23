package Day13;

import java.util.Stack;

public class Main {
    public static void main (String []args){
        Stack <String> stack = new Stack <String>();

        

        stack.push("Twisted Games");
        stack.push("Meet Me in Another Life");
        stack.push("The Obsession");
        stack.push("In Five Years");
        stack.push("Collide");
        
         stack.pop(); //Removing an object in the stack however the most top item gets removed. (LIFO).

    //System.out.println(stack.empty()); //To check if the stack is empty.
    System.out.println(stack); //Printing the objects in the stack.
    System.out.println(stack.peek());//Checks the most top item on the list
    System.out.println(stack.search("Meet Me in Another Life")); // Searching for an item in the stack.
    }
}
