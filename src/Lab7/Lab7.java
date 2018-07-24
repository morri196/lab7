package Lab7;

import java.util.Scanner;

public class Lab7 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		
		String name = Lab7Validator.getStringMatchingRegex(scnr, "Enter first name: ", "[A-Z][a-z]{1,29}");
		String email = Lab7Validator.getStringMatchingRegex(scnr, "Enter a valid email: (ex. morri192@gmail.com)" , "[A-Za-z0-9]{5,30}]@[A-Za-z0-9]{5,10}.[A-Za-z0-9]{2,3}");
		String phoneNum = Lab7Validator.getStringMatchingRegex(scnr, "Enter a valid phone number: ", "^\\d{3}-\\d{3}-\\d{4}$");
		String date = Lab7Validator.getStringMatchingRegex(scnr, "Enter a Date: (ex. dd-mm-yyyy)", "\\d{2}-\\d{2}-\\d{4}");
		
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Phone Number: " + phoneNum);
		System.out.println("Date:  " + date);
		
		scnr.close();
		
	}
}
