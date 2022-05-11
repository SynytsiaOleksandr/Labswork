package com.company;

import java.util.Scanner;

public class Project1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Введіть число: ");
     int n = sc.nextInt();
        if (50 <= n && n <= 100) {
            System.out.println("Число " + n + " міститься в проміжку (50:100)");


        } else {
            System.out.println("Число " + n + " не міститься в проміжку (50:100)");
        }
    }
}
