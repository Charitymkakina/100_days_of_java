package Basics.Day19;
import java.util.Arrays;

public class Main {
    public static void main(String[]args){
        int array[] = new int[1000000]; // Create an array that can store 1000000 integers.
        int target = 40; // the value we want to search for.

        //Fill the array with numbers from 0 to 999,999.
        // Binary Search requires the array to be sorted.
        for (int i=0; i<array.length; i++){
            array[i]=i * 10;
        }

        // Search for the target using Java's built-in Binary Search method.
        int index=Arrays.binarySearch(array, target);
        if (index < 0){ // If the target is not found, binarySearch returns a negative number.
            System.out.println(target + " not found!");
        }
        else { // else returns the index where the value was found
            System.out.println("Target found at: " + index);
        }
    }
}
