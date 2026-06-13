package Day05;

public class Main {
    public static void main (String [] args){
        Book book1= new Book("Siku Njema", "Ken Walibora","LongHorn Publishers", 1996);

        //System.out.println(book1.title); ERROR: not Visible because the attributes are private.
         book1.setTitle("Nasikia Sauti ya Mama");  //We set the name from Siku Njema to Nasikia Sauti ya Mama.

        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthor());
        System.out.println(book1.getPublisher());
        System.out.println(book1.getYear());
    
    
    
    }
}
