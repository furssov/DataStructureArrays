package Controller;

import ArrayApp.ArrayException;
import ArrayApp.Arrays;

public class Main {
    public static void main(String[] args)  {

        Arrays arrays = new Arrays(10);


                arrays.fillRandom(30);

                 long before = System.currentTimeMillis();
            arrays.shellSort();
            long after = System.currentTimeMillis();
            System.out.println(after - before + "ms - 1");

            /*
        before = System.currentTimeMillis();
        arrays.insertionSort();
        after = System.currentTimeMillis();
        System.out.println(after - before + " - 2");
         */



    }
}
