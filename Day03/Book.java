package Day03;

public class Book {
    String name;
    String author;
    String publisher;
    int publicationYear;
    
    
Book(String name){
    this.name= name;
    this.author="Ken Walibora";
    this.publisher="Longhorn Publishers";
    this.publicationYear=1996;
}
Book(String name, String author){
    this.name= name;
    this.author=author;
    this.publisher="Zondervan";
    this.publicationYear=1990;
}
Book(String name, String author, String publisher){
    this.name= name;
    this.author=author;
    this.publisher=publisher;
    this.publicationYear=2021;
}
Book(){
    this.name="Gone Girl";
    this.author="Fillian Flynn";
    this.publisher="Crown Publishing Group";
    this.publicationYear=2012;
}
}