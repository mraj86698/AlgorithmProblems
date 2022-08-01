package AlgorithmProblems;

/**
 * This is an Insertion Sort Using String To take user input as string Array and
 * Sort The String Array using Insertion SOrt.
 *
 * @author mraj
 *
 */
public class InsertionSortString {

	public static String[] sortSub(String array[], int f) {
		String temp = "";
		for (int i = 0; i < f; i++) {
			for (int j = i + 1; j < f; j++) {
				if (array[i].compareToIgnoreCase(array[j]) > 0) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;

	}

	public static void main(String args[]) {
		System.out.println("Enter the number of elements you want to insert:");
		int number = Utility.inputInteger();
		String c[] = new String[number];
		System.out.println("Enter the Words:");
		for (int i = 0; i < number; i++) {
			c[i] = Utility.inputString();
		}
		String arr[] = c;
		int count = 0;
		System.out.println("Words Before sorting:");
		for (int i = 0; i < number; i++) {
			System.out.println(arr[i]);
		}

		String sortedArray[] = sortSub(arr, arr.length);
		System.out.println();
		System.out.println("Words After sorting:");

		for (int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i]);
		}
	}

}
