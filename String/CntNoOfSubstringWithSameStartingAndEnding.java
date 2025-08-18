package String;

public class CntNoOfSubstringWithSameStartingAndEnding {
    public static void cntOfSubstring(String s) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                for (int k = i; k <= j; k++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        System.out.print("<"+s.charAt(k) +">");
                    }
                }
                if (s.charAt(i) == s.charAt(j)) {
                    System.out.println();
                    cnt++;
                    System.out.println("-->"+s.charAt(i)+","+s.charAt(j));
                }
            }
        }
        System.out.println(cnt);
    }

    public static void main(String[] args) {
        cntOfSubstring("abcab");
    }
    
}
