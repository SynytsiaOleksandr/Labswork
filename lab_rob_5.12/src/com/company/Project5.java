package com.company;

public class Project5 {

    public static void main(String[] args) {
        int count = 0;
        int massive[] = new int[15];
        for (int i = 0; i < 15; i++) {
            massive[i] = (int) Math.round(Math.random() * 9);
            System.out.print(massive[i] + " ");
            if (massive[i] % 2 == 0)
                count++;
        }
        System.out.println();
        System.out.println("Всього у масиві " + count + " парних чисел");
    }
}
