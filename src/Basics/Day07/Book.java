package Basics.Day07;

public class Book {
    protected String title;
    protected String author;
    protected String publisher;
    protected int publicationYear;

public Book(String title,String author, String publisher, int publicationYear){
    this.title=title;
    this.author=author;
    this.publisher=publisher;
    this.publicationYear=publicationYear;

}
public void displayInfo(){
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("Publisher: " + publisher);
    System.out.println("Year: " +  publicationYear);
}
public void read(){
    System.out.println("I am currently reading " + this.title);
}
}
