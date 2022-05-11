package com.company;

public class Project1 {

    public static void main(String[] args) {
        int massive[] = new int[50];
        for (int i = 1, q = 0; i <= 99; i = i + 2, q++){
            massive[q] = i;
        }
        System.out.println();
        for (int i = 0; i < massive.length; i++)
            System.out.print(massive[i] + "\n");
    }
}
