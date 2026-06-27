package Day18;

public class Main {
    public static void main (String [] args){
        int [] array = {9,1,8,2,7,3,6,4,5}; //Array of integers to search through.
        int index = LinearSearch(array,5); // Search for the value 5 (can be any value) and store its index

        //Check whether the value was found
        if (index != -1){
            System.out.println("Element found at index: " + index);
        }

    }
    private static int LinearSearch(int[] array,int value){ // Linear search checks each element one by one.
        for (int i=0; i< array.length; i++){ // Loop through each each element in the array.

            // If the current element matches the target value,
            // return its index.
            if (array[i] == value){
                return i;
            }
            
        }
        return -1; // Return -1 if value is not found.
    }
}
