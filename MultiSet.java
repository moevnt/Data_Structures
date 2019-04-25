public interface MultiSet <AnyType> {
	void add(AnyType x);

	boolean contains(AnyType x);

	int count(AnyType x);

	boolean removeOne(AnyType x);

	boolean removeAll(AnyType x);

	void toArray(AnyType[] arr);
}
