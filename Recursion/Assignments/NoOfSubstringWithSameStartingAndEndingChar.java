package Recursion.Assignments;

public class NoOfSubstringWithSameStartingAndEndingChar {

    public static int cntOfSubstring(String s, int i, int j) {
        // Base condition: when indices go out of range
        if (i >= s.length() || j >= s.length()) {
            return 0;
        }

        // Count this substring if start and end match
        int cnt = (s.charAt(i) == s.charAt(j)) ? 1 : 0;

        // Explore further substrings
        return cnt
                + cntOfSubstring(s, i, j + 1) // expand substring
                + cntOfSubstring(s, i + 1, j); // move to next start
    }

    public static void main(String[] args) {
        String s = "abcab";
        int ans = cntOfSubstring(s, 0, 0);
        System.out.println("Count = " + ans);
    }
}
