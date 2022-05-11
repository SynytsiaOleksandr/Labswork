package com.company;

public class Project2 {

    public static void main(String[] args) {
        int[] massive = new int[20];
        for (int i = 0; i < 20; i++) {
            massive[i] = (int) Math.round(Math.random() * 9);
            System.out.print(massive[i] + " ");
            if (i % 2 == 1)
                massive[i] = 0;
        }
        System.out.println();
        for (int j = 0; j < massive.length; j++) {
            System.out.print(massive[j] + " ");
        }
    }
}
