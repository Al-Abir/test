package Recursion;

public class increasing {
    public static void increasingOrder(int n){
       if(n==1){
         System.out.println(n);
         return;
       }
       increasingOrder(n-1);
       System.out.println(n);
       
    }
    public static void dreacsingOrder(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        dreacsingOrder(n-1);
    }
    public static void main(String[] args) {
        
        int n=10;
          increasingOrder(n);
          dreacsingOrder(n);
    }
}
