package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};

        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;

            // Shift elements of sorted part that are greater than `curr`
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            // Insert `curr` at the correct position
            arr[prev + 1] = curr;
        }

        // Print sorted array
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
