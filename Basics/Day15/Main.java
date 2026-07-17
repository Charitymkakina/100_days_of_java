package Basics.Day15;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList <String> linkedList = new LinkedList<>();
        //linkedList.push("Charity"); //LinkedList can be treatd as a stack
        //linkedList.push("Mkakina");
        //linkedList.push("Neema");

       // linkedList.pop();

       linkedList.offer("Charity"); //queue
       linkedList.offer("Mkakina");
       linkedList.offer("Neema");
       //linkedList.poll();

       linkedList.add(3,"Vanessa"); //Adding elements in the linkedlist
       linkedList.add(4,"Amani");

       linkedList.remove("Mkakina");

       System.out.println(linkedList.indexOf("Neema")); 
       System.out.println(linkedList.peekFirst());
       System.out.println(linkedList.peekLast());

       linkedList.addFirst("Rebecca"); //Adds an element at the beginning of the Linkedlist
       linkedList.addLast("Sidi"); //Adds an element at the end of the LinkedList.

       //String first = linkedList.removeFirst();
       //String last = linkedList.removeLast(); 

        System.out.println(linkedList);
    }
}
