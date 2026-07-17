package Day14;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        // Create a Queue using a LinkedList implementation.
        // Queues follow the FIFO (First In, First Out) principle.
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the queue using offer().
        // Elements are added to the rear (end) of the queue.
        queue.offer("Charity");
        queue.offer("Mkakina");
        queue.offer("Neema");
        queue.offer("Malemba");
        queue.offer("Vanessa");

        // Removes the element at the front of the queue.
        // Since queues are FIFO, "Charity" is removed first.
        queue.poll();

        // Displays the element at the front of the queue
        // without removing it.
        System.out.println(queue.peek());

        // Prints all elements currently in the queue.
        System.out.println(queue);
    }
}