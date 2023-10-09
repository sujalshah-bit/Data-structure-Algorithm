package bubbleSort;

import java.util.Arrays;

public class Bubble {

    static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            
            if(!swapped){
                break;
            }
            
        }
    }

    public static void main(String[] args) {
         // bubble sort 
        int[] arr =  { 5, 2, 9, 3, 6, 1, 8, 4, 7};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr)); 
    }
}
