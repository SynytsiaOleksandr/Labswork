package com.company;

public class Project4 {

    public static void main(String[] args) {
        int[][] massives = new int[3][10];
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < massives[i].length; j++) {
                massives[i][j] = (int) (Math.random() * 10);
                massives[2][j] = massives[0][j] + massives[1][j];
            }
        }
        for (int a = 0; a < massives.length; a++) {
            for (int q = 0; q < massives[a].length; q++) {
                System.out.print(massives[a][q] + " ");
            }
            System.out.println();
        }
    }
}
