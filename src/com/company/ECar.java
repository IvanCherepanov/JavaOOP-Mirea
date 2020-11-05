package com.company;

public class ECar extends Car {

    private int BatteryCapacity;

    ECar() {

    }
    ECar(String name, int power, double runtime, int wheels, int b) {
        super(name, power, runtime, wheels);
        this.BatteryCapacity = b;
    }


    public void doFuel(int power) {
        System.out.println("Name: " + this.name + "Power:"+power);
    }



    // переопределение
    public void doMove() {
        //super.doMove();
        System.out.println("...");
    }

    @Override
    public String toString() {
        return "ECar{" +
                "BatteryCapacity=" + BatteryCapacity +
                ", name='" + name + '\'' +
                ", power=" + power +
                ", wheels=" + wheels +
                '}';
    }
}
