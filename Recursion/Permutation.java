package Recursion;

public class Permutation {
    public static void permutationString(String str, StringBuilder ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);

            // Pass a new StringBuilder instance to avoid modifying the original one
            permutationString(newStr, new StringBuilder(ans).append(ch));
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        permutationString(str, new StringBuilder());
    }
}
