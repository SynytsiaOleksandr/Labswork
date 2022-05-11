package com.company;

import java.util.Scanner;

public class Project1 {

    public static void main(String[] args) {
        System.out.println("Введіть будь-які 5 слів: ");
        String sentence = "";
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            String temporary = sc.nextLine();
            sentence = sentence.concat(temporary + " ");
        }
        System.out.println(sentence);
    }
}
