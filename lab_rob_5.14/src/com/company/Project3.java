package com.company;

import java.util.Scanner;

public class Project3 {

    public static void main(String[] args) {
        double a, b, c, fraca, fracb, fracc, max;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть перше дробове число через кому: ");
        if (sc.hasNextDouble()) {
            a = sc.nextDouble();
            System.out.print("Введіть друге дробове число через кому: ");
            if (sc.hasNextDouble()) {
                b = sc.nextDouble();
                System.out.print("Введіть третє дробове число через кому: ");
                if (sc.hasNextDouble()) {
                    c = sc.nextDouble();
                    fraca = Math.abs (a);
                    fracb = Math.abs (b);
                    fracc = Math.abs (c);
                    if (fraca >= fracb && fraca >= fracc) {
                        max = a;
                    } else if (fracb >= fraca && fracb >= fracc) {
                        max = b;
                    } else {
                        max = c;
                    }
                    System.out.println(max);
                } else {
                    System.out.println("Ви ввели не дробове число");
                }
            } else {
                System.out.println("Ви ввели не дробове число");
            }
        } else {
            System.out.println("Ви ввели не дробове число");
        }
    }
}
