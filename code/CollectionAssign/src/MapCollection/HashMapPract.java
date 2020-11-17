package MapCollection;

import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

public class HashMapPract {
	public static void  main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("key1", 1);
		hm.put("key2", 2);
		hm.put("key3", 3);
		hm.put("key4", 4);
	
		hm.put("key5", 5);
		hm.put("key6", 6);
		hm.put("key7", 7);
		hm.put("key8", 8);
		

		
		System.out.println(hm.remove("key1"));
		
		
		Set set = hm.entrySet();
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<String, Integer> menEn = (Map.Entry<String, Integer>) itr.next();
			System.out.println(menEn.getKey() + ":" + menEn.getValue());
		}
		
	}
}
