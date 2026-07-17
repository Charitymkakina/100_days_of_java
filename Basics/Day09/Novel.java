package Basics.Day09;

public class Novel extends Book{
    @ Override
    public void displayBookType() {
        System.out.println("Novel-Fiction");
    }
    @ Override
    public void recommendBook() {
        System.out.println("Novel is recommended for entertainment");
    }

    @ Override
    public void displayDescription() {
        System.out.println("Novels are really good for fantansy");
    
}
}
