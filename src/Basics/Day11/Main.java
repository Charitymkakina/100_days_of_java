package Basics.Day11;

public class Main {
    public static void main (String[]args){
        Book book1 = new Book();
        Book book2 = new Book(){ //Anonymous classes allow us to create a one-time subclass
// without creating a separate class file.
            @Override
            public void Read (){ 
                System.out.println("Twisted games by Ana Huang is a really interesting book");
            }
        }; //End of anonymous class 
    book1.Read();
    book2.Read();
}

}
