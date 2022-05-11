package com.company;

public class Project2 {

    public static void main(String[] args) {
        int result = 0;
        for (int a = 2; result < 5000; a++){
            result = 2 * a - 1;
            System.out.println("Усі значення з послідовності, які є менші 5000: " + result);
        }
    }
}
