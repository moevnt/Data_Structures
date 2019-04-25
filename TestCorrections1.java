/*
public class TestCorrections1 {

    public static <AnyType extends Comparable> AnyType largestElement(AnyType[] list) {

        int index = 0;
        AnyType largest = list[index];

        return largestElement(list, largest, index);
    }
    public static <AnyType extends Comparable> AnyType largestElement(AnyType[] list, AnyType largest. int index) {
        if(index >= list.length) {
            return largest;
        }
        else if(list[index].compareTo(largest) > 0) {
            return largestElement(list, list[index], index++);
        }
        else {
            return largestElement(list, largest, index++);
        }
    }
        public static void main (String[] args) {
            Integer [] list = {1, 2, 10, 12, 25, 34, 50};

            System.out.println(largestElement(list));
    }
}
*/