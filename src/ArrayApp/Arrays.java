package ArrayApp;

public class Arrays {

    private int[] array;
    private int nElements;

    public Arrays(int size) {
        array = new int[size];
        nElements = 0;
    }

    public void insertElement(int value){
        array[nElements] = value;
        nElements++;
    }
}
