package com.company;

public class Human {
        private String name, sex;
        private double money;
        private Work myWork;
        private int countIssue = 0;

        public Human(String name, String sex, double money) {
                this.name = name;
                this.sex = sex;
                this.money = money;
        }
        public Human(String name, String sex, double money, int distanceToWork, int salary) {
                this.name = name;
                this.sex = sex;
                this.money = money;
                myWork = new Work(distanceToWork, salary);
        }

        void fillTank (Cars vehicle, int gasVolume){
                if (money >= gasVolume*vehicle.getGasValue()){
                        money -= gasVolume*vehicle.getGasValue();
                        vehicle.setFuelLeftOver(vehicle.getFuelLeftOver() + gasVolume);
                        System.out.println("Ваше авто заправлено на " + gasVolume + " літрів, кількість бензину у баці " + vehicle.getFuelLeftOver() + " з вас " + gasVolume*vehicle.getGasValue());
                }else{
                        System.out.println("Коштів для покупки не достатньо ");
                }
        }

        public class Work {
                int distanceToWork;
                int salaryPerDay;

                public Work(int distanceWork, int salary) {
                        this.distanceToWork = distanceWork;
                        this.salaryPerDay = salary;
                }

                void issue (Cars myVehicle){
                        if (myVehicle.getDistanceTravelled() / 100 > countIssue) {
                                countIssue++;
                                int fixPrice = (int) (Math.random() * 200);
                                money -= fixPrice;
                                System.out.println("Автомобіль зламався, полагодження коштує " + fixPrice);
                                System.out.println("Залишок на балансі " + money);
                        }
                }

                void makeMoney(Cars myVehicle){
                        double spend, earn;
                        if (myVehicle.getFuelLeftOver() > ((myVehicle.getFuelConsumption()/100)* distanceToWork)){

                                myVehicle.setFuelLeftOver(myVehicle.getFuelLeftOver() - ((myVehicle.getFuelConsumption() / 100) * distanceToWork * 2));
                                spend = (myVehicle.getFuelConsumption() / 100) * distanceToWork * 2;
                                earn = salaryPerDay;
                                money += earn;
                                System.out.println("Витрачено бензину за один день " + spend + "\nКількість бензину у баці " + myVehicle.getFuelLeftOver());
                                System.out.println("Зароблено за один день " + earn + "\nЗагальний баланс складає " + money);
                                myVehicle.setDistanceTravelled(myVehicle.getDistanceTravelled() + distanceToWork * 2);
                                issue(myVehicle);
                        }else{
                                System.out.println("Бензину не вистачає, потрібно їхати до заправки");
                                int minGasVolume = (int) Math.round(((myVehicle.getFuelConsumption() / 100) * distanceToWork * 2) - myVehicle.getFuelLeftOver());
                                fillTank(myVehicle, minGasVolume);
                                makeMoney(myVehicle);
                        }
               }
        }

        void workingDay(Cars myAuto){
                myWork.makeMoney(myAuto);
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getSex() {
                return sex;
        }

        public void setSex(String sex) {
                this.sex = sex;
        }

        public double getMoney() {
                return money;
        }

        public void setMoney(double money) {
                this.money = money;
        }

        public Work getMyWork() {
                return myWork;
        }

        public void setMyWork(Work myWork) {
                this.myWork = myWork;
        }
}


