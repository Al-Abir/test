package Round_1017;



import java.util.Scanner;

public class Bobritto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  

        while (t-- > 0) {
            int n = sc.nextInt(); 
            int m = sc.nextInt();
            int l = sc.nextInt(); 
            int r = sc.nextInt(); 
        
            int len = m;
            int lp = l; 
            int rp = lp + len;

            System.out.println(lp + " " + rp);
        }

        sc.close();
    }
}
