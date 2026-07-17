package Basics.Day06;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the book you want to read: ");

        String title = scanner.nextLine();
        System.out.println("I hope you enjoy reading " + title);

        scanner.close();
    }
    
}
