package Basics.Day12;

import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the genre you want to read: ");
        String response = scanner.nextLine().toUpperCase();
        try{
           Book book = Book.valueOf(response);

        switch (book) {
            case ROMANCE, FANTASY, SCIFI -> System.out.println("This is a fiction based book");

            case SELFHELP, TRUECRIME -> System.out.println ("This is a non-fiction based book") ;
         } 
        }
        catch(IllegalArgumentException e){
            System.out.println("Please Enter a valid Book Genre! ");
        } 

    
        scanner.close();
    }
}