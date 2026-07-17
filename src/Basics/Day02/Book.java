package Basics.Day02;

public class Book {
    String name;
    String author;
    String publisher;
    int publicationYear;
    int quantity;
    double price;
    boolean isAvailable;

Book(String name, String author, String publisher, int publicationYear, int quantity, double price, boolean isAvailable){
    this.name=name;
    this.author=author;
    this.publisher=publisher;
    this.publicationYear=publicationYear;
    this.quantity=quantity;
    this.price=price;
    this.isAvailable=isAvailable;
}

void displayInfo(){
    System.out.println(name);
    System.out.println(author);
    System.out.println(publisher);
    System.out.println(publicationYear);
    System.out.println(quantity);
    System.out.println(price);
    System.out.println(isAvailable);
}
void read(){
    System.out.println("The reader is reading " + this.name);
}
void display(){
    System.out.println(this.name + " was written by " + this.author);
}
void rateBook(){
    System.out.println(this.name + " is really encouraging ");
}
void checkAvailability(){
    if (isAvailable){
        System.out.println(this.name + " is available ");
    } else {
        System.out.println(this.name + " is not available ");
    }
}
}

