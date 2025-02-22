package Math;


public class Prime_range {
    public static boolean isPrime(int i){
        if(i==2){
            return true;
        }
        if(i%2==0){
            return false;
        }else{
            return true;
        }
    }
    public static void primeRange(int n){
        for(int i=2; i<=n; i++){

            if(isPrime(i)){
                System.out.print(i +" ");
            }
        }
    }
    public static void main(String[] args) {
        int n=10;
        primeRange(n);
    }
}
