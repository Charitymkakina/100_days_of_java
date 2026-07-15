package Day33;

import java.io.FileWriter;
import java.io.IOException;

public class Example2 {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("test.txt")) { // no file path has been specified making the 
            // text.txt to be on the src folder.
            writer.write("I like Chicken\nWhat do you like? ");
            System.out.println("File has been written!");
         }
         catch(IOException e) {
            System.out.println("Could not write file!");
         }
    }
}
