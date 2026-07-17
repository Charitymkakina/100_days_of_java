package Day17;

import java.util.ArrayList;
import java.util.Scanner;

public class Excercise1 {
    public static void main (String []args){
        Scanner scanner =  new Scanner(System.in);
        ArrayList <String> books = new ArrayList<>();

        System.out.print("Enter the number of books you want to purchase: ");
        int numofBooks = scanner.nextInt();
        scanner.nextLine();

        for(int i=1; i<=numofBooks; i++){
            System.out.print("Enter book number " + i + ":");
            String Books = scanner.nextLine();
            books.add(Books);
        }

        System.out.println(books);
        scanner.close();
    }
}
