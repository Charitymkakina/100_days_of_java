package Basics.Day08;

public class Main {
    public static void main(String[]args){
        Novel novel = new Novel();
        Textbook textbook = new Textbook();
        Play play = new Play();

        //novel.read();
        //textbook.read();
        //play.read();

        Book[]book = {novel,textbook,play}; //This array is allowed because all items inside extend Book.

        for (Book currentBook : book){
            currentBook.read();
        }

    }
    
}
