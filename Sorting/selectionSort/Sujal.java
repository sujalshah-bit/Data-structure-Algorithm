package selectionSort;
import java.util.Arrays;

/**
 * This is a sample Java program demonstrating the selection sort algorithm.
 * It sorts an array of integers in ascending order.
 */
public class Sujal {

    public static void main(String[] args) {
        int[] arr = { 4, 3, 5, 2, 1 }; // Sample integer array
        selectionSort(arr); // Call the selectionSort function to sort the array
        System.out.println(Arrays.toString(arr)); // Print the sorted array
    }

    /**
     * This function performs the selection sort algorithm on the given array.
     * It sorts the array in ascending order.
     *
     * @param arr The array to be sorted.
     * @return The sorted array.
     */
    static int[] selectionSort(int[] arr) {
        int first = 0; // Initialize the first index of the unsorted subarray
        int max = 0; // Initialize the index of the maximum element
        int temp; // Temporary variable for swapping elements

        // Iterate through the array and select the maximum element in each pass
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1; // Calculate the last index of the unsorted subarray
            max = findMax(arr, last, first); // Find the index of the maximum element
            temp = arr[last]; // Store the last element in temp
            arr[last] = arr[max]; // Replace the last element with the maximum element
            arr[max] = temp; // Place the maximum element at the last index
        }
        return arr; // Return the sorted array
    }

    /**
     * This function finds the index of the maximum element in the given range of the array.
     *
     * @param arr   The array to search.
     * @param last  The last index of the range.
     * @param first The first index of the range.
     * @return The index of the maximum element within the specified range.
     */
    static int findMax(int[] arr, int last, int first) {
        int max = first; // Initialize the index of the maximum element
        for (int i = first; i < last; i++) {
            // Compare the current element with the maximum element found so far
            if (arr[max] < arr[i]) {
                max = i; // Update the index of the maximum element if a larger element is found
            }
        }
        return max; // Return the index of the maximum element in the specified range
    }
}
