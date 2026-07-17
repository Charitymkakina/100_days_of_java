package Basics.Day05;

public class Main {
    public static void main (String [] args){
        Book book1= new Book("Siku Njema", "Ken Walibora","LongHorn Publishers", 1996);
        Book book2= new Book("Gifted Hands ", "Ben Carson ", "Zondervan ", 1990);
        Book book3= new Book("Twisted Games ", "Ana Huang ", "Bloom Books", 2021);
        Book book4= new Book("Gone Girl", "Fillian Flynn","Crown Publishing Group", 2012);
        
        //System.out.println(book1.title); ERROR: not Visible because the attributes are private.
         
        book1.setTitle("Nasikia Sauti ya Mama");  //We set the name from Siku Njema to Nasikia Sauti ya Mama.
        book2.setTitle("The Perilous Fight");
       
        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthor());
        System.out.println(book1.getPublisher());
        System.out.println(book1.getYear());

         System.out.println(book2.getTitle());
         System.out.println(book2.getAuthor());
        System.out.println(book2.getPublisher());
        System.out.println(book2.getYear());
    
        System.out.println(book3.getTitle());
        System.out.println(book3.getAuthor());
        System.out.println(book3.getPublisher());
        System.out.println(book3.getYear());

        System.out.println(book4.getTitle());
        System.out.println(book4.getAuthor());
        System.out.println(book4.getPublisher());
        System.out.println(book4.getYear());

    }
}
