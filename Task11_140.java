package com.company;

import java.util.Arrays;

public class Task11_140 {
    public static void main(String[] args) {
        float array[] = new float[28];
        float array1[] = new float[28];

        for (int i = 0; i < array.length; i++) {

            array[i] = (float) (Math.random() * 10 - 10);
            array1[i] = array[i];

        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array1, 0, array.length);
        System.out.println(Arrays.toString(array1));
        System.out.println("Самые холодные дни февраля:");
        for (int j = 0; j < array.length; j++) {
            if (array[j] == array1[0]) {
                int coolDay1 = j+1;
                System.out.println(coolDay1 + "февраля;");
            }
            if (array[j] == array1[1]) {
                int coolDay2 = j+1;
                System.out.println(coolDay2 + "февраля;");
            }
        }
    }
}
