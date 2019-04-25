import java.util.Map;
import java.util.TreeMap;
public class TreeMultiSet <AnyType> { //implements MultiSet<AnyType> {

	private Map<AnyType, Integer> multiSet;

	public TreeMultiSet() {
		multiSet = new TreeMap<>();
	}

	public boolean contains(AnyType x) {

		return multiSet.containsKey(x);

	}

	public int count(AnyType x) {

		if(contains(x))
			return multiSet.get(x);

		return 0;
	}

	public void add(AnyType x) {

		if(contains(x))
			multiSet.replace(x, multiSet.get(x) + 1);
		else
			multiSet.put(x, 1);
	}

	public boolean removeOne(AnyType x) {


		return false;
	}

	public boolean removeAll(AnyType x) {

		// fill in the code
		return false;
	}

	public static void main(String [] args) {

		// fill in the code

	}

}

