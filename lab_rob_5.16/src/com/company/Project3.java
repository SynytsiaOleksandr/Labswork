package com.company;

public class Project3 {

    public static void main(String[] args) {
        int i = (int) (Math.random() * 101);
        System.out.println(i);
        if (i == 100){
            System.out.println("Число є трицифровим");
        } else if (i/10 > 0){
            System.out.println("Число є двоцифровим");
        } else{
            System.out.println("Число є одноцифровим");
        }
    }
}
