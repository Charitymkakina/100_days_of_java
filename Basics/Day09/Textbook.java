package Day09;

public class Textbook extends Book {
    @ Override
    public void displayBookType() {
        System.out.println("Textbooks are academic");
    }
    @ Override
    public void recommendBook() {
        System.out.println("Textbooks are recommended for students");
    }

    @ Override
    public void displayDescription() {
        System.out.println("Textbooks are really good for revision");
    
}
}
