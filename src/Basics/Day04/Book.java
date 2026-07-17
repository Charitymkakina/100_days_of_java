package Basics.Day04;

public class Book {
    private String name;
    private String author;
    private String publisher;
    private int publicationYear;
//using private only the book class itself can access these variables.

Book(String name){
    this.name=name;
    this.author="Ken Walibora";
    this.publisher="Longhorn Publishers";
    this.publicationYear=1996;
}
Book (String name, String author){
    this.name=name;
    this.author=author;
    this.publisher= "Zondervan";
    this.publicationYear=1990;
}
Book (String name, String author, String publisher){
    this.name=name;
    this.author=author;
    this.publisher=publisher;
    this.publicationYear=2021;
}
Book(){
    this.name="Gone Girl";
    this.author="Gillian Flynn";
    this.publisher="Crown Publishing Group";
    this.publicationYear=2012;
}
// To be able to access the private data we use getters.
    // Getters provide controlled access to private variables.
    // Although displayInfo() is used for printing all book details,
    // getters are still useful when individual values are needed for logic or comparison.
public String getName(){
    return name;
}
public String getAuthor(){
    return author;
}
public String getPublisher(){
    return publisher;
}
public int getPublicationYear(){
    return publicationYear;
}

    // displayInfo() is used to print all book details at once.
    // This reduces repetitive System.out.println calls in the Main class

public void displayInfo(){
    System.out.println("Title: " + name);
    System.out.println("Author: " + author);
    System.out.println("Publisher: " + publisher);
    System.out.println("Year: " + publicationYear);
}
}
