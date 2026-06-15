package Day07;

public class Novel extends Book{ // to inherit from a class we use the extends keyword.
    private String genre;
    public Novel (String title, String author, String publisher, int publicationYear, String genre){
        super(title, author, publisher, publicationYear); // calls the constructor of the parent class.
        this.genre=genre;
    }
    public void showGenre() {
        System.out.println("Genre: " + genre);
    }
}
