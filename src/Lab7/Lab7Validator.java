package Lab7;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab7Validator {
	
	/**
	 * Get any valid integer.
	 */
	public static int getInt(Scanner scnr, String prompt) {
		// This approach uses exception handling.
		System.out.print(prompt);
		try {
			int num = scnr.nextInt();
			scnr.nextLine();
			return num;
		} catch (InputMismatchException e) {
			System.out.println("Enter a whole number, using digits.");
			scnr.nextLine();
			return getInt(scnr, prompt);
		}
	}

	/**
	 * Get any valid double.
	 */
	public static double getDouble(Scanner scnr, String prompt) {
		// This approach use "hasNext" look ahead.
		boolean isValid = false;
		do {
			System.out.print(prompt);
			isValid = scnr.hasNextDouble();
			if (!isValid) {
				scnr.nextLine();
				System.out.println("Enter a number, in digits.");
			}
		} while (!isValid);
		
		double number = scnr.nextDouble();
		scnr.nextLine();
		return number;
	}
	
	/**
	 * Get any string.
	 */
	public static String getString(Scanner scnr, String prompt) {
		// This approach uses exception handling.
		System.out.print(prompt);
		return scnr.nextLine();
	}
	
	/**
	 * Get any valid integer between min and max.
	 */
	public static int getInt(Scanner scnr, String prompt, int min, int max) {
		boolean isValid = false;
		int number;
		do {
			number = getInt(scnr, prompt);
			
			if (number < min) {
				isValid = false;
				System.out.println("The number must be at least " + min);
			} else if (number > max) {
				isValid = false;
				System.out.println("The number must not be larger than " + max);
			} else {
				isValid = true;
			}
			
		} while (!isValid);
		return number;
	}
	
	/**
	 * Get any valid double between min and max.
	 */
	public static double getDouble(Scanner scnr, String prompt, double min, double max) {
		boolean isValid = false;
		double number;
		do {
			number = getDouble(scnr, prompt);
			
			if (number < min) {
				isValid = false;
				System.out.println("The number must be at least " + min);
			} else if (number > max) {
				isValid = false;
				System.out.println("The number must not be larger than " + max);
			} else {
				isValid = true;
			}
			
		} while (!isValid);
		return number;
	}
	
	/**
	 * Get a string of input from the user that must match the given regex.
	 */
	public static String getStringMatchingRegex(Scanner scnr, String prompt, String regex) {
		boolean isValid = false;
		String input;
		do {
			input = getString(scnr, prompt);
			
			if (input.matches(regex)) {
				isValid = true;
			} else {
				System.out.println("Input must match the appropriate format.");
				isValid = false;
			}
			
		} while (!isValid);
		return input;
	}
	
	

}