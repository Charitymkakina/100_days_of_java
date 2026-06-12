package Day04;

public class Main {
    public static void main (String[]args){
        Book book1 = new Book ("Siku Njema");

        Book book2= new Book ("Gifted Hands", "Ben Carson");

        Book book3= new Book("Twisted Games", "Ana Huang", "Bloom Books");

        Book book4= new Book();

        System.out.println(book1.getName());
        System.out.println(book1.getauthor());
        System.out.println(book1.getpublisher());
        System.out.println(book1.getpublicationYear());
    // To be able to access the private data we use getters. 
         System.out.println(book2.getName());
        System.out.println(book2.getauthor());
        System.out.println(book2.getpublisher());
        System.out.println(book2.getpublicationYear());

         System.out.println(book3.getName());
        System.out.println(book3.getauthor());
        System.out.println(book3.getpublisher());
        System.out.println(book3.getpublicationYear());

      System.out.println(book4.getName());
        System.out.println(book4.getauthor());
        System.out.println(book4.getpublisher());
        System.out.println(book4.getpublicationYear());
  
    }   
}
