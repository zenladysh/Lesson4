package com.company;

public class Task11_34 {
    public static void main(String[] args) {
        double[] countRain = new double[30];
        for (int i = 0; i < 30; i++) {
            countRain[i] = Math.random() * 3; //количество осадков в день

        }
        double sum1 = 0;
        double sum2 = 0;
        for (int j = 0; j < 30; j++) {
            if (j <= 13) {
                sum1 += countRain[j];

            } else {
                sum2 += countRain[j];

            }

        }
        if (sum1>sum2){
            System.out.println("В первую половину Июня выпало больше осадков");
        } else {
            System.out.println("Во вторую половину Июня выпало больше осадков");
        }

    }
}
