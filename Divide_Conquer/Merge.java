package Divide_Conquer;

public class Merge {
    public static void final_mergre(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        
        // Copy temp array back to original array
        for (int x = 0, y = si; x < temp.length; x++, y++) {
            arr[y] = temp[x];
            System.out.print(arr[y]+ " ");
           
        }
    }

    public static void Merge_sort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;

        Merge_sort(arr, si, mid);
        Merge_sort(arr, mid + 1, ei);
        final_mergre(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5 };
        Merge_sort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
