package String;

public class ReverseString {

	public static void main(String[] args) {
		String str1 = "I love java, the coffe";
		String str2 = "";
		
		
		String[] splitArray = str1.split(" ");
		
		for(int i = (splitArray.length - 1); i>=0; i-- ) {
			str2 += splitArray[i] + " ";
		}
		
//		System.out.println(str2);
		
		
		String s = "I love indian army 1234";
//		s = s.substring(3);
//		System.out.println(s);
//		
//		s = s.substring(2);
//		System.out.println(s);
		
		System.out.println(!(s.contains("I lov")));
		String numbers = "1234";
		if(!s.contains(numbers)) {
			System.out.println("no");
		}
		
		System.out.println(124%10);
	}
	
	
}
