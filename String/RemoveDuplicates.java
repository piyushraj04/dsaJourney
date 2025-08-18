package String;

public class RemoveDuplicates {
    public static String removeRepetition(String s)
    {
        String res  = "";
        for(int i = 0; i < s.length()-1; i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                continue;
            }
            else
            {
                res = res + s.charAt(i);
            }
        }
        return res;
    }

    public static StringBuilder removeDuplicate(String s)
    {
        StringBuilder sb = new StringBuilder("");
        char[] ch = new char[26];
        for(int i = 0;i < s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                ch[s.charAt(i)-'a']++;
                System.out.println(ch[s.charAt(i)]-'a');
            }
        }
        return sb;
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicate("appnnacolllegeeejiiiiiiii"));
        
    }
    
}
