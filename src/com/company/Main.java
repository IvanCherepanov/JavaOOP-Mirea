package com.company;

public class Main {

    public static void main(String[] args) {

        Car bmw = new Car();
        bmw.doMove();
        bmw.name = "BMW";
        bmw.power = 200;
        bmw.setRuntime(5);
        bmw.getRuntime();

        Car opel = new Car();
        opel.doMove();

        ECar tesla = new ECar("Tesla",200,6,4,100);
        tesla.doMove();

        System.out.println(tesla);

    }

}
