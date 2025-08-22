package String;

public class ReverseOddPositionWords {
     private static String reverse(String word)
    {
        String rev = "";
        for(int i = word.length()-1;i >= 0;i--)
        {
            rev+=word.charAt(i);
        }
        return rev;
    }
    private static void reverseOddPositionWords(String sentence)
    {
        String[] str = sentence.split(" ");
        for(int i = 0; i < str.length;i++)
        {
           System.out.print((i%2!=0)?str[i]+" ":reverse(str[i])+" ");
        }
    }
    public static void main(String[] args) {
        String s = "hello hi bye how are you";
        reverseOddPositionWords(s);
    }
}
