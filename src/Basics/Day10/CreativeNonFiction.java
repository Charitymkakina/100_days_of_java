package Basics.Day10;

public class CreativeNonFiction implements Fiction, NonFiction{ // To acheve multiple inheritance behaviour,
// java allows a class to have multiple interfaces

    @Override
    public void recommendBook(){
        System.out.println("The Fairy Tellers");
    }
    @Override
    public void describeBook(){
        System.out.println("Reading this book gives a fantasy feel and uplifting feel");
    }
}
