package String;

public class IsAnagram {
	public static void main(String[] args) {

		String str1 = "listen";
		String str2 = "silent";
		boolean isAnagram = true;

		int[] al = new int[256];
		int[] bl = new int[256];

		if (str1.length() == str2.length()) {
			for (char c : str1.toCharArray()) {
				int index = (int) c;
				al[index]++;
			}

			for (char c : str2.toCharArray()) {
				int index = (int) c;
				bl[index]++;
			}

			for (int i = 0; i < 256; i++) {
				if (al[i] != bl[i]) {
					System.out.println("given strings are not anagrams");
					isAnagram = false;
					break;
				}
			}

			if (isAnagram) {
				System.out.println("given strings are anagrams");
			}

		} else {
			System.out.println("given strings are not anagrams");
		}

	}
}
