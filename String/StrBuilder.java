package String;

public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        for(char ch = 'a';ch<='z';ch++)
        {
            sb.append(ch);
            
        }

        System.out.println(sb);
    }
    
}
