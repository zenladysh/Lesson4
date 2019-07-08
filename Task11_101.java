package com.company;

import java.util.Arrays;

public class Task11_101 {
    public static void main(String[] args) {
        int array[] = new int[30];

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) (Math.random() * 1000 / 10);

        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array, 0, array.length);
        //System.out.println(Arrays.toString(array));

        int k = 1;
        for (int j = 1; j < array.length; j++) {
            if (array[j - 1] == array[j]) {
                k++;

            }
        }
        if (k < 2) {
            System.out.println("В массиве нету одинаковых элементов");
        } else if (k == 2) {
            System.out.println("В массиве только два одинаковых элемента");
        } else {
            System.out.println("В массиве  больше двух одинаковых элементов");
        }
    }
}

