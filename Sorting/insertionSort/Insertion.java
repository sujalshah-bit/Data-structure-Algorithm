package insertionSort;
import java.util.Arrays;

public class Insertion {

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            // Current element to be inserted into the sorted part
            int key = arr[i];
            
            // Index to traverse the sorted part from right to left
            int j = i - 1;

            // Move elements of the sorted part greater than key to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            
            // Insert the key into its correct position in the sorted part
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        // insertion sort 
        int[] arr =  { 5, 2, 9, 3, 6, 1, 8, 4, 7};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}



