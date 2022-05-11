package com.company;

public class Project2 {

    public static void main(String[] args) {
        double ab = 3;
        double ac = 4;
        double bc;
        double pow = 2;
        bc = Math.sqrt(Math.pow(ab, pow)  +  Math.pow(ac, pow));
        double s = (ab * ac) / 2;
        double p = ab + ac + bc;
        System.out.println("Площа трикутника: " + s );
        System.out.println("Периметр трикутника: " + p);
    }
}
