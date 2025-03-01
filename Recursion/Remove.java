package Recursion;

public class Remove {
    public static void removeduplicate(String st, int idx, boolean map[], StringBuilder sb) {
        if (idx == st.length()) {
            System.out.println(sb);
            return;
        }

        char ch = st.charAt(idx);
        if (map[ch - 'a']) {
            removeduplicate(st, idx + 1, map, sb);
        } else {
            map[ch - 'a'] = true;
            sb.append(ch); // Append character instead of index
            removeduplicate(st, idx + 1, map, sb);
        }
    }

    public static void main(String[] args) {
        String st = "aaavvvceg";
        boolean[] map = new boolean[26];
        removeduplicate(st, 0, map, new StringBuilder());
    }
}
