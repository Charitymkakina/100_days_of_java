package Basics.Day13;
//Create a stack of books, push 5 books after every push print currently reading: <top book>

import java.util.Stack;
public class Challenge4 {
    public static void main (String []args){
        Stack <String> stack = new Stack<>();
        stack.push("Siku Njema");
        System.out.println("Currently Reading: " + stack.peek());
        stack.push("Blossoms");
        System.out.println("Currently Reading: " + stack.peek());
        stack.push("Chozi la Heri");
        System.out.println("Currently Reading: " + stack.peek());
        stack.push("Inheritance");
        System.out.println("Currently Reading: " + stack.peek());
        stack.push("A dolls House");
        System.out.println("Currently Reading: " + stack.peek());
        //stack.pop();
        //System.out.println("Currently Reading: " + stack.peek());
        
    }
}
