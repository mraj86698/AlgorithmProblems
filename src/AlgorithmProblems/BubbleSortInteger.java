package AlgorithmProblems;
/**
 * This is an Bubble Sort Algorithm for Integers
 * @author mraj
 * Bubble Sort is an Place Sorting Technique.
 * It is an Sorting Techniques to Sort the Array of Elements.
 * To traverse from the starting element to the last one by comparing the adjacent elements and swapping them
 */
public class BubbleSortInteger {
	public static void printArray(int[] array) {
	    for(int i=0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
	    System.out.println();
	}

	public static void bubbleSortInteger(int[] arr) {
		 int n = arr.length;
		 int temp = 0;
		 for(int i=0; i < n; i++) {
			 for(int j=1; j < (n-i); j++) {
				 if(arr[j-1] > arr[j]) {
					 //swap elements
					 temp = arr[j-1];
					 arr[j-1] = arr[j];
					 arr[j] = temp;
				 }

			 }
		 }
	  }

	public static void main(String[] args) {

		System.out.println("Enter the number of elements you want to insert:");
		int number = Utility.inputInteger();
		int a[] =  new int[number];
		System.out.println("Enter the elements:");
		for(int i = 0; i < number ; i++)
			a[i] = Utility.inputInteger();
		int arr[] = a;
		System.out.println("Before Bubble Sort");
		printArray(arr);
		System.out.println();

        bubbleSortInteger(arr);//sorting array elements using bubble sort

        System.out.println("Array After Bubble Sort");

        printArray(arr);

	}

}
