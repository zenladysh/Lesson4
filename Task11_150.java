package com.company;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.Scanner;

public class Task11_150 {
    public static void main(String[] args) {
        float array[] = new float[20];
        float array1[] = new float[array.length - 1];
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер товара");
        int numN = in.nextInt();
        int j = 0;
        for (int i = 0; i < array.length; i++) {

            array[i] = (float) (Math.random() * 100);

            if (i == numN)

                continue;
            array1[j] = array[i];
            j++;

        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array1));

    }
}
