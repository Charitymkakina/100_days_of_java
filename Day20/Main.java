package Day20;

public class Main {
    public static void main (String []args){

        int [] array = {1,2,4,8,16,32,64,128,256,512,1024};  // A sorted array is required for Interpolation Search.

        int index= interpolationSearch(array,128); // Search for the value 8.

        if (index != -1) { //Check whether the value was found

            System.out.println("Element found at index: " + index);
        }
        else {
            System.out.println("Element not found!");
        }
    }
    private static int interpolationSearch(int[]array, int value){
        int high= array.length-1; // 'high' points to the end of the search range.

        int low = 0; //'low' points to the beginning of the search range.

// Continue searching while the value lies within
// the current search range.
    while (value >= array[low] && value <= array[high] && low <= high ){
        
        int probe= low + (high - low) * (value - array[low]) / (array[high] - array[low]);  // Estimate where the target value should be.

        System.out.println("Probe: " + probe);
    
    if (array[probe]== value){ // Target found.
        return probe;

    }else if (array[probe]< value) { // Search the right portion.
        low = probe + 1;

    }else{ // Search the left portion.
        high = probe- 1;
    }
}
return -1;
}
}

