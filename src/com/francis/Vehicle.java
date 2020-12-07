package com.francis;

abstract class Vehicle {

    abstract int move();

    abstract int stop();

    abstract String getType();

    abstract String modelNumber();

    void drift(){
        System.out.println("Vehicle is drifting...");
    }
}