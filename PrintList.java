

public abstract class PrintList implements Comparable{

	public static <Anytype> void print(Anytype[] list){
		for(int i=0;i<list.length;i++){
			System.out.println(list[i]+" ");
		}
	}

	public static <Anytype> Anytype findLarge(Anytype[] list){
		int count =0;
		Anytype large = list[0];

		return findLarge(list, count, large);
	}
	private static <Anytype> Anytype findLarge(Anytype[] list,int count, Anytype large){
		if( count>= list.length)
			return large;
		//else if (large.compareTo(list[count])==)
			return null;
	}



	public static void main (String[] args){
		Integer [] list = {2,4,7,10,11,45,50};
		String[] list1 = {"Andrew","boyd","charlie","donald","Evan"};
		Character[] list2 = {'A','B','C','D','E'};

		print(list);
		print(list1);
		print(list2);
	}
}
