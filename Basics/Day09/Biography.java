package Basics.Day09;

public class Biography extends Book {
    @ Override
    public void displayBookType() {
        System.out.println("Biography is non-fiction");
    }
    @ Override
    public void recommendBook() {
        System.out.println("Biography is recommended for learning someone's life");
    }

    @ Override
    public void displayDescription() {
        System.out.println("Biography are really good for motivation");
    
}
}
