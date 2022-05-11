package com.company;

public class Project4 {

    public static void main(String[] args) {
        int q = 1;
        int n = 10;
        int i = 1;

        while (i < n) {
            i++;
            q = q * i;
        }
        System.out.println(" while Факторіал числа 10: " + n + "! = " + q);
        int j = 1;
        int s = 1;
        for (; j <= n; j++) {
            s = s * j;
        }
        System.out.println(" for Факторіал числа 10: " + n + "! = " + s);
    }
}