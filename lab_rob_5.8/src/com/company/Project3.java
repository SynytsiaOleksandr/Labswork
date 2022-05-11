package com.company;

public class Project3 {

    public static void main(String[] args) {
        int floor = 4;
        String direction = "До верху";
        if (direction.equals("До низу")){
            if (floor == 2 || floor == 1) {

                System.out.println("Ви спустились на 1 поверх");

            }else{
                System.out.println("Ви спустились на " + floor + " поверх");

            }

        }else if (direction.equals("До верху")){
            if(floor == 2 || floor == 3 ){
                System.out.println("Ви піднялись на 3 поверх ");
            }else{
                System.out.println("Ви піднялись на " + floor + " поверх");
        }
        }



}
}
