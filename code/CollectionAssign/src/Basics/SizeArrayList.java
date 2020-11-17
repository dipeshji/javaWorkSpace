package Basics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;;

public class SizeArrayList {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int size = input.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		ArrayList<Integer> length = new ArrayList<Integer>(); 
		int j = 0;
		while(j<=size-1) {
			System.out.println("Insert number of value's in rows");
			int vr = input.nextInt();
			length.add(vr);
			int i=0;
			while(vr>i) {
				System.out.println("Insert row value");
				int val = input.nextInt();
				al.add(val);
				i++;
			}
			j++;
		}
		
		System.out.println(al);
		System.out.println(length);
		System.out.println("Enter number of rows");
		int posSize = input.nextInt();
		ArrayList<Integer> pos = new ArrayList<Integer>(posSize);
		while(pos.size()<=(posSize*2)-1) {
			if(pos.size()%2==0) {
				System.out.println("Insert x");
				int val = input.nextInt();
				pos.add(val);
			}else {
				System.out.println("Insert y");
				int val = input.nextInt();
				pos.add(val);
			}
		}
		System.out.println(pos);
		
		Iterator posItr = pos.iterator();
		int getVal = 0;
		while(posItr.hasNext()) {
			int row = pos.get(getVal);
			int index = pos.get(getVal+1);
			getVal+=2;
		}
	}
}
