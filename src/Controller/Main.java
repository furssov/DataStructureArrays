package Controller;

import ArrayApp.ArrayException;
import ArrayApp.Arrays;

public class Main {
    public static void main(String[] args)  {

        Arrays arrays = new Arrays(100000);


                arrays.fillRandom(200000);

                 long before = System.currentTimeMillis();
            arrays.bubleSort();
            long after = System.currentTimeMillis();
            System.out.println(after - before + " - 1");

        before = System.currentTimeMillis();
        arrays.insertionSort();
        after = System.currentTimeMillis();
        System.out.println(after - before + " - 2");




    }
}
