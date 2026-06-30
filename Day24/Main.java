package Day24;

public class Main {
   public static void main(String[] args) {
    read(5);
   }
   private static void read(int chapter){
   // for (int i=0; i< chapter; i++){ // Iteration which is a repetition of a process
       // System.out.println("Read a chapter!");
       if (chapter < 1) return; //base case
       System.out.println("Read a chapter a day!");
       read(chapter - 1); // Recursive case
    }
   } 

  

