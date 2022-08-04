package AlgorithmProblems;

public class TaskOptimisation {

	int[] deadlineArray, timeArray;
	int count;

	void start() {
		System.out.print("Enter Number of tasks: ");
		count = Utility.inputInteger(); // number of tasks

		deadlineArray = new int[count]; // array to store deadlines
		timeArray = new int[count]; // array to store time required for each task
		/**
		 * gets tasks data
		 */
		for (int i = 0; i < count; i++) {
			System.out.print("Enter deadline and time required for the task number :" + (i + 1) + "\n");
			deadlineArray[i] = Utility.inputInteger();
			timeArray[i] = Utility.inputInteger();
		}
		/**
		 * orders tasks in ascending order of deadline
		 */
		insertionSortAsc();

		// prints the tasks
		for (int i = 0; i < count; i++) {
			System.out.print("Deadline and Time required for the task number :" + (i + 1) + " ");
			System.out.print("DeadLine:"+deadlineArray[i] + "\t");
			System.out.print("CompletionTime:"+timeArray[i]+"minutes");
			System.out.println();
		}

		doTask();
	}
	/**
	 * orders tasks in ascending order of deadline
	 */
	void insertionSortAsc() {
		for (int i = 1; i < deadlineArray.length; i++) {
			int deadlineKey = deadlineArray[i];
			int timeKey = timeArray[i];
			int j = i - 1;
			while ((j > -1) && (deadlineArray[j] > deadlineKey)) {
				deadlineArray[j + 1] = deadlineArray[j];
				timeArray[j + 1] = timeArray[j];
				j--;
			}
			deadlineArray[j + 1] = deadlineKey;
			timeArray[j + 1] = timeKey;
		}
	}

	/**
	 * prints tasks
	 */
	void doTask() {
		for (int i = 0; i < count; i++) {
			System.out.println("Task:" + (i + 1)+"" +"CompletionTime:"  + timeArray[i]+"minutes");
		}
	}

	public static void main(String[] args) {
		TaskOptimisation optimisation = new TaskOptimisation();
		optimisation.start();

	}

}
