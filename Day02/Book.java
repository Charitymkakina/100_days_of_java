package Day02;

public class Book {
    String name;
    String author;
    String publisher;
    int publicationyear;
    int quantity;
    double price;

Book(String name, String author, String publisher, int publicationyear, int quantity, double price){
    this.name=name;
    this.author=author;
    this.publisher=publisher;
    this.publicationyear=publicationyear;
    this.quantity=quantity;
    this.price=price;
}

void displayinfo(){
    System.out.println(name);
    System.out.println(author);
    System.out.println(publisher);
    System.out.println(publicationyear);
    System.out.println(quantity);
    System.out.println(price);
}
}

