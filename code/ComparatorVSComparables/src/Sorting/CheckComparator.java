package Sorting;
import java.util.Comparator;

public class CheckComparator implements Comparator<Integer> {
	@Override
	public int compare(Integer i1, Integer i2) {
//		return -1; for LIFO 
		return +1; //for FIFO
	}
}
