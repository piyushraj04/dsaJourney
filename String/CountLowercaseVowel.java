package String;

//Count how many times lowercase vowels occurred in a String entered by the user.
public class CountLowercaseVowel {
    public static int countSmallCaseVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "I am a boy Of ethics and religion";
        String str2 = "Piyush";
        System.out.println(countSmallCaseVowels(str));
    }

}
