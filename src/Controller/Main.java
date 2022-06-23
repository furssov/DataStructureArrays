package Controller;

import ArrayApp.Arrays;

public class Main {
    public static void main(String[] args) {
        Arrays arrays = new Arrays(5);
        arrays.setElement(0, 1);
        arrays.setElement(1, 1);
        arrays.setElement(2, 2);
        arrays.setElement(3, 3);
        arrays.setElement(4, 4);

        System.out.println(arrays.getElement(6));
    }
}
