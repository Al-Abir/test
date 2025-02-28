package Recursion;

public class fibo {
    public static int fibonaci(int n){
        if(n==1 || n==0){
            return n;
        }
        return  fibonaci(n-1)+fibonaci(n-2);

}
    public static void main(String[] args) {
        int n=5;
        System.out.println(fibonaci(n));
    }
}
