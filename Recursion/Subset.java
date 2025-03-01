package Recursion;

public class Subset {
    public static void set(String str, String ans, int i) {
        if (i == str.length()) { // Base case
            System.out.println(ans);
            return; // Stop further recursion
        }
       // Include the current character
        set(str, ans + str.charAt(i), i + 1);

        // Exclude the current character
        set(str, ans, i + 1);
        
     
       
    }

    public static void main(String[] args) {
        String str = "abc";
        set(str, "", 0);
    }
}
