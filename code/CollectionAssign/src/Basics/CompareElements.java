package Basics;
import java.util.ArrayList;
import java.util.Objects;

public class CompareElements {
	public static void main(String[] args) {
		
		ArrayList ts = new ArrayList();
		
		
		ts.add("Dipesh");
		ts.add("Ajay");
		ts.add("Mahesh");
		ts.add("Palak");
		ts.add("Mini");
		
		for(int i=0; i < ts.size() - 1 ;i++) {
			for(int j = i+1; j < ts.size(); i++) {
				if(Objects.equals(ts.get(i), ts.get(j))) System.out.println(ts.get(i) + " is greater than " + ts.get(j));
				else System.out.println(ts.get(i) + " is less than " + ts.get(j));
			}
		}
	}
}
