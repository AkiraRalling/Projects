package JavaHard.Collections.OthersClasses;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class ArraysOne {

    public static void main(String[] args) {

        int[] myArray = new int[5];
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(500);
            System.out.println(myArray[i]);
        }

        copyArray(myArray);

        for (int j = 0; j < myArray.length; j++) {
            System.out.println("Index is #" + j + ", and value is " + myArray[j]);
        }

        copyArray(myArray);
    }

    public static int[] copyArray(int[] array) {
        /**
         *  It's example to "How copy value in new array"
         // int[] newArray = Arrays.copyOf(array, array.length);
         */
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int tmp;
                if (array[i] < array[j]) {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }
}
