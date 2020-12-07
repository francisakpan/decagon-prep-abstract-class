package com.francis;

import java.util.Date;

class Car extends Vehicle implements Light{

    static int modelBaseNumber = 0;
    public int distance = 0;
    private int brightness = 0;

    @Override
    int move() {
        System.out.println("Car is moving at: " + ++distance);
        return distance;
    }

    @Override
    int stop() {
        System.out.println("Car is stopping...");
        return 0;
    }

    @Override
    String getType() {
        return "Vehicle type is: " + this.getClass().getSimpleName();
    }

    @Override
    String modelNumber() {
        return "Model number: Car" + ++modelBaseNumber;
    }

    @Override
    public void turnOnLight() {
        System.out.println("Car light is turned on");
    }

    @Override
    public void turnOffLight() {
        System.out.println("Car light is turned off");
    }

    @Override
    public String getBrightness() {
        return "Brightness is: " +brightness;
    }

    @Override
    public void increaseBrightness() {
        System.out.println("Increasing brightness...");
        brightness += 1;
    }

    @Override
    public void decreaseBrightness() {
        System.out.println("Decreasing brightness...");
        brightness -= 1;
    }
}