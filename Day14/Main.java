package Day14;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main (String []args){
        Queue <String> queue = new LinkedList<>();
    
        queue.offer("Charity");
        queue.offer("Mkakina");
        queue.offer("Neema");
        queue.offer("Malemba");
        queue.offer("Vanessa");

        queue.poll();
    System.out.println(queue.peek());
    System.out.println(queue);
    }
}
