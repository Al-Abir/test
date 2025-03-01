package Recursion;

public class Tailing {
      public static int Tailing_solution(int n){

        if(n==1 || n==0){
            return 1;
        }
        int fn1 = Tailing_solution(n-1);
        int fn2 = Tailing_solution(n-2);

        int totalways = fn1+fn2;
        return totalways;
      }
      public static void main(String[] args) {
        System.out.println(Tailing_solution(4));
      }    
}
