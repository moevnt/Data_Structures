public class MaxAndMin {

	public static double[] findMaxAndMin(double[] arr){
		int left=0;
		double[] maxMin={arr[0],arr[0]};//max,min

		return findMaxAndMin(arr,maxMin,left);
	}

	public static double[] findMaxAndMin(double[] arr,double[] maxMin,int left){
		if(left==arr.length)
			return maxMin;

		if(arr[left]>maxMin[0])
			maxMin[0]=arr[left];

		if(arr[left]<maxMin[1])
			maxMin[1]=arr[left];

		return findMaxAndMin(arr, maxMin, left+1);

	}

	public static double[] findMaxAndMin2(double[] arr){
		int left=0;
		int right=arr.length-1;
		double[] maxMin = {arr[0],arr[0]};

		return findMaxAndMin2(arr,maxMin,left,right);
	}

	private static double[] findMaxAndMin2(double[] arr, double[] maxMin,int left,int right){
		if(left==right) {

			if (arr[left] > maxMin[0])
				maxMin[0] = arr[left];

			if (arr[left] < maxMin[1])
				maxMin[1] = arr[left];
			return maxMin;
		}
		int center = (left+right)/2;
		findMaxAndMin2(arr,maxMin,left,center);
		return findMaxAndMin2(arr,maxMin,center+1,right);
	}

	public static void main(String [] args){
		double[] list={3,1,4,9,6,11,8,7,5,10};

		double[] result= findMaxAndMin2(list);

		System.out.println("min= "+result[1]);
		System.out.println("max= "+result[0]);
	}
}
