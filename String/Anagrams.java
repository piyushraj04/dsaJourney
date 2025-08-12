package String;  // Package name (used to group related classes)

// Importing Arrays utility class to use methods like sort() and equals()
import java.util.Arrays;

public class Anagrams {

    // Method to check if two words are anagrams
    public static void isAnagram(String str1, String str2) {

        // Hardcoding the values (NOTE: This will ignore the arguments passed from main)
        str1 = "heart";
        str2 = "earth";

        // Convert both strings to lowercase to make comparison case-insensitive
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Step 1: If both strings have the same length, only then they can be anagrams
        if (str1.length() == str2.length()) {

            // Step 2: Convert both strings into character arrays
            char[] str1CharArray = str1.toCharArray();
            char[] str2CharArray = str2.toCharArray();

            // Step 3: Sort both character arrays
            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);

            // Step 4: Compare both sorted arrays
            boolean result = Arrays.equals(str1CharArray, str2CharArray);

            // Step 5: If they match → They are anagrams
            if (result) {
                System.out.println("Both words are anagrams of each other");
            } 
            // Step 6: If they don't match → Not anagrams
            else {
                System.out.println("Not anagrams");
            }
        } 
        // Step 7: If lengths are different → Not anagrams
        else {
            System.out.println("Not anagrams");
        }
    }

    // Main method → Program execution starts here
    public static void main(String[] args) {
        // Calling the method with sample words
        isAnagram("race", "care");
    }
}
