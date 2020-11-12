package base;


import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        int[] array = {-23, 4, -5, 99, -27, 329, -2, 7, -921};
        System.out.println(adjacentElementsProduct(array));

    }

    //TODO, Given an array of integers , Find the maximum product obtained from multiplying 2 adjacent numbers in the array.
    //TODO, Maximum Product 7kyu

    static int adjacentElementsProduct(int[] array) {
        int a = array[0];
        int b = array[1];

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] * array[i + 1] > a * b) {
                a = array[i];
                b = array[i + 1];
            }
        }

        return a * b;
    }


}


