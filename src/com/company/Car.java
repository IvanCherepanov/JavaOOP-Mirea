package com.company;

public class Car {

    // модификаторы доступа

    String name; // тип доступа по-умолчанию - доступно в рамках пакет
    public int power;  // доступно из любого пакета
    private double runtime; // доступно внутри класса
    protected int wheels; // внутри класса и в наследниках

    Car() {

    }
    Car(String name, int power, double runtime, int wheels) {
        this.name = name;
        this.power = power;
        this.runtime = runtime;
        this.wheels = wheels;
    }

    public double getRuntime() {
        return runtime;
    }

    public void setRuntime(double runtime) {
        this.runtime = runtime;
    }

    public void doMove() {
        System.out.println("Moving...");
    }

    public void doFuel() {
        System.out.print("Fuel");
    }

}
