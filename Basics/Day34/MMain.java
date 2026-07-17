package Day34;

import java.util.Scanner;

// Scenario a user has 10s to respond if not time is up
public class MMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MyRunnable2 myRunnable2 = new MyRunnable2();

        Thread thread = new Thread(myRunnable2);
        thread.setDaemon(true); //ends the thread as soon as the main thread is finished.
        thread.start();
        System.out.println("You have 10s to enter you name!");

    

        System.out.print("Enter your name: ");

        String name = scanner.nextLine();

        System.out.println("Hello " + name);
        scanner.close();
    }
}
