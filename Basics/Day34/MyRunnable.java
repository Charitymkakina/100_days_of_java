package Day34;

public class MyRunnable implements Runnable{
    private final String text;

    MyRunnable(String text){
        this.text = text;
    }

    @Override
    public void run(){
        for (int i = 1; i <=5; i++){
            try{
            Thread.sleep(1000); // sleep for a second.
            System.out.println(text);
            }
            catch (InterruptedException e){
                System.out.println("Thread was interrupted!");
            }
        }
    }
}
