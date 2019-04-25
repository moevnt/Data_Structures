import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {

	private TreeMap <Integer, String> map;

	public MapExample() {

		map = new TreeMap<>();
	}

	public void add(Integer x, String y) {

		map.put(x, y);
	}

	public boolean contains(Integer x) {

		return map.containsKey(x);
	}

	public String getValue(Integer x) {

		if(!map.containsKey(x))
			return null;

		return map.get(x);
	}

	public Set getKeys() {

		return map.keySet();
	}

	public String remove(Integer x) {

		if(map.containsKey(x))
			return map.remove(x);

		return null;
	}


}
