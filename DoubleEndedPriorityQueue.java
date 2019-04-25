public class DoubleEndedPriorityQueue <AnyType extends Comparable> {

	private AnyType[] queue;
	private int currentSize;
	private final static int QUEUE_CAPACITY = 10;

	public DoubleEndedPriorityQueue() {

		queue = (AnyType[]) new Object[QUEUE_CAPACITY];
		currentSize = 0;
	}


	public void insert(AnyType x) {

		if (currentSize < QUEUE_CAPACITY)
			queue[currentSize++]= x;
	}



	public int findMin(){
		int placement =0;

		for(int i=0;i<QUEUE_CAPACITY;i++){
			if(queue[placement].compareTo(queue[i])==-1)
				placement = i;
		}
		return placement;
	}

	public void deleteMin(){
		int min = findMin();

		for(int i=min;i<QUEUE_CAPACITY;i++){
			queue[i+1] = queue[i];
		}
	}

	public void deleteMax(){
		int min = findMax();

		for(int i=min;i<QUEUE_CAPACITY;i++){
			queue[i+1] = queue[i];
		}
	}

	public int findMax(){
		int placement =0;

		for(int i=0;i<QUEUE_CAPACITY;i++){
			if(queue[placement].compareTo(queue[i])==1)
				placement = i;
		}
		return placement;
	}

	public void printQueue(){
		for (int i=0;i<queue.length;i++){
			System.out.println(queue[i]);
		}
	}

	public static void main(String[] args){
		DoubleEndedPriorityQueue queue1 = new DoubleEndedPriorityQueue();

	}
}