package com.company;

public class Project3 {

    public static void main(String[] args) {
        int massive1[] = new int [5];
        int massive2[] = new int [5];
        int massive3[] = new int [5];
        double average1 = 0, average2 = 0, average3 = 0;
        for (int i = 0; i < 5; i++){
            massive1[i] = (int) Math.round(Math.random() * 5);
            average1 = average1 + massive1[i];
            System.out.print(massive1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            massive2[i] = (int) Math.round(Math.random() * 5);
            average2 = average2 + massive2[i];
            System.out.print(massive2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            massive3[i] = (int) Math.round(Math.random() * 5);
            average3 = average3 + massive3[i];
            System.out.print(massive3[i] + " ");
        }
        System.out.println();
        System.out.println(average1 = average1 / 5);
        System.out.println(average2 = average2 / 5);
        System.out.println(average3 = average3 / 5);

        if (average1 < average2)
            System.out.println("Середнє арифметичне значення 1 є меншим за середнє арифтметичне значення 2");
        else if (average1 > average2)
            System.out.println("Середнє арифметичне значення 1 є більшим за середнє арифтметичне значення 2");
        else if (average1 == average2)
            System.out.println("Середнє арифметичне значення 1 дорівнює середньому арифтметичному значенню 2");

        if (average1 < average3)
            System.out.println("Середнє арифметичне значення 1 є меншим за середнє арифтметичне значення 3");
        else if (average1 > average3)
            System.out.println("Середнє арифметичне значення 1 є більшим за середнє арифтметичне значення 3");
        else if (average1 == average3)
            System.out.println("Середнє арифметичне значення 1 дорівнює середньому арифтметичному значенню 3");

        if (average2 < average3)
            System.out.println("Середнє арифметичне значення 2 є меншим за середнє арифтметичне значення 3");
        else if (average2 > average3)
            System.out.println("Середнє арифметичне значення 2 є більшим за середнє арифтметичне значення 3");
        else if (average2 == average3)
            System.out.println("Середнє арифметичне значення 2 дорівнює середньому арифтметичному значенню 3");
    }
}
