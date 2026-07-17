package Basics.Day33;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Reading a file with java using the bufferReader and fileReader
public class Example1 {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Admin\\OneDrive\\Desktop\\Text.txt";

         // buffered reader requires a file reader

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
        //System.out.println("Yay! That file exists");
        String line;
            while ((line = reader.readLine()) != null ){ // use the reader to read each line and assign it to the variable "line" 
            // when the variable "line" is null get out of the while loop.
            System.out.println(line);
            }

        }
        catch (FileNotFoundException m){
            System.out.println("Could not find the file! please check the file path again");

        }
        catch(IOException m) {
            System.out.println("Oopsie something went wrong");
        }
    }
}
