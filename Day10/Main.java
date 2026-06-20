package Day10;

public class Main {
    public static void main(String[] args) {
        Mystery mystery = new Mystery();
        Biography biography = new Biography();
        CreativeNonFiction creativenonfiction = new CreativeNonFiction();

        mystery.Fantasy();
        biography.Encourage();
        creativenonfiction.Encourage();
        creativenonfiction.Fantasy();
    }
}
