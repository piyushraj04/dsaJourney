package Recursion;

public class RemoveDuplicates {
    public static void removeDuplicates(String s, StringBuilder newStr, int idx, boolean[] map)
    {
        if(idx == s.length())
        {
            System.out.println(newStr);
            return;
        }
        //work
        char currChar = s.charAt(idx);
        if(map[currChar-'a']==true)
        {
            //duplicate
            removeDuplicates(s, newStr, idx+1, map);
        }
        else{
            //unique
            map[currChar-'a']=true;         
            removeDuplicates(s, newStr.append(currChar), idx+1, map);
        }
    }
    public static void main(String[] args) {
        
        removeDuplicates("appnnacollege",new StringBuilder(""), 0, new boolean[26]);
    }
    
}
