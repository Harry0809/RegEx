package com.RegEx;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexPattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First name : ");
		String firstName = sc.nextLine();

		boolean validatefirstName = Pattern.matches("^[A-Z]{1}[a-z]{2,20}$", firstName);

		if (validatefirstName) {
			System.out.println("firstname is correct ");
		} else {
			System.out.println("firstname is incorrect ");
		}
	}

}
