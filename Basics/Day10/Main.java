package Basics.Day04.Day10;

public class Main {
    public static void main(String[] args) {
        Mystery mystery = new Mystery();
        Biography biography = new Biography();
        CreativeNonFiction creativenonfiction = new CreativeNonFiction();

        mystery.recommendBook();
        //mystery.describeBook();
        biography.describeBook();
        //biography.recommendBook();
        creativenonfiction.recommendBook();
        creativenonfiction.describeBook();
    }
}
