package Basics.Day40;

public class Dev {
    private Laptop laptop;
// private Laptop laptop = new Laptop(); // we have created the laptop object
   
   //public void setLaptop(Laptop laptop){
    //this.laptop = laptop;
   //}
   public Dev(Laptop laptop){
    this.laptop = laptop;
   }
    
   public void build(){
    laptop.compile(); // we have called the laptop 
   // System.out.println("Building Java Projects");
   }
}
