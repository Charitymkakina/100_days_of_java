package Day34;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable("Ping"));
        Thread thread2 = new Thread(new MyRunnable("Pong"));

        System.out.println("Game Starts!");

        thread1.start(); // calling the thread to start.
        thread2.start();

        try{ // Allows the game over to be interrupted after printing the ping pong concurently 5 times
        thread1.join();
        thread2.join();
        }
        catch(InterruptedException e){
            System.out.println("Main thread was interrupted!");
        }

        System.out.println("Game Over!");
    }
}
