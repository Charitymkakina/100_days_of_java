package Basics.Day10;

public class Biography implements NonFiction {
    @Override
    public void describeBook(){
        System.out.println("NonFiction books are mostly for uplifting");
    }
    @ Override
    public void recommendBook(){
        System.out.println("The last Lecture");
    }
}
