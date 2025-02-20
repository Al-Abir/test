package Sorting;

import java.util.Scanner;

public class boubble{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        for(int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        // buble sort code 1st itereation largest element last index

        for(int i =0; i<arr.length-1; i++){

            for(int j=0; j<arr.length-i-1; j++){
                     if(arr[j]>arr[j+1]){
                        int temp = arr[j];
                         arr[j] = arr[j+1];
                         arr[j+1]= temp;
                     }
            }
        }

        for(int i =0; i<arr.length; i++){
    
            System.out.print(arr[i] + " ");
       }
    }
}