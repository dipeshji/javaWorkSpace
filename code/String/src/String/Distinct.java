package String;

public class Distinct {
	public static void main(String[] args) {
		String s = "AAbvffdsmlkkbnnmmssAA";
		String distinct = new String();
		int[] count = new int[256];

		char[] arr = s.toCharArray();
		for (char c : arr) {
			if (distinct.indexOf(c) < 0) {
				distinct += c;
			} else {
				count[(int) c]++;
			}
		}

		System.out.println(distinct);
		for (int i = 0; i < 256; i++) {
			if (count[i] > 0) {
				System.out.println((char) i + " occurs " + (count[i] + 1) + " times");
			}
		}
	}
}
