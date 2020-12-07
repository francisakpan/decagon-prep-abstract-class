package com.francis;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.getType());
        System.out.println(car.modelNumber());
        System.out.println();
        car.turnOnLight();

        System.out.println();
        car.turnOffLight();

        System.out.println();
        car.move();
        car.stop();

        System.out.println();
        car.drift();
        System.out.println();

        System.out.println(car.getBrightness());
        System.out.println();
        car.increaseBrightness();
        System.out.println(car.getBrightness());
        System.out.println();
        car.decreaseBrightness();
        System.out.println(car.getBrightness());

    }
}
