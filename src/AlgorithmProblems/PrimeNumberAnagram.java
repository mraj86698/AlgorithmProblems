package AlgorithmProblems;

import java.util.Arrays;
/**
 * This is an primenumberAnagram and PallindromeAnagram
 * @author mraj
 *
 */

public class PrimeNumberAnagram {
	public static boolean anagram(String string1, String string2) {
		if(string1.length() != string2.length()) {
			return false;
		}
		char[] array1 = string1.toCharArray();
		Arrays.sort(array1);
		char[] array2 = string2.toCharArray();
		Arrays.sort(array2);

		for(int i = 0; i < array1.length; i++) {
			if(array1[i] != array2[i]) {
				return false;
			}
		}
		return true;
	}

	/**
	 * @param range- up to which prime numbers are to be found
	 * @returns string array of prime numbers in  a given range
	 */
	public static String[] prime(int range) {
		String[] array = new String[1000];
		int position = 0;
		for(int i = 2; i <= range; i++) {
			boolean isPrime = true;
			for(int j = 2; j <= i / 2; j++) {
				if((i % j) == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				array[position] = String.valueOf(i);
				position++;
			}
		}
		String[] returnArray = new String[position];
		for(int k = 0; k < position; k++) {
			returnArray[k] = array[k];
		}
		return returnArray;
	}



	/**
	 * @param string- string to check for palindrome
	 * @returns true if the string is palindrome else returns false
	 */
	public static boolean palindrome(String string) {
		if(string.length() < 2) {
			return false;
		}
		char[] array = string.toCharArray();
		int n = array.length;
		for(int i = 0; i < n; i++) {
			if(array[i] != array[n - 1 - i]) {
				return false;
			}
		}
		return true;
	}
public static void main(String[] args) {

		System.out.println("Enter the nth term:");
		int n=Utility.inputInteger();
		String[] primeNumbers = prime(n);
		/**
		 * prints prime numbers that are anagrams
		 */
		System.out.println("Anagram and prime numbers are:");
		for(int i = 0; i < primeNumbers.length; i++) {
			for(int j = i + 1; j < primeNumbers.length; j++) {
				if(anagram(primeNumbers[i], primeNumbers[j])) {
					System.out.println(primeNumbers[i] + " " + primeNumbers[j]);
				}
			}
		}
		/**
		 * prints prime numbers that are palindrome
		 */
		System.out.println("\nPalindrome and prime numbers are:");
		for(int i = 0; i < primeNumbers.length; i++) {
			if(palindrome(primeNumbers[i])) {
				System.out.println(primeNumbers[i]);
			}
		}

	}


}
