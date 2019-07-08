package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Task12_192 {
    public static void main(String[] args) {
        int array[][] = new int[5][6];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 1000 / 10);
            }
            System.out.println(Arrays.toString(array[i]));
        }
        int k = 1;
        while (k != 0) {
            System.out.println("Выберите вариант задачи (a,b):");
            System.out.println("Для выхода введите 0");
            Scanner in = new Scanner(System.in);
            String varEx = in.next();


            switch (varEx) {
                case "a":
                    int arrayA[][] = new int[array.length][array[0].length];
                    for (int r = 0; r < array.length; r++) {
                        for (int s = 0; s < array[r].length; s++)
                            if (r == 0 && s == 0) {
                                arrayA[r][s] = array[array.length-1][0];
                            } else if (r == array.length-1 && s == 0) {
                                arrayA[r][s] = array[0][0];
                            } else {
                                arrayA[r][s] = array[r][s];
                            }
                        System.out.println(Arrays.toString(arrayA[r]));
                    }


                    break;
                case "b":
                    int arrayB[][] = new int[array.length][array[0].length];
                    for (int r = 0; r < array.length; r++) {
                        for (int s = 0; s < array[r].length; s++)
                            if (r == 0 && s == array[0].length-1) {
                                arrayB[r][s] = array[array.length-1][array[0].length-1];
                            } else if (r == array.length-1 && s == array[0].length-1) {
                                arrayB[r][s] = array[0][array[0].length-1];
                            } else {
                                arrayB[r][s] = array[r][s];
                            }
                        System.out.println(Arrays.toString(arrayB[r]));
                    }
                    break;

                case "0":
                    k = 0;
                    break;
            }
        }

    }
}

