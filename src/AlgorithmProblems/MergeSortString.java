package AlgorithmProblems;

import java.util.Arrays;
/**
 *
 * @author mraj
 *	we will split this array at its mid element into two sub-arrays.
 *	Then we will continue splitting the sub-arrays into smaller arrays till we get a single element in each array.
 *	Once each sub-array has only one element in it, we merge the elements.
 *	While merging, we compare the elements and ensure that they are in order in the merged array.
 *	Then Merged array is sorted.
 */
public class MergeSortString {

	public static String[] mergeSort(String[] list) {
		String[] sorted = new String[list.length];
		if (list.length == 1) {
			sorted = list;
		} else {
			int mid = list.length / 2;
			String[] left = null;
			String[] right = null;
			if ((list.length % 2) == 0) {
				left = new String[list.length / 2];
				right = new String[list.length / 2];
			} else {
				left = new String[list.length / 2];
				right = new String[(list.length / 2) + 1];
			}

			int y = 0;
			int x = 0;
			for (; x < mid; x++) {
				left[x] = list[x];
			}
			for (; x < list.length; x++) {
				right[y++] = list[x];
			}
			left = mergeSort(left);
			right = mergeSort(right);
			sorted = mergeArray(left, right);
		}

		return sorted;
	}

	private static String[] mergeArray(String[] left, String[] right) {
		String[] merged = new String[left.length + right.length];
		int start = 0;
		int end = 0;
		int mid = 0;
		int comp = 0;
		while (start < left.length || end < right.length) {
			if (start == left.length) {
				merged[mid++] = right[end++];
			} else if (end == right.length) {
				merged[mid++] = left[start++];
			} else {
				comp = left[start].compareTo(right[end]);
				if (comp > 0) {
					merged[mid++] = right[end++];
				} else if (comp < 0) {
					merged[mid++] = left[start++];
				} else {
					merged[mid++] = left[start++];
				}
			}
		}
		return merged;
	}

	public static String printStringArray(String array[]) {
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
		String str = Arrays.toString(array);
		str = str.substring(1, str.length() - 1);
		// System.out.println(str);
		return str;
	}

	public static void main(String[] args) {
		System.out.println("Enter the number of elements you want to insert:");
		int number = Utility.inputInteger();
		if (number >= 2) {
			String c[] = new String[number];
			System.out.println("Enter the Words:");
			for (int i = 0; i < number; i++) {
				c[i] = Utility.inputString();
			}
			String array[] = c;
			System.out.println("Words Before sorting:");
			printStringArray(array);
			System.out.println("Words After Sorting:");
			String[] sortedArray = mergeSort(array);
			printStringArray(sortedArray);
		} else {
			System.out.println("Nothing is Inserted!!");
		}
	}
}
