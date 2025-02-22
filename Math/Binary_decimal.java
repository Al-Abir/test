package Math;

public class Binary_decimal {
    public static void main(String[] args) {
        int n = 101;

        int power =0;
        int dec =0;
        while(n>0){
            int lastdigit = n%10;
            dec = dec + (lastdigit * (int)Math.pow(2,power));

            power++;

            n=n/10;
        }
        System.out.println(dec);
    }
}
