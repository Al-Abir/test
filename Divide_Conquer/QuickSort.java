package Divide_Conquer;

public class QuickSort {
    public static void quick_sort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int idx = partition(arr, si, ei);
        quick_sort(arr, si, idx - 1);
        quick_sort(arr, idx + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;  // Fixing indexing issue

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap pivot to its correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[ei];
        arr[ei] = temp;
        
        return i + 1; // Return correct pivot index
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 8, 2, 5};
        quick_sort(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
