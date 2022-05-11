package com.company;

import java.util.Scanner;

public class Project2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть число від 100 до 999: ");
        int n = sc.nextInt();
        if (n >= 100 && n <= 999){ //769
            int units, tens, hundreds, maxNumber;
            hundreds = n / 100;
            tens = (n - hundreds * 100)  / 10;
            units = ((n - hundreds * 100)- tens * 10);
            maxNumber = Math.max(Math.max(tens, units), hundreds);
            System.out.println("Найбільше число: " + maxNumber);

        }else {
            System.out.println("Число не відповідає заданому діапазону");


        }


    }
}
