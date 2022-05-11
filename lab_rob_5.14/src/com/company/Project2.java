package com.company;

import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
        System.out.println("Введіть слово: ");
        String[] letters = new String[5];
        String[] words = new String [5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            String firstLetter = sc.nextLine();
            words[i]= firstLetter.substring(0, 1);
            letters[i] = firstLetter;
        }
        System.out.println();
        for (int n = 0; n < 5; n++) {
            System.out.println(letters[n]);
        }
        System.out.println();
        for (int j = 0; j < 5; j++) {
            System.out.println(words[j]);
        }
    }
}



