package Day15;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList <String> linkedList = new LinkedList<>();
        //linkedList.push("Charity"); //LinkedList can be treatd as a stack
        //linkedList.push("Mkakina");
        //linkedList.push("Neema");

       // linkedList.pop();

       linkedList.offer("Charity");
       linkedList.offer("Mkakina");
       linkedList.offer("Neema");
       //linkedList.poll();
        System.out.println(linkedList);
    }
}
