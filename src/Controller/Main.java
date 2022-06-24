package Controller;

import ArrayApp.ArrayException;
import ArrayApp.Arrays;

public class Main {
    public static void main(String[] args)  {
        Arrays arrays = new Arrays(4);
        try {

            arrays.addElement(3);
            arrays.addElement(4);
            arrays.addElement(4);
            arrays.addElement(5);

            arrays.deleteAllElements();

            arrays.arrayOutput();
        }
        catch (ArrayException a)
        {
            System.out.println(a.getMessage());
        }
    }
}
