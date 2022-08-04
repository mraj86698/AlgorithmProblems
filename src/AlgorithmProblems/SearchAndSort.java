package AlgorithmProblems;

public class SearchAndSort {

	/**
	 * @param binaryIntArray - integer array to sort
	 * @returns sorted integer array in descending order
	 */
	public static int[] insertionSortDescending(int[] binaryIntArray) {

		for(int i = 1; i < binaryIntArray.length; i++) {
			int key = binaryIntArray[i];
			int j = i - 1;
			while((j > -1) && (binaryIntArray[j] < key)) {
				binaryIntArray[j+1] = binaryIntArray[j];
				j--;
			}
			binaryIntArray[j+1] = key;
		}

		return binaryIntArray;
	}

	/**
	 * @param binaryIntArray - integer array to sort
	 * @returns sorted integer array in descending order
	 */
	public static int[] bubbleSortDescending(int[] binaryIntArray) {

		int n = binaryIntArray.length;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < (n - 1 - i); j++) {
				if(binaryIntArray[j] < binaryIntArray[j+1]) {
					int temp = binaryIntArray[j];
					binaryIntArray[j] = binaryIntArray[j+1];
					binaryIntArray[j+1] = temp;
				}
			}
		}

		return binaryIntArray;
	}

	/**
	 * @param search - integer to search
	 * @param binaryIntArray - integer array in which integer is to be searched
	 * @returns the position of the integer if found else returns -1
	 */
	public static int binarySearch(int search , int[] binaryIntArray) {
		int first = 0, last = binaryIntArray.length - 1;
		int middle;

		while(first <= last) {
			middle = (first + last) / 2;
			if(binaryIntArray[middle] < search) {
				last = middle - 1;
			}
			else if(binaryIntArray[middle] > search) {
				first = middle + 1;
			}
			if(binaryIntArray[middle] == search) {
				return middle;
			}
		}
		return -1;
	}



	/**
	 * @param binaryStringArray - string array to sort
	 * @returns sorted string array in descending order
	 */
	public static String[] insertionSortDescending(String[] binaryStringArray) {

		for(int i = 1; i < binaryStringArray.length; i++) {
			String key = binaryStringArray[i];
			int j = i - 1;
			while((j > -1) && (binaryStringArray[j].compareTo(key) < 0)) {
				binaryStringArray[j+1] = binaryStringArray[j];
				j--;
			}
			binaryStringArray[j+1] = key;
		}

		return binaryStringArray;
	}

	/**
	 * @param binaryStringArray - string array to sort
	 * @returns sorted string array in descending order
	 */
	public static String[] bubbleSort(String[] binaryStringArray) {

		int n = binaryStringArray.length;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < (n - 1 - i); j++) {
				if(binaryStringArray[j].compareTo(binaryStringArray[j+1]) < 0) {
					String temp = binaryStringArray[j];
					binaryStringArray[j] = binaryStringArray[j+1];
					binaryStringArray[j+1] = temp;
				}
			}
		}

		return binaryStringArray;
	}

	/**
	 * @param search - string to search
	 * @param binaryStringArray - array in which string is to be searched
	 * @returns position of the string if found else returns -1
	 */
	public static int binarySearch(String search , String[] binaryStringArray) {
		int first = 0, last = binaryStringArray.length - 1;
		int middle;

		while(first <= last) {
			middle = (first + last) / 2;
			if(binaryStringArray[middle].compareTo(search) < 0) {
				last = middle - 1;
			}
			else if(binaryStringArray[middle].compareTo(search) > 0) {
				first = middle + 1;
			}
			if(binaryStringArray[middle].compareTo(search) == 0) {
				return middle;
			}
		}
		return -1;
	}



	public static void main(String[] args) {
			System.out.print("Enter number of integers: ");
			int count = Utility.inputInteger();	//	count
			int[] intArray = new int[count];	//original integer array

			//	fills the array
			System.out.print("Enter integers: ");
			for(int i = 0; i < count; i++) {
				intArray[i] = Utility.inputInteger();
			}

			int[] copyIntArray = intArray;	//copy of integer array

			//insertion sort time
			long time1 = System.currentTimeMillis();
			copyIntArray = insertionSortDescending(intArray);
			long time2 = System.currentTimeMillis();
			System.out.println("Time taken for insertion sort: " +  (((double)time2 - time1) / 1000) + "second.");
			for(int i : intArray) {
				System.out.print(i + " ");
			}
			System.out.println();


			//bubble sort time
			time1 = System.currentTimeMillis();
			copyIntArray = bubbleSortDescending(intArray);
			time2 = System.currentTimeMillis();
			System.out.println("Time taken for bubble sort: " +  (((double)time2 - time1) / 1000) + "second.");
			for(int i : copyIntArray) {
				System.out.print(i + " ");
			}
			System.out.println();

			intArray = copyIntArray;

			//binary search time
			System.out.print("Enter number to search:");
			int intSearch =  Utility.inputInteger();
			time1 = System.currentTimeMillis();
			if(binarySearch(intSearch , intArray) > -1) {
				System.out.println("Number found");
			}
			else
				System.out.println("Not found");
			time2 = System.currentTimeMillis();
			System.out.println("Time taken for binary search: " +  (((double)time2 - time1) / 1000) + "second.");


			//Strings
			System.out.print("Enter number of strings: ");
			count =  Utility.inputInteger();
			String[] stringArray = new String[count];
			System.out.print("Enter strings: ");
			for(int i = 0; i < count; i++) {
				stringArray[i] =  Utility.inputString();
			}

			String[] copyStringArray = stringArray;

			//insertion sort time
			time1 = System.currentTimeMillis();
			copyStringArray = insertionSortDescending(stringArray);
			time2 = System.currentTimeMillis();
			System.out.println("Time taken for insertion sort: " +  (((double)time2 - time1) / 1000) + "second.");
			for(String string : copyStringArray) {
				System.out.print(string + " ");
			}
			System.out.println();

			//bubble sort time
			time1 = System.currentTimeMillis();
			copyStringArray = bubbleSort(stringArray);
			time2 = System.currentTimeMillis();
			System.out.println("Time taken for bubble sort: " +  (((double)time2 - time1) / 1000) + "second.");
			for(String string : copyStringArray) {
				System.out.print(string + " ");
			}
			System.out.println();

			stringArray = copyStringArray;


			//binary search time
			System.out.print("Enter string to search:");
			String stringSearch =  Utility.inputString();
			time1 = System.currentTimeMillis();
			if(binarySearch(stringSearch , stringArray) > -1) {
				System.out.println("String found");
			}
			else
				System.out.println("Not found");
			time2 = System.currentTimeMillis();
			System.out.println("Time taken for binary search: " +  (((double)time2 - time1) / 1000) + "second.");



		}

	}


