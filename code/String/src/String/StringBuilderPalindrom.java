package String;

import java.util.Scanner;

public class StringBuilderPalindrom {
	public static void main(String[] args) {
		StringBuilder string = new StringBuilder();
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the string");
		string.append(scan.nextLine());

		StringBuilder revString = string.reverse();

		if (string.equals(revString)) {
			System.out.println(string + " is a palindrom");
		} else {
			System.out.println(string + " is not a palindrom");
		}
	}
}
