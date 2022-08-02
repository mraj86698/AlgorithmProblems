package AlgorithmProblems;

import java.util.Arrays;
/**
 *
 * @author mraj
 *
 */

public class AnagramDetection {
	public static boolean Anagram(String str1, String str2)
    {
		/**
		 * convert strings to char array
		 * sort the char array
		 */
        char[] string1=str1.toCharArray();
        char[] string2=str2.toCharArray();
        Arrays.sort(string1);
        Arrays.sort(string2);
        /**
         * if sorted char arrays are same then the string is anagram
         */
        boolean isAnagram =false;
        isAnagram = Arrays.equals(string1, string2);
        if(isAnagram==true)
        {

        	 return isAnagram;
        }
        else

        	  return isAnagram;

    }
	 public static void displayAnagram(boolean status) {
			if(status)
			{
				System.out.println("Is Anagram");
			}
			else
				System.out.println("Is Not Anagram");
		}
	public static void main(String args[]) {
		System.out.println("Enter String 1:");
		String str1=Utility.inputStringLine().toLowerCase().replaceAll("\\s", "");
		System.out.println("Enter String 2:");
		String str2=Utility.inputStringLine().toLowerCase().replaceAll("\\s", "");
		boolean status=Anagram(str1, str2);
		displayAnagram(status);
	}

}
