package Round_1017;

import java.util.Scanner;

public class Brr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0) {
            int n= sc.nextInt();
            int matrix[][] = new int[n][n];
            for(int i =0; i<matrix.length; i++){
                for(int j=0; j<matrix.length; j++){
                       matrix[i][j] = sc.nextInt();
                }

            }

            int p = 2*n;

            for(int i=0; i<p; i++){
                for(int j=0; j<p; j++){
                    System.out.print(matrix[i+j]+" ");
                }
            }
            
        }
    }
}
