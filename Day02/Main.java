package Day02;

public class Main {
    public static void main (String [] args){
        Book book1 = new Book ("Siku Njema", "Ken Walibora", "Longhorn Publishers", 1996, 20, 256.99 );
        Book book2 = new Book ("Gifted hands", "Ben Carson", "Zondervan", 1990, 25, 879.99 );

        
       // System.out.println(book1.name);
        //System.out.println(book1.author);
       // System.out.println(book1.publisher);
        //System.out.println(book1.publicationyear);
        //System.out.println(book1.quantity);
        //System.out.println(book1.price);
        

        //System.out.println(book2.name);
        //System.out.println(book2.author);
        //System.out.println(book2.publisher);
        //System.out.println(book2.publicationyear);
        //System.out.println(book2.quantity);
        //System.out.println(book2.price);

        book1.displayinfo();
        book2.displayinfo();

    }

}
