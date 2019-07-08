package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Task11_53 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число элементов массива");
        int lenghtArray = in.nextInt();

        int array[] = new int[lenghtArray];

        for (int i = 0; i < lenghtArray; i++) {

            array[i] = (int) (Math.random() * 1000 / 10);

        }

        String intStringArray = Arrays.toString(array);
        System.out.println(intStringArray);
        int k = 1;
        while (k != 0) {
            System.out.println("Выберите вариант задачи (a,b,c):");
            System.out.println("Для выхода введите 0");
            String varEx = in.next();


            switch (varEx) {
                case "a":
                    int arrayA[] = new int[lenghtArray];
                    for (int j = 0; j < lenghtArray; j++) {
                        arrayA[j] = array[j];
                        if (arrayA[j] % 10 == 0) {
                            arrayA[j] = 0;
                        } else {
                            continue;
                        }
                    }
                    String intStringArrayA = Arrays.toString(arrayA);
                    System.out.println(intStringArrayA);
                    break;
                case "b":
                    int arrayB[] = new int[lenghtArray];
                    for (int l = 0; l < lenghtArray; l++) {
                        arrayB[l] = array[l];
                        if (arrayB[l] % 2 == 0) {
                            arrayB[l] /= 2;
                        } else {
                            arrayB[l] *= 2;
                        }
                    }
                    String intStringArrayB = Arrays.toString(arrayB);
                    System.out.println(intStringArrayB);
                    break;
                case "c":
                    int arrayC[] = new int[lenghtArray];
                    System.out.println("Введите m");
                    int varM = in.nextInt();
                    System.out.println("Введите n");
                    int varN = in.nextInt();
                    for (int s = 0; s < lenghtArray; s++) {
                        arrayC[s] = array[s];
                        if (s % 2 != 0) {
                            arrayC[s] += varN;
                        }
                        if (arrayC[s] % 2 != 0) {
                            arrayC[s] -= varM;
                        }


                    }
                    String intStringArrayC = Arrays.toString(arrayC);
                    System.out.println(intStringArrayC);
                    break;
                case "0":
                    k = 0;
                    break;
            }
        }
    }
}
