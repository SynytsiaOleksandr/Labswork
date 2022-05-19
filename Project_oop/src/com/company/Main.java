package com.company;

public class Main {

    public static void main(String[] args) {
        Cars fatherCar = new Cars("pink", "sedan", "ВO1042CА", 1.6, 10, 1 );
        Transport workCar = new Transport("yellow", "truck", "BK4245CM", 3.5, 20, 200, "Cargo");
        Human Vasyl = new Human("Vasyl","male", 100, 30, 200);

        System.out.println("Поточний рівень бензину = " + fatherCar.getFuelLeftOver());

Vasyl.workingDay(fatherCar);
        Vasyl.workingDay(fatherCar);
        Vasyl.getMyWork().makeMoney(fatherCar);
        workCar.carriage();
        workCar.drive(100);
    }
}
