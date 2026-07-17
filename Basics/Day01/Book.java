package Basics.Day01;

public class Book{
String title = "Siku Njema";
String author = "Ken Walibora";
String publisher = "Longhorn Publishers";
int publicationyear = 1996;
int quantity = 1;
double price = 781.56; 
boolean isInteresting = true;

void read() {
    System.out.println("I am currently reading this book");
}
void bought() {
    System.out.println ("Reader bought the book at TextBook Center");
}
void comment() {
    System.out.println ("I enjoyed the "+ title + " storyline");
}
}
