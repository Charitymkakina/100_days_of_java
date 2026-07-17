package Basics.Day04.Day09;

public class Main{
    public static void main(String[] args) {
        Novel novel = new Novel();
        Textbook textbook = new Textbook();
        Biography biography = new Biography();

       // novel.getBookType();
        //textbook.getBookType();
        //biography.getBookType();
       // textbook.getDescription();
       // biography.getDescription();

       Book[]book = {novel,textbook,biography};
        for (Book currentBook : book){
            currentBook.displayBookType();
            currentBook.displayDescription();
            currentBook.recommendBook();
    }
}
}