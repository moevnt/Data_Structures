import org.omg.CORBA.Any;

import java.util.*;

public class SetExample <AnyType>{

	private Set<AnyType> treeSet;
	private Set<AnyType> hashSet;

	public SetExample(){
		treeSet = new TreeSet<>();
		hashSet = new HashSet<>();
	}

	public void add(AnyType x){

		treeSet.add(x);
		hashSet.add(x);
	}

	public void printTreeSet(){
		for(AnyType a : treeSet)
				System.out.println(a);
	}

	public void printHashSet(){
		for(AnyType a : hashSet)
			System.out.println(a);
	}

	public static void main(String[] args){
		SetExample<Integer> mySet = new SetExample<>();

		mySet.add(4);
		mySet.add(1);
		mySet.add(8);

		mySet.printTreeSet();
		System.out.println();
		mySet.printHashSet();
	}

}
