package String;
import java.util.Arrays;

public class Anagrams {
    public static void isAnagram(String str1,String str2)
    {
        str1 = "heart";
        str2 = "earth";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
       if(str1.length()==str2.length())
       {
        char[] str1CharArray = str1.toCharArray();
        char[] str2CharArray = str2.toCharArray();

        Arrays.sort(str1CharArray);
        Arrays.sort(str2CharArray);

        boolean result = Arrays.equals(str1CharArray, str2CharArray);
        if(result){
            System.out.println("The both words are anagram of each other");
        }
        else
        {
            System.out.println("Not anagrams");
        }
       }
       else
       {
        System.out.println("Not anagrams");
       }
        
    }
    public static void main(String[] args) {
        isAnagram("race", "care");
        
    }
    
}
