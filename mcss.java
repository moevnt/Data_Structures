public class mcss {

	public static int max(int[] list){

		int globalMax=0;
		int n=list.length;
		for(int i=0; i< n;i++){
			int thisSum=0;
			for(int j=i; j<n;j++){
				thisSum+=list[j];

				if(thisSum>globalMax)
					globalMax=thisSum;
			}
		}
		return globalMax;
	}

	public static void main(String[] args){

	}
}
