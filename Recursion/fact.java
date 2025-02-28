package Recursion;

public class fact {
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static int naturalSum(int n){
        if(n==1){
            return 1;
        }
        return n + naturalSum(n-1);
    }
    public static void main(String[] args) {
        
        int n =5;
        
        System.out.println(factorial(n));
        System.out.println(naturalSum(n));
    }
}
