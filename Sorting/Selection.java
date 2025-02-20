package Sorting;

public class Selection {
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};

        for(int i = 0; i < arr.length - 1; i++) {
            int minpos = i;
            for(int j = i + 1; j < arr.length; j++) { // Fixed loop increment
                if(arr[j] < arr[minpos]) { // Fixed comparison condition
                    minpos = j;
                }
            }
            // Swap elements
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }

        // Print sorted array
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
