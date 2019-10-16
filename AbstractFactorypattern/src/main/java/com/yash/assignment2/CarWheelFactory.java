package com.yash.assignment2;

public class CarWheelFactory implements WheelFactory {

	public Wheel makeWheel() {

        return new CarWheel();
    }

    public WheelFittingExpert makeFittingExpert() {

        return new CarExpert();
    }
}
