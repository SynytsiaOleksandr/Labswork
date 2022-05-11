package com.company;

public class Project6 {

    public static void main(String[] args) {
        int[][] massive = new int[15][];
        massive [0] = new int [5];
        massive [1] = new int [5];
        massive [2] = new int [5];
        massive [3] = new int [5];
        massive [4] = new int [8];
        massive [5] = new int [8];
        massive [6] = new int [8];
        massive [7] = new int [8];
        massive [8] = new int [3];
        massive [9] = new int [3];
        massive [10] = new int [3];
        massive [11] = new int [3];
        massive [12] = new int [9];
        massive [13] = new int [9];
        massive [14] = new int [9];
        for(int i = 0; i < massive.length; i++){
            for(int q=0;q < massive[i].length;q++){
                massive[i][q]=(int)(Math.random()*15);
                System.out.print(massive[i][q] + " ");
            }
            System.out.println(" ");
        }
    }
}
