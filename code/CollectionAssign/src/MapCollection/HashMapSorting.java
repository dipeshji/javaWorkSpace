package MapCollection;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;


public class HashMapSorting {
	public static void main(String[] args) {
		HashMap<String,Integer> hm = new HashMap<>();
		hm.put("key1", 8);
		hm.put("key2", 7);
		hm.put("key3", 6);
		hm.put("key4", 5);
	
		hm.put("key5", 4);
		hm.put("key6", 3);
		hm.put("key7", 2);
		hm.put("key8", 1);
		
		Set set = hm.entrySet();
		Iterator itr = set.iterator();
		System.out.println("Before sorting");
		
		while(itr.hasNext()) {
			Map.Entry me = (Map.Entry)itr.next();
			System.out.println(me.getKey() + ":" + me.getValue());
		}
		
//		System.out.println("After sorting base on key");
//		
//		 Map<String,Integer> tm = new TreeMap<>(hm);
//		 Set tSet = tm.entrySet();
//		 Iterator tItr = tSet.iterator();
//		 
//		 while(tItr.hasNext()) {
//			 Map.Entry<String, Integer> me2 = (Map.Entry<String, Integer>)tItr.next();
//			 System.out.println(me2.getKey() + ":" + me2.getValue());
//		 }
		
		System.out.println("Based on value");
		
		Map map = sortByValues(hm);
		
		Set set2 = map.entrySet();
		
		Iterator itr2 = set2.iterator();
		
		 while(itr2.hasNext()) {
	           Map.Entry me2 = (Map.Entry)itr2.next();
	           System.out.print(me2.getKey() + ": ");
	           System.out.println(me2.getValue());
	      }
		
		
		
	}
	
	private static HashMap sortByValues(HashMap map) {
		 List list = new LinkedList(map.entrySet());
	       // Defined Custom Comparator here
	       Collections.sort(list, new Comparator() {
	            public int compare(Object o1, Object o2) {
	               return ((Comparable) ((Map.Entry) (o1)).getValue())
	                  .compareTo(((Map.Entry) (o2)).getValue());
	            }
	       });
	       
	       HashMap sortedHashMap = new LinkedHashMap<String, Integer>();
	       for(Iterator it = list.iterator(); it.hasNext();) {
	    	   Map.Entry<String, Integer> entery = (Map.Entry<String, Integer>) it.next();
	    	   sortedHashMap.put(entery.getKey(),entery.getValue());
	       }
	       
	       return sortedHashMap;
	}
}
