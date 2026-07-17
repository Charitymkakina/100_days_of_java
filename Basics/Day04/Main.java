package Basics.Day04;

public class Main {
    public static void main (String[]args){
        Book book1 = new Book ("Siku Njema");

        Book book2= new Book ("Gifted Hands", "Ben Carson");

        Book book3= new Book("Twisted Games", "Ana Huang", "Bloom Books");

        Book book4= new Book();

        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();
        book4.displayInfo();

  
    }   
}
