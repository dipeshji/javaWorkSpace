package Basics;
import java.util.Comparator;

public class ArrayListComparator implements Comparator<Integer>{
	public int compare(Integer obj1,Integer obj2) {
		if(obj1 > obj2) return -1;
		else if(obj1 < obj2) return +1;
		else return 0;
	}
}