package Day34;

public class MyRunnable2 implements Runnable{
    
    @Override
    public void run(){
        for(int i = 1; i<=10; i++){ // adding timer

            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("Thread was interrupted!");
            }

            if(i == 10){
                System.out.println("Time is up!");
                System.exit(0); // the program exists after the 10 seconds ends.
            }
    }
}
}
