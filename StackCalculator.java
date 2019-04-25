import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class StackCalculator {
	private static LinkedList<Double> stack = new LinkedList<Double>();

	public StackCalculator(){
		stack = new LinkedList<>();
	}

	public static void push(Double x){
		stack.push(x);
	}

	public static Double pop(){
		if(stack.isEmpty())
			return null;

		return stack.pop();
	}

	public static Double add(){
		if(stack.isEmpty())
			return null;
		Double a = pop();

		if(stack.isEmpty())
			return null;
		Double b = pop();

		push(a+b);

		return a+b;
	}

	public static Double subtract(){
		if(stack.isEmpty())
			return null;
		Double a = pop();

		if(stack.isEmpty())
			return null;
		Double b = pop();

		push(a-b);

		return a-b;
	}

	public static Double multiply(){
		if(stack.isEmpty())
			return null;
		Double a = pop();

		if(stack.isEmpty())
			return null;
		Double b = pop();

		push(a*b);

		return a*b;
	}

	public static Double divide(){
		if(stack.isEmpty())
			return null;
		Double a = pop();

		if(stack.isEmpty())
			return null;
		Double b = pop();

		push(a/b);

		return a/b;
	}

	public static Double sqrt(){
		if(stack.isEmpty())
			return null;

		return Math.sqrt(pop());
	}

	public static Double pow(){
		if(stack.isEmpty())
			return null;
		Double a = pop();

		if(stack.isEmpty())
			return null;
		Double b = pop();

		push(Math.pow(a,b));

		return Math.pow(a,b);
	}

	public static void clear(){
		while(!stack.isEmpty()){
			pop();
		}
	}

	public static Integer size(){
		int i=0;
		while(!stack.isEmpty())
			i++;
		return i;
	}

	public static Double[] getValues(){
		Double[] arr = new Double[size()];

		for(int i=0;i<size();i++){
			Double temp = pop();
			arr[i] = temp;
			push(temp);
		}

		return arr;
	}

//	public static void main(String[] args){
//		Scanner scan = new Scanner(System.in);
//
//
//		System.out.println("What would you like to do?");
//		System.out.println("1. Pop");
//		System.out.println("2. Add");
//		System.out.println("3. Sub");
//		System.out.println("4. Multiply");
//		System.out.println("5. Divide");
//		System.out.println("6. Square Root");
//		System.out.println("7. Pow");
//		System.out.println("8. Clear");
//		System.out.println("9. Get Values");
//
//		int input = scan.nextInt();
//
//		if(input == 1) {
//			pop(stack);
//		}
//		else if(input == 2) {
//			add(stack);
//		}
//		else if(input == 2) {
//			subtract(stack);
//		}
//		else if(input == 2) {
//			multiply(stack);
//		}
//		else if(input == 2) {
//			divide(stack);
//		}
//		else if(input == 2) {
//			sqrt(stack);
//		}
//		else if(input == 2) {
//			pow(stack);
//		}
//		else if(input == 2) {
//			clear(stack);
//		}
//		else if(input == 2) {
//			getValues(stack);
//		}
//		else {
//			System.out.println("Wrong");
//		}


}
