package Basics;
import java.util.ArrayList;

public class CollectionToArray {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(new Integer(10));
		al.add(new Integer(200));
		al.add(new Integer(300));
		al.add(new Integer(400));
		al.add(new Integer(600));
		
		Object[] intArray = al.toArray();
		
		for(Object val: intArray) {
			System.out.println(val);
		}
	}
}