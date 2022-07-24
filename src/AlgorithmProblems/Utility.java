package AlgorithmProblems;

import java.util.Scanner;

public class Utility {
	private Utility() {

	}

	public static Scanner sc = new Scanner(System.in);
	public static int inputInteger() {
		return sc.nextInt();
	}

	public static long inputLong() {
		return sc.nextLong();
	}

	public static boolean checkNext() {
		return sc.hasNext();
	}

	// To take Double input
	public static double inputDouble() {
		return sc.nextDouble();
	}

	// To take Float input
	public static float inputFloat() {
		return sc.nextFloat();
	}

	// To take String input
	public static String inputString() {
		return sc.next();
	}

	// To take String input
	public static String inputStringLine() {
		return sc.nextLine();
	}

}
