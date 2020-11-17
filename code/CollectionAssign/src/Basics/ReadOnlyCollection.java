package Basics;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

public class ReadOnlyCollection {
	public static void main(String[] args){
		List<String> ls = new ArrayList<>();
		ls.add("India");
		ls.add("United States");
		ls.add("Russia");
		ls.add("Izrael");
		
		ls = Collections.unmodifiableList(ls);
		
		try {
			ls.set(1, "United Nations");
		}catch (UnsupportedOperationException e) {
			System.out.println(e);
		}
		
//		=====set=============
		
		Set<String> s = new TreeSet<>(ls);
		
		s = Collections.unmodifiableSet(s);
		
		try{
			s.add("United Emirate");
		}catch (UnsupportedOperationException e) {
			System.out.println(e);
		}
		
//		=========map===================
		Map<String,String> m = new HashMap<>();
		m = Collections.unmodifiableMap(m);
	}
}
