package com.company;

public class Task11_6 {
    public static void main(String[] args) {

        int[] array = new int[12];
        int j = 1;
        for (int i = 0; i < 12; i++) {
            array[i] = j;
            j++;
            System.out.print(array[i]+" ");
        }
    }
}
