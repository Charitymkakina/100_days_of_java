package Day35;

import java.time.LocalTime;

public class AlarmClock implements Runnable{
    private final LocalTime alarmTime;

    AlarmClock(LocalTime alarmTime){
        this.alarmTime = alarmTime;

    }
    @Override
    public void run(){

    while(LocalTime.now().isBefore(alarmTime)){ //checking the right now is before the alarmtime if yes we wait.

            try{
            Thread.sleep(1000);

                int hours = LocalTime.now().getHour();
                int minutes = LocalTime.now().getMinute();
                int seconds = LocalTime.now().getSecond();

            System.out.printf("\r%02d:%02d:%02d", hours, minutes, seconds);
            }
            catch (InterruptedException e){
                System.out.println("Thread was interrupted!");
            }
        }
    }
}
