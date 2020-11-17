package HashMapImplementation;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class PraHashMap {
	public static void main(String[] args) {
		
//		generic map
		Map<String,String> map1 = new HashMap<>();
		
		map1.put("key_1","element_1");
		map1.put("key_2", "element_2");
		
//		inserting null as key and also as value
		Map map2 = new HashMap();
		map2.put(null, "null value for null key");
		map2.put("D", null);
		
		System.out.println(map2.get(null));
		System.out.println(map2.get("D"));
		
//		Inserting all elements from another map
		Map<String,String> map3 = new HashMap<>();
		map3.putAll(map1);
		System.out.println(map3);
		map3.put("key_3", null);
		System.out.println("map3===========================================");
		System.out.println(map3);
		
		String element = (String) map3.get("key_1"); //get method returns a java object so we need to typcast
		System.out.println(element);
//		getOrDefault() value
		String defaultValue = map3.getOrDefault("key_3", "Default Value");
		System.out.println(defaultValue);
		
//		check if map containes key
		boolean hashKey = map3.containsKey("123");
		System.out.println(hashKey); //false 
		
		boolean hashKey2 = map3.containsKey("key_2");
		System.out.println(hashKey2); //true
		
//		checking if map contains value
		boolean hashValue = map3.containsValue("123");
		System.out.println(hashValue); //false
		
		boolean hashValue2 = map3.containsValue("element_1");
		System.out.println(hashValue2); //true
		
//		Iterating over map using key Iterator
		Iterator<String> iterator = map3.keySet().iterator();
		
		System.out.println("Iterating over map3 using key Iterator");
		
		while(iterator.hasNext()) {
			Object key = iterator.next();
			Object value = map3.get(key);
			System.out.println(value);
		}
		
//		iterating over map using forEach loop
		System.out.println("Iterating over map3 using forEach loop");
		for(String key: map3.keySet())// String key can be replaced by Object key if map is not generic type
		{
			Object value = map3.get(key);
			System.out.println(value);
		}
		
//		iterating over map using java stream
		System.out.println("Iterating over map3 using java stream");
		
		Stream<String> stream = map3.keySet().stream(); 
		
		stream.forEach((value) -> {
			System.out.println(value);
		});
		
//		iterating over entries using Entry iterator
		
		System.out.println("Iterating over entries using Entry iterator");
		Set<Map.Entry<String,String>> entries = map3.entrySet();
		
		Iterator <Map.Entry<String, String>> iterator1 = entries.iterator();
		
		while(iterator1.hasNext()) {
			Map.Entry<String, String> entry = iterator1.next();
			System.out.println(entry);
		}
		
//		iterating over entries using forEach loop
		
		System.out.println("iteration over entries using forEach loop");
		for(Map.Entry<String, String> entry: map3.entrySet()) {
			System.out.println(entry);
		}
		
//		Compute()
		
		map3.compute("key_3", (key,value) -> value == null ? "element_3" : value.toString().toUpperCase());
		map3.compute("key_2", (key,value) -> value == null ? null : value.toString().toUpperCase());
		
		System.out.println(map3);
	}
}
