package Recursion.Assignments;

public class LengthOfString {
    public static int lengthOfString(String str, String ans,int cnt,int i)
    {
        // if(i==str.length())
        // {
        //     return cnt++;
        // }
        // return lengthOfString(str, ans+str.charAt(i), cnt++, i+1);

        return str.length();
    }
    public static void main(String[] args) {
        System.out.println(lengthOfString("Piyush", "", 0, 0));
        
    }
    
}
