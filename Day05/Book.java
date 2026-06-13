package Day05;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private int publicationYear;

    Book (String title, String author, String publisher, int publicationYear){
        //this.title=title;
        this.setTitle(title);
        //this.author=author;
        this.setAuthor(author);
        //this.publisher=publisher;
        this.setPublisher(publisher);
        //this.publicationYear=publicationYear;
        this.setYear(publicationYear);
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getPublisher(){
        return publisher;
    }
    public int getYear(){
        return publicationYear;
    }

    public void setTitle(String title){
        this.title=title;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void setPublisher(String publisher){
        this.publisher=publisher;
    }
    public void setYear(int publicationYear){
        this.publicationYear=publicationYear;
    }
}
