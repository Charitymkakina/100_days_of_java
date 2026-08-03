package demo;

public class Dev {

  //  private Laptop laptop;

   private int age; // to access this private variable we use a setter or a getter.

    public Dev(){
        System.out.println("Dev Constructor");
    }

    public Dev (int age){
        this.age = age;
        System.out.println("Constructor injection "); //parameterlized constructor
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void build (){
        System.out.println("Using spring without boot");
    }
  //  laptop.compile();
}
