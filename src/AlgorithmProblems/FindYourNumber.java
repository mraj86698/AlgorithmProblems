package AlgorithmProblems;
/**
 * This is an Find Your Number
 * @author mraj
 *
 */
public class FindYourNumber {



	int[] numberArray;	/*array of numbers of given range*/
	int count = 0;
	int  ans;
	int number;
	double  maxCount = 0;	/*	number of times question will be asked*/

	/**
	 * takes range from user
	 */
	void start() {

		System.out.print("Enter limit N: ");
		number = Utility.inputInteger();

		numberArray = new int[number];	//	array initialisation
		//	fills the array
		for(int i = 0; i < number; i++) {
			numberArray[i] = i;
		}

		/**
		 * 	calculates maximum count of questions
		 */
		maxCount = (Math.log(number) / Math.log(2));
		System.out.println("Number of tries required to guess: " + ((int)maxCount + 1));
		binarySearch(0, number-1);
	}
	/**
	 * @param first - first element in range
	 * @param last - last element in the range
	 * asks user if the number is in given range and reduces the range
	 */
	void binarySearch(int first, int last) {
		if(count < maxCount) {
			int	middle = (first + last) / 2;
			count++;
			System.out.println("Is number between " + first  + " and " + middle + "?"+"(yes or no)");
			String temp = Utility.inputString();
			if(temp.equals("yes")) {
				change(middle+1 , last);
				binarySearch(first , middle);
			}
			else if(temp.equals("no")){
				change(first , middle);
				binarySearch(middle + 1, last);
			}
		}
		else {
			for(int i : numberArray) {
				if(i != -1) {
					System.out.println("The number is: " + i);
				}
			}
		}
	}

	/**
	 * replaces all the integer in the array to -1 as the number is not in this range
	 * @param first - first element in the range
	 * @param last - last element in the range
	 */
	void change(int first , int last) {
		for(int i = first; i <= last; i++) {
			numberArray[i] = -1;
		}
	}

	public static void main(String[] args) {
		FindYourNumber findYourNumber = new FindYourNumber();
		findYourNumber.start();
	}

}
