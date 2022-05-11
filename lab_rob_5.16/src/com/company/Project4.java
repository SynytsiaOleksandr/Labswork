package com.company;

import java.util.Scanner;

public class Project4 {

    public static void main(String[] args) {
        int tries = 2;
        int container = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть число від 1 до 3 ");
        for (int q = 0; q < 3; q++) {
            if (tries == 0){
                System.out.println("Ви програли, спроби закінчені");
                break;
            }
            int i = (int) ((Math.random() * 3)+1);
            if (tries < 2){
                i = container;
            }
            System.out.println(i);
            System.out.println("Введіть число " + (q+1) + ":");
            if (sc.hasNextInt()){
                if (i == sc.nextInt()){
                    System.out.println("Ви відгадали число правильно! ");
                }else {
                    System.out.println("Ви не відгадали число :( ");
                    q--;
                    container = i;
                    tries--;
                }
            }else {
                System.out.println("Ви ввели не число ");
                break;
            }
        }
    }
}
