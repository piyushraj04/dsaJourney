package Recursion.Assignments;

public class NumberToWord {
    public static String intToString(int num,int n, String[] word, String res) {
        if (num == 0) {
            res =  word[n]+" "+res;
            return res;
        }
        return intToString(num/10,num%10 ,word,  word[n]+" "+res);

    }

    public static void main(String[] args) {
        int num = 1947;
        String[] word = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        System.out.println(intToString(num/10, num%10,word, ""));
    }

}
