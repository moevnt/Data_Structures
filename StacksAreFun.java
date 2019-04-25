import java.util.Stack;

public class StacksAreFun <AnyType extends Comparable>{
	private Stack<AnyType> items;
	private Stack <AnyType> mins;

	public StacksAreFun(){
	//  {4,2,6,8,1,9};
		items= new Stack<>();
		mins = new Stack<>();
	}

	public void push(AnyType x){
		items.push(x);

		if(mins.isEmpty() || x.compareTo(mins.peek())==-1)
			mins.push(x);
	}

	public AnyType pop(){
		if(!items.isEmpty()) {
			if (mins.peek().compareTo(items.peek()) == 0) {
				mins.pop();
			}
			return items.pop();
		}
		return null;
	}

	public void print(){
		System.out.println("Items");
		for(AnyType a : items)
			System.out.println(a);

		System.out.println("Mins");
		for(AnyType a : mins)
			System.out.println(a);
	}

	public AnyType findMin(){
		if(!mins.isEmpty())
			return mins.peek();

		return null;
	}

	public static void main (String[] args){
		StacksAreFun<Integer> stack = new StacksAreFun<>();

		stack.push(6);
		stack.push(5);
		stack.push(8);
		stack.push(1);

		stack.print();
	}
}
