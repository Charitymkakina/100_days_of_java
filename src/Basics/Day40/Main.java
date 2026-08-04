package Basics.Day40;

// Main creates the laptop, creates the Dev and  dev uses the laptop making setter injection
public class Main {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
       // Dev dev = new Dev();
       Dev dev = new Dev(laptop); //Constructor injection.

       // dev.setLaptop(laptop); 
        //laptop.compile();
        dev.build();
    }
}
