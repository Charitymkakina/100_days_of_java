package Day14;
//Elements are served based on their priority rather than insertion order.
//when an iteam is added, it is inserted according to its priority.

import java.util.PriorityQueue;
import java.util.Queue;

public class Example {
    public static void main (String []args){
    Queue <Double> queue = new PriorityQueue<>();
        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);
        queue.offer(3.2);

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
