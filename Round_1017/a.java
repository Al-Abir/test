package Round_1017;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            String str = sc.nextLine();
            String ans = "";

            for (int i = 0; i < str.length(); i++) {
                if (i == 0 || str.charAt(i - 1) == ' ') {
                    ans += str.charAt(i);
                }
            }

            System.out.println(ans);
        }
    }
}
