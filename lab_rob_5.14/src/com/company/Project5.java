package com.company;

import java.util.Scanner;

public class Project5 {
    public static void main(String[] args) {
        String n, q;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть будь-який рядок: ");
        if(sc.hasNextLine()) {
            n = sc.nextLine();
            System.out.print("Введіть будь-який рядок: ");
            if(sc.hasNextLine()) {
                q = sc.nextLine();
                if(n.length() > q.length()){
                    System.out.println("Перший рядок більший ");
                } else if(n.length() < q.length()) {
                    System.out.println("Другий рядок більший");
                } else{
                    System.out.println("Рядки одинакові за кількістю символів");
                }
            }
        }
    }
}
