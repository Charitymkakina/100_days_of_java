package Basics.Day10;

public class Mystery implements Fiction {
    @Override
    public void recommendBook(){
        System.out.println("The Big Mystery");
    }
    @Override
    public void describeBook(){
        System.out.println("This book is really good for fantasy");
    }
}
