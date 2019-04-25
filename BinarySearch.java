/*
Evan Monteith and Sullian Stern
Extra credit 1
Help recieved: NA //Evan W. Monteith
 */


public class BinarySearch {

	public static boolean binarySearch(int[] list, int key) {

		int low = 0;
		int high = list.length - 1;


			while (low <= high) {
				int mid = (low + high) / 2;

				if (key == list[mid]) {
					return true;
				}
				if (key < list[mid])
					high = mid - 1;
				else
					low = mid + 1;
			}

		return false;

	}

	public static boolean contains(int[][] m,int val){
		int N = m.length;
		boolean returnStatement = false;

		for(int r=0 ;r<N;r++) {
			returnStatement = binarySearch(m[r], val);

			if(returnStatement == true)
				return true;
		}

		return returnStatement;
	}

	public static void main(String[] args){
		int[][] m1 = {	{2,4,6,8},
						{5,7,9,10},
						{11,12,13,14},
						{14,15,16,17}};

		System.out.println(contains(m1,9));
		System.out.println(contains(m1,19));
	}

}
