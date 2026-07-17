package Basics.Day13;
//A user decides to read Book A, Book B, Book C, Book D. the decides to undo the last action twice. Print the current book

import java.util.Stack;
public class Challenge6 {
    public static void main (String[]args){
        Stack <String> stack = new Stack <String>();

        for (char c= 'A'; c<='D'; c++){
            stack.push("Book " + c);
        }
        stack.pop();
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack);
    }
}
