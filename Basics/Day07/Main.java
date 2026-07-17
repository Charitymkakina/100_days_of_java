package Basics.Day07;

public class Main {
    public static void main (String [] args){
        Novel novel1 = new Novel("Boundless", "Cynthia Hand", "Harper teen", 2013, "Fantasy");
        Novel novel2= new Novel("Twisted games", "Ana Huang", "Bloombook", 2021,"Romance" );

        novel1.displayInfo();
        //novel1.showGenre();

        //novel2.displayInfo();
        //novel2.showGenre();

        novel2.read();
        
    }
}
