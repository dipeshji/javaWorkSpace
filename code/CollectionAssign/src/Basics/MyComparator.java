package Basics;
import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {
	public int compare(Integer obj1,Integer obj2) {
		
//		===========Descending order================
		/*
		 * -ve value means inserting element(obj1) will be placed before already present element(obj2)
		 * +ve value means inserting element(obj1) will be placed after already present element(obj2)
		 * 0(Zero) means both objects are equal
		*/
		
//		if(obj1>obj2) return -1;
//		else if(obj1<obj2) return +1;
//		else return 0; o/p=> [20,10,9,0]
		
//		============Descending order using compareTo method of comparable interface=============
		
//		return -obj1.compareTo(obj2); o/p=> [20,10,9,0]
		
//		========preserved insertion order and duplicate values in=============
		return +1; //o/p=> [10,0,20,9,9]
		
//		=======reversed insertion order and duplicate values in===========
		
//		return -1;
		
//		=======only one value in=====================
//		return 0;
	}
}
