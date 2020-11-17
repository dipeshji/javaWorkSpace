package HashMapImplementation;
import java.util.Map;
import java.util.IdentityHashMap;
import java.util.HashMap;

public class IdentityHashMapClass {
	public static void main(String[] args) {
		System.out.println("Identity hash map");
		Map<String,String> ihm = new IdentityHashMap<>();
		Map<String, String> hm = new HashMap();
		
		ihm.put("sony", "Television");
		ihm.put(new String("sony"), "Mobile");
		
		hm.put("sony", "Television");
		hm.put(new String("sony"), "Mobile");

//		in IdentityHashMap reference(address) comparison is done for keys and values in map 
//		as "sony" and new String("sony") are two different objects
		System.out.println("Size: " + ihm.size() + " data: " + ihm);
		
//		in HashMap content comparison is done for keys and values 
//		as "sony" and new String("sony") have same name(content)
		System.out.println("Size: " + hm.size() + " data: " + hm);
		
		
	}
}
