package demo;

public class Dev {

    private Computer computer;

    public void setComputer(Computer computer){
        this.computer= computer;
    }
     public Dev(){
        System.out.println("Dev Constructor");
    }
    public void build (){
        computer.compile();
        System.out.println("Using spring without boot");
    }
  
}
