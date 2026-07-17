package Basics.Day22;

public class Main {
    public static void main (String []args){
        int array[]={8,7,9,3,1,5,4,6,2};
        selectionSort(array);
        for (int i:array){
            System.out.print(i);
        }
    }
    private static void selectionSort (int[] array){
        for(int i =0; i<array.length-1; i++){
            int min = i;
            for(int j=i+1; j<array.length; j++){
                if (array[min] > array[j]){ //Update the minimum index if a smaller element is found.
                    min=j;
                }

            }
            int temp = array[i]; //swap the smallest element found with the current position.
            array[i] = array[min];
            array[min]=temp;
        }
    }
}
