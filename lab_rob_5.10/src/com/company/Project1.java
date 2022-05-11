package com.company;

public class Project1 {

    public static void main(String[] args) {

        for (int i = 500; i <= 650; i += 10) {
            System.out.println(" for Усі значення у діапазоні (500:650) з кроком 10: " + i);
        }
        System.out.println();
        int q = 500;
        while (q <= 650) {
        System.out.println(" while Усі значення у діапазоні (500:650) з кроком 10: " + q);
        q += 10;
        }
        System.out.println();
        int g = 500;
        do {
            System.out.println(" do while Усі значення у діапазоні (500:650) з кроком 10: " + g);
            g += 10;
        }while(g <= 650);
    }
  }


