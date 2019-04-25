public class recursPractice {

	public static int sum(int n){
		if(n==1||n==0)
			return n;
		else
			return n+sum(n-1);
	}

	public static void printNum(int n){
		if(n>=10) {
			System.out.print(n % 10 + " ");
			printNum(n / 10);
		}
		else
			System.out.print(n);
	}

	public static int fibSequence(int n){
		if(n==2 || n==1)
			return 1;

		else
			return fibSequence(n-2)+fibSequence(n-1);
	}

	public static void main(String[] args){
		//printNum(13567);
		System.out.println(fibSequence(7));
	}
}
