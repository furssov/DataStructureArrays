package ArrayApp;

public class Arrays {

    private int[] array;
    private int nElements;

    public Arrays(int size) {
        array = new int[size];
        nElements = 0;
    }

    public void addElement(int value) throws ArrayException {
        if (nElements < array.length ) {
            array[nElements] = value;
            nElements++;
        }
        else throw new ArrayException("no more memory");
    }

    public void insertElement(int value, int position) throws ArrayException {
        if (checkRange(position) && nElements < array.length)
        {
            int a;
            for (int i = position; i < nElements - 2; i++)
            {
                a = array[i + 1];
                array[i+1] = array[i];
                array[i + 2] = a;
            }
            array[position] = value;
            nElements++;
        }
        else throw new ArrayException("no more memory is free");

    }

    public void deleteFirstMatchedElement(int element)
    {
        if (findElement(element))
        {
            for (int i = getElementId(element); i < nElements - 1; i++)
            {
                array[i] = array[i + 1];
            }
            nElements--;
        }
    }

    //NOT COMPLETED METHOD
    public void deleteAllMatchedElements(int element)
    {

    }

    public void deleteAllElements()
    {
        array = null;
        nElements--;
    }

    public boolean findElement(int searchKey) {
        for (int i = 0; i < nElements; i++)
        {
            if (array[i] == searchKey)
            {
                return true;
            }
        }
        return false;
    }

    public int getElementId(int searchKey) {
        if (findElement(searchKey))
        {
            for (int i = 0; i < nElements; i++)
            {
                if (array[i] == searchKey)
                {
                    return i;
                }
            }

        }
            return -1;
    }
     public int getElementByIndex(int index) throws ArrayException {
         if (checkRange(index))
         {
             return array[index];
         }
         else throw new ArrayException("no such id");
     }
    public void arrayOutput() throws ArrayException
    {
        if (array!=null) {
            for (int i = 0; i < nElements; i++) {
                System.out.print(array[i] + " ");
            }
        }
        else throw new ArrayException(new NullPointerException("array is null"));
    }

    public int getSize()
    {
        return nElements;
    }

    private boolean checkRange(int index)
    {
        if (index >= nElements)
        {
            return false;
        }
        else {
            return true;
        }
        }
    }
