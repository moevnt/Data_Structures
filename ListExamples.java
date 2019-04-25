
import com.sun.xml.internal.bind.AnyTypeAdapter;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListExamples<AnyType> {

	private ArrayList<AnyType> arrayList;
	private LinkedList<AnyType> linkedList;


	public ListExamples (){
		arrayList = new ArrayList<>();
		linkedList = new LinkedList<>();
	}

	public void addValues (AnyType x){
		arrayList.add(x);
		//arrayList.
	}
}
