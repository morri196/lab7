package Lab7;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab7Validator {
	
	
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
	
	public static String getString(Scanner scnr, String prompt) {
		// This approach uses exception handling.
		System.out.print(prompt);
		return scnr.nextLine();
	}
	
	
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
