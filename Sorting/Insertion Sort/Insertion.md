
```java
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
```

**Intuition of Insertion Sort:**

**What:** Insertion sort is an in-place sorting algorithm that builds the sorted part of an array one element at a time.

**Why:** It is used when you have a small dataset or when the array is partially sorted because it is efficient for such cases.

**How:**

1. **Initial State:** At the beginning, the first element (index 0) is considered sorted because a single element is always sorted.

2. **Building the Sorted Part:** The algorithm iterates through the unsorted part of the array, starting from the second element (index 1). It takes the current element and compares it with the elements in the sorted part.

3. **Insertion:** For each element in the unsorted part, it finds the correct position in the sorted part by shifting larger elements to the right.

4. **Shifting:** Elements in the sorted part are shifted to the right to make space for the current element to be inserted in its correct position.

5. **Repeat:** This process continues for each element in the unsorted part until the entire array is sorted.

**Code Explanations:**

- We start from `i = 1` because the first element (at index 0) is already considered sorted.

- `key` stores the current element we want to insert into the sorted part.

- `j` is used to traverse the sorted part from right to left.

- The `while` loop (insertion phase) finds the correct position for the `key` element by shifting larger elements to the right.

- Once the correct position is found, we insert the `key` element into the sorted part.


**diagram representing the Insertion Sort algorithm step by step:**

```
Initial State:
[5] 2 9 3 6 1 8 4 7   <-- Sorted: [5]

Building the Sorted Part:
[5] [2] 9 3 6 1 8 4 7   <-- Sorted: [2, 5]

Insertion (1st Pass):
[2] [5] 9 3 6 1 8 4 7   <-- Sorted: [2, 5]

Insertion (2nd Pass):
[2 5] [9] 3 6 1 8 4 7   <-- Sorted: [2, 5, 9]

Insertion (3rd Pass):
[2 5 9] [3] 6 1 8 4 7   <-- Sorted: [2, 3, 5, 9]

Insertion (4th Pass):
[2 3 5 9] [6] 1 8 4 7   <-- Sorted: [2, 3, 5, 6, 9]

Insertion (5th Pass):
[2 3 5 6 9] [1] 8 4 7   <-- Sorted: [1, 2, 3, 5, 6, 9]

Insertion (6th Pass):
[1 2 3 5 6 9] [8] 4 7   <-- Sorted: [1, 2, 3, 5, 6, 8, 9]

Insertion (7th Pass):
[1 2 3 5 6 8 9] [4] 7   <-- Sorted: [1, 2, 3, 4, 5, 6, 8, 9]

Insertion (8th Pass):
[1 2 3 4 5 6 8 9] [7]   <-- Sorted: [1, 2, 3, 4, 5, 6, 7, 8, 9]
```

This diagram illustrates the progression of the algorithm as it builds the sorted part of the array. Each step shows the current state of the sorted and unsorted parts of the array. The insertion step is performed to place the current element in its correct position within the sorted part. The sorted part grows with each pass until the entire array is sorted.

In summary, insertion sort works by iteratively selecting elements from the unsorted part and inserting them into their correct positions within the sorted part, effectively building the sorted part one element at a time. It's efficient for small datasets or partially sorted arrays but less efficient for large datasets due to its O(n^2) time complexity.