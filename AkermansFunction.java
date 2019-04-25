public class AkermansFunction {

	public static int AkermansFunction(int m, int n){

		if(m==0)
			return n+1;
		else if(m>0 && n==0)
			return AkermansFunction(m-1,1);
		else if(m>0 && n>0)
			return AkermansFunction(m-1,AkermansFunction(m,n-1));
		else
			return  -1;
	}



	public static void main(String[] args){
		System.out.println(AkermansFunction(3,2));
	}
}
