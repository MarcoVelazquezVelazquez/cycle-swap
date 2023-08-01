package com.epam.rd.autotasks;

import java.util.Arrays;

class CycleSwap {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 7, 4};

/*
        System.out.println("Before the shift: " + Arrays.toString(array));
        cycleSwap(array);
        System.out.println("After the shift: " + Arrays.toString(array));

        cycleSwap(array, 3);
        System.out.println(Arrays.toString(array));
*/

        CycleSwap.cycleSwap(array);
        System.out.println(Arrays.toString(array));

        CycleSwap.cycleSwap(array, 3);
        System.out.println(Arrays.toString(array));

    }

    static void cycleSwap(int[] array) {

        if (array == null || array.length <= 1) {
            return;
        }

        // Store the last element in a temporary variable
        int temp = array[array.length - 1];

        // Shift all elements to the right by one position
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }

        // Set the first element to the last element's value
        array[0] = temp;

    }

    static void cycleSwap(int[] array, int shift) {

        int arrayCopia = array.length;

        // Handle edge cases
        if (shift == 0 || arrayCopia == 0) {
            return;
        }

        // Create a temporary array to store the elements during shifting
        int[] temp = new int[arrayCopia];

        // Perform the cyclic shift
        for (int i = 0; i < arrayCopia; i++) {
            int newPosition = (i + shift) % arrayCopia;
            temp[newPosition] = array[i];
        }

        // Copy the elements back to the original array
        System.arraycopy(temp, 0, array, 0, arrayCopia);
    }

}



