package Day35;

import java.time.LocalTime;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

public class AlarmClock implements Runnable{
    private final LocalTime alarmTime;
    private final String filePath;

    AlarmClock(LocalTime alarmTime, String filePath){
        this.alarmTime = alarmTime;
        this.filePath = filePath;

    }
    @Override
    public void run(){

    while(LocalTime.now().isBefore(alarmTime)){ //checking the right now is before the alarmtime if yes we wait.

            try{
            Thread.sleep(1000);

                LocalTime now = LocalTime.now();

            System.out.printf("\r%02d:%02d:%02d",now.getHour() ,now.getMinute() ,now.getSecond() );
            }
            catch (InterruptedException e){
                System.out.println("Thread was interrupted!");
            }
        }
        System.out.println("\n*ALARM NOISES*");
        playSound(filePath);
    }
    private void playSound(String filePath){
        File audioFile = new File(filePath);

        //System.out.println(audioFile.getAbsolutePath());
        //System.out.println(audioFile.exists());
        
        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile)){
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            Thread.sleep(5000);
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Audio file format is not accepted!");
        }
        catch(LineUnavailableException e){
            System.out.println("Audio is unavailable!");
        }
        catch(IOException e){
            System.out.println("Error reading audio file");
        }
        catch(InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
