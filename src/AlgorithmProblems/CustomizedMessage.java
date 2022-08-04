package AlgorithmProblems;
/**
 * This is an Customize Message Demonstration using String Function and RegEx
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomizedMessage {

	public static void main(String[] args) {
		/**
		 * Replace <<name>> by first name of the user
		 * replace <<full name>> by user full name.
		 * replace any occurance of mobile number that should be in format xxxxxxxxxx by your contact number.
		 */
		System.out.println("Hello Mohan, We've your Full Name as Mohan Raj in our System."
				+ "Your Contact Number is 91-6374930453. "
				+ "Please, let us know in case of any clarification Thank you BridgeLabz 03/08/2022. ");

		System.out.println();
		System.out.println("Enter First Name");
		String fname = Utility.inputString();
		System.out.println("Enter Last Name: ");
		String lname = Utility.inputString();
		System.out.println("Enter Your Phone Number");
		String number = Utility.inputString();
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());

		check(fname, lname, number, date);
	}

	private static void check(String fname, String lname, String num, String date) {
		if ((fname != null && lname != null) && (fname.matches("^[a-zA-Z]*$") && lname.matches("^[a-zA-Z]*$"))) {
			System.out
					.println("Hello " + fname + ", We've your Full Name as " + fname + " " + lname + " in our System.");

		}
		if (num.matches("\\d{10}")) {
			System.out.println("Your Contact Number is " + num + "\n");
		}

		System.out.println("Please, let us know in case of any clarification Thank you BridgeLabz" + date);

	}

}
