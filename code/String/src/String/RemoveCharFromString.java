package String;

import java.util.Scanner;

public class RemoveCharFromString {
	public static void main(String[] args) {
//		StringBuilder string = new StringBuilder();
//		char c;
//
//		Scanner scan = new Scanner(System.in);
//
//		System.out.println("Enter your string");
//		string.append(scan.nextLine());
//
//		System.out.println("enter char to remove from string " + "'" + string + "'");
//		c = scan.next().charAt(0);
//
//		for (char i = 0; i < string.length(); i++) {
//			if (string.charAt(i) == c) {
//				string.deleteCharAt(i);
//			} else
//				continue;
//		}

		String string;
		String modifiedString = new String();
		char c;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your string");
		string = scan.nextLine();

		System.out.println("enter char to remove from string " + "'" + string + "'");
		c = scan.next().charAt(0);

//		for (char i = 0; i < string.length(); i++) {
//			if (string.charAt(i) == c) {
//				continue;
//			} else {
//				modifiedString += string.charAt(i);
//			}
//		}
		string = string.replace(Character.toString(c), "");
		System.out.println(string);

//		if (string.equals(modifiedString)) {
//			System.out.println("no character " + c + " found in string " + string);
//		} else
//			System.out.println("new string " + modifiedString);

	}
}
