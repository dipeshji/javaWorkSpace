package String;

import java.util.Scanner;

public class PalindromStrings {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String ent = scan.nextLine();
		Integer length = ent.length();
		boolean isPalindrom = false;
		System.out.println(length);
		int j = length - 1;
		for (int i = 0; i < length/2; i++) {
			if (ent.charAt(i) == ent.charAt(j)) {
				j--;
				isPalindrom = true;
				continue;
			} else {
				System.out.println("not palindrom");
				break;
			}
		}
		if (isPalindrom)
			System.out.println(ent + " is palindrom");
	}
}
