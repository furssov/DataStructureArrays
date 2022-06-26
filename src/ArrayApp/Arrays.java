package ArrayApp;

public class Arrays {

    private int[] array;
    private int nElements;

    private int size;

    public Arrays(int size) {
        array = new int[size];
        nElements = 0;
        this.size = size;
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


    public void deleteAllMatchedElements(int element)
    {
              int count = 0;
              for (int i = 0; i < nElements; i++) {
                  if (array[i] == element) {
                      count++;
                  }
              }

              while (count != 0) {
                    deleteFirstMatchedElement(element);
                  count--;
              }
    }

    public void deleteAllElements()
    {
        array = new int[size];
        nElements = 0;

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

     public void fillRandom(int maxElement)
     {
         for (int i = 0; i < size; i++)
         {
             array[i] = (int)(Math.random() * maxElement + 1);
             nElements++;
         }
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

    public void bubleSort() {
           boolean isSorted = false;
           int a;

           while (!isSorted)
           {
               isSorted = true;
               for (int i = 0 ; i < nElements - 1; i++)
               {
                   if (array[i] > array[i+1])
                   {
                       isSorted = false;
                       swap(i, i + 1);
                   }
               }
           }
    }

    public void selectionSort(){
        int min;
        for (int out = 0; out < nElements - 1; out++)
        {
            min = out;
            for (int in = out + 1; in < nElements; in++)
            {
                if (array[min] > array[in])
                {
                    min = in;

                }
            }
            swap(out, min);
        }
    }

    public void insertionSort()
    {
        int in;
        for (int out = 1; out < nElements; out++)
        {
            int buf = array[out];
            in = out;
            while (in > 0 && array[in - 1] >= buf)
            {
                array[in] = array[in - 1];
                --in;
            }
            array[in] = buf;
        }
    }

    private void swap(int firstPos, int secondPos)
    {
        int a = array[firstPos];
        array[firstPos] = array[secondPos];
        array[secondPos] = a;
    }

    //this method returns index if element was found in array and -1 if it's wrong
    public int binarySearch(int searchKey)
    {
        int lowerBound = 0;
        int upperBound = nElements - 1;
        int currentPosition;

        while (true)
        {
            currentPosition = (lowerBound + upperBound) / 2;
            if (array[currentPosition] == searchKey)
            {
                return searchKey;
            }
            else if(lowerBound > upperBound)
            {
                return -1;
            }
            else
            {
                if (searchKey > array[currentPosition])
                {
                    lowerBound = currentPosition + 1;
                }
                if (searchKey < array[currentPosition])
                {
                    upperBound = currentPosition - 1;
                }
            }
        }

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
