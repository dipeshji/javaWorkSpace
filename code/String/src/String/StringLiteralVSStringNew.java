package String;

public class StringLiteralVSStringNew {
	public static void main(String[] args) {
		String name = "Dipesh";
		String name2 =new String("Dipesh");
		
		System.out.println(name == name2); //false
		
		String name3 = "Dipesh";
		System.out.println(name == name3); //true
		
		String name4 = new String("Dipesh");
		
		System.out.println(name2 == name4); //false
		
		System.out.println(name2.equals(name4)); //true
		
		String str5 = "dipesh";
		
		System.out.println(str5.substring(0,1).toUpperCase() + str5.substring(1)); //Capitalize first letter of string
		System.out.println("Hello".toUpperCase().equals("HELLO"));
		String strr = "He is a very very good boy, isn't he?";
		String[] splitString = strr.split("[A-Za-z !,?._'@]+,");
		for(String str: splitString) {
			System.out.println(str);
		}
//	================StringBuffer===========================	
		
		StringBuffer strB = new StringBuffer("Sardar patel inte");
		System.out.println(strB.capacity() + " " + strB.length());
		
		strB.append("rational school");
		System.out.println(strB.capacity() + " " + strB.length());
		
		strB.ensureCapacity(67);
		System.out.println(strB.capacity() + " " + strB.length());
		strB.insert(32," Mandleshwar");
		System.out.println(strB);
		
		System.out.println(strB.reverse());
		
//		================stringBuilder======================
		StringBuilder stB = new StringBuilder("AsG");
		
		System.out.println();
		
	}
}