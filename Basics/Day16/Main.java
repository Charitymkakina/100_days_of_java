package Basics.Day16;

public class Main {
    public static void main (String[]args){
        DynamicArray dynamicArray = new DynamicArray(5);

        dynamicArray.add("YAY!");
        dynamicArray.add("Nay");
        dynamicArray.add("WOW");
        dynamicArray.add("Huh");
        dynamicArray.add("Sigh");
        dynamicArray.add("Yikes");

        dynamicArray.delete("Sigh");
        dynamicArray.delete("YAY!");
        dynamicArray.delete("WOW");

       //dynamicArray.insert(0,"Expressions");
        //dynamicArray.delete("WOW");
        //System.out.println(dynamicArray.search("Nay"));

        System.out.println(dynamicArray); 
        System.out.println("Size: " + dynamicArray.size);
        System.out.println("Capacity: " + dynamicArray.capacity);
        System.out.println("Empty: " + dynamicArray.isEmpty());
    }
}
