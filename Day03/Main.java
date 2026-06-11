package Day03;

public class Main {
    public static void main (String[]args){
        Book book1= new Book("Siku Njema");
        Book book2= new Book("Gifted Hands", "Ben Carson");
        Book book3= new Book("Twisted Games", "Ana Huang", "Bloom Books");
        Book book4= new Book();

    System.out.println(book1.name);
    System.out.println(book1.author);
    System.out.println(book1.publisher);
    System.out.println(book1.publicationYear);

    System.out.println(book2.name);
    System.out.println(book2.author);
    System.out.println(book2.publisher);
    System.out.println(book2.publicationYear);

    System.out.println(book3.name);
    System.out.println(book3.author);
    System.out.println(book3.publisher);
    System.out.println(book3.publicationYear);

    System.out.println(book4.name);
    System.out.println(book4.author);
    System.out.println(book4.publisher);
    System.out.println(book4.publicationYear);


    }
    
}
