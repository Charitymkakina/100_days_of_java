package Day23;

public class Main {
    public static void main(String[] args) {
        int array[]={9,1,8,2,7,3,6,5,4};
        insertionSort(array);

        for (int i: array){
            System.out.print(i+ " ");
        }
    }
    private static void insertionSort(int[]array){
        for (int i=1; i < array.length; i++){
            int temp = array[i];
            int j=i-1; //what value are we comaparing it to the left of i

            while (j >= 0 && array[j]>temp) {
                array[j+1] = array[j]; // Shifts an element to the right.
                j--;
            }
            array[j+1] = temp;
        }
    }
}
