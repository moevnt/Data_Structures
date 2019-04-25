
import java.util.*;

public class SortedSet <AnyType extends Comparable> {

	private Integer[] set;
	private static final int size = 10;

	public SortedSet() {
		set = new Integer[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	}

	public void add(int x){

		int placement =0;

		for(int i=0;i<size;i++){
			if(set[i]<x)
				placement = i;
		}
		for(int i=placement;i>0;i--) {
			int temp = set[i-1];
			set[i-1]=set[i];
			set[i]=temp;

		}
		set[placement] = x;
	}

	public boolean isFillled(){
		for(int i=0;i<set.length;i++){
			if(set[i]==0)
				return false;
		}
		return true;
	}

	public void printSet(){
		for(int i=0;i<size;i++)
			System.out.print(set[i]+",");
	}

	public int contains(int key){

		int low = 0;
		int high = set.length - 1;


		while (low <= high) {
			int mid = (low + high) / 2;

			if (key == set[mid]) {
				return mid;
			}
			if (key < set[mid])
				high = mid - 1;
			else
				low = mid + 1;
		}

		return -1;
	}

	public static void main(String[] args){
		SortedSet set = new SortedSet();

		set.add(10);
		set.add(9);
		set.add(8);
		set.add(7);
		set.add(6);
		set.add(5);
		set.add(4);
		set.add(3);
		set.add(2);
		set.add(1);

		System.out.println(set.contains(3));

		set.printSet();
	}
}

