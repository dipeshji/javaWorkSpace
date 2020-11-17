package Basics;
import java.util.List;
import java.util.ListIterator;
import java.util.Arrays;

public class ArrayToCollection {
	public static void main(String[] args) {
		String[] ar = {"Dipesh", "Mahesh", "Palak", "Mini", "Suresh"};
		
		List<String> ls = Arrays.asList(ar);
		
		ListIterator<String> lItr = ls.listIterator();
		
		while(lItr.hasNext()) {
			System.out.println(lItr.next());
		}
	}
}

