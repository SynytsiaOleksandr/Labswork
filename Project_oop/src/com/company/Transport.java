package com.company;

public class Transport extends Cars {
    String typeSpecial;
    public Transport(String color, String form, String idCode, double engine, double fuelConsumption, double fuelLeftOver, String typeSpecial) {
        super(color, form, idCode, engine, fuelConsumption, fuelLeftOver);
        this.typeSpecial = typeSpecial;
    }
    void carriage(){
        if (typeSpecial.equalsIgnoreCase("Cargo")){
            System.out.println(freightTraffic());
        }else{
            System.out.println(passengerTraffic());
        }
    }
    private String freightTraffic(){
        return "Вантаж перевезено успішно ";
    }
    private String passengerTraffic(){
        return "Пасажирів перевезено успішно ";
    }
}
