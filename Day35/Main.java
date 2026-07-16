package Day35;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

// Java Alarm Clock
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime= null;

        while(alarmTime == null){
            try{
            System.out.print("Enter an alarm time (HH:MM:SS): ");
        String inputTime = scanner.nextLine();

        alarmTime = LocalTime.parse(inputTime, formatter);
        System.out.println("Alarm time set at: " + alarmTime);
        }
        catch(DateTimeParseException e){
            System.out.println("Invalid Format!");
        }
        }

        
        

        scanner.close();
    }
}
