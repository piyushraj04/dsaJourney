package String;

public class RemoveExtraSpace {
    public static void main(String[] args) {
        String s = "hi        hello          bye";
        String newStr  = "";
        for(int i = 0; i < s.length() ;  i++)
        {
            if(s.charAt(i) == ' ' && s.charAt(i+1) == ' ')
            {
                continue;
            }
            else{
                newStr += s.charAt(i);
            }
        }
        System.out.println(newStr);
    }
    
}
