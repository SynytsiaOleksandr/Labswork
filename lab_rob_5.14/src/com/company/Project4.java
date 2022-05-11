package com.company;

import java.util.Scanner;

public class Project4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть перше ім'я: ");
        String name1 = sc.nextLine();
        System.out.println("Введіть друге ім'я: ");
        if (name1.equalsIgnoreCase(sc.nextLine())){
            System.out.println("Імена є ідентичними");
        }else{
            System.out.println("Імена не є ідентичні");
        }
    }
}