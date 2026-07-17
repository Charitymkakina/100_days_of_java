package Basics.Day02;

public class Main {
    public static void main (String [] args){
        Book book1 = new Book ("Siku Njema", "Ken Walibora", "Longhorn Publishers", 1996, 20, 256.99,false);
        Book book2 = new Book ("Gifted hands", "Ben Carson", "Zondervan", 1990, 25, 879.99, true);

          // System.out.println(book1.name);
          // System.out.println(book1.author);
       // System.out.println(book1.publisher);
        //System.out.println(book1.publicationYear);
        //System.out.println(book1.quantity);
        //System.out.println(book1.price);
        

        //System.out.println(book2.name);
        //System.out.println(book2.author);
        //System.out.println(book2.publisher);
        //System.out.println(book2.publicationYear);
        //System.out.println(book2.quantity);
        //System.out.println(book2.price);

        //book1.displayInfo();
        //book2.displayInfo();

       // book1.read();
        //book2.read();

        //book1.display();
        //book2.display();
    
        book1.checkAvailability();
        book2.checkAvailability();

        book1.rateBook();
        book2.rateBook();

    }


}
