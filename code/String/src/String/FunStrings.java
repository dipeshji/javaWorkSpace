package String;

public class FunStrings {
	public static void main(String[] args) {
		String name = new String("Dipesh"); // new string in scp and heap
		String name2 = "Sandeep"; // new string in scp but not in heap
		String name3 = "Dipesh";

		System.out.println(name == name3); // false, because name and name3 are two different objects
		System.out.println(name.equals(name3));
		String name4 = new String("Dipesh"); // new string in heap but will point to same string in scp
		String s5 = name2.intern(); // intern() stores a value in scp if not present, and if present returns the
									// value
		System.out.println(s5);

		String s1 = "abc";
		String s2 = new String("abc");
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1 == s2); // false because s1 and s2 holds two different references
		s2 = s2.intern();
		System.out.println(s1 == s2); // true because intern() return reference
	}
}
