package com.company;

public class Project5 {

    public static void main(String[] args) {
        int count = 0;
        for (int j = 0; j < 24; j++) {
            int unitsHour = j%10;
            int decadesHour = j/10;
            for (int i = 0; i < 60; i++) {
                int unitsMinute = i%10;
                int decadesMinute = i/10;
                if (unitsHour == decadesMinute && decadesHour == unitsMinute){
                    System.out.println(decadesHour + "" + unitsHour + ":" + decadesMinute + "" + unitsMinute);
                    count++;
                }
            }
        }
        System.out.println("Кількість співпадінь: " + count);
    }
}
