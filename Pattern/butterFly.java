package Pattern;

import java.util.Scanner;

public class butterFly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<=n; i++){
            
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }

            for(int k=1; k<=2 *(n-i) ; k++){
                System.out.print(" ");
            }
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();


        }

        for(int i=n; i>=1; i--){
            
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }

            for(int k=1; k<=2 *(n-i) ; k++){
                System.out.print(" ");
            }
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();


        }
    }
}
