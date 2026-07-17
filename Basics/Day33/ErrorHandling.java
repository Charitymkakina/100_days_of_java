package Basics.Day33;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ErrorHandling {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        try{
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println(number);
        }
        catch(InputMismatchException e){ // catching a mismatch of the data type if user puts another datatype instead of integer.
            System.out.println("Use an integer value!");
        }
        catch(ArithmeticException e ){
            System.out.println("You can't divide by zero!");
        }
        catch(Exception e){ // when all exceptions fails.
            System.out.println("Something went wrong, try again!");
        }
        finally{ // Always executes whether there is an exception or not.
            scanner.close();
        }
    }
}
