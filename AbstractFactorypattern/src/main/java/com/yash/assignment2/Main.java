package com.yash.assignment2;

public class Main {

	public static void main(String[] args) {
		CarWheelFactory carWheelFactory = new CarWheelFactory();
		Wheel carWheel = carWheelFactory.makeWheel();
		WheelFittingExpert carExpert = carWheelFactory.makeFittingExpert();
		
		System.out.println(carWheel.getDescription()); 
        System.out.println(carExpert.getDescription());
        
        
        BikeWheelFactory bikeWheelFactory = new BikeWheelFactory();

        Wheel bikeWheel = bikeWheelFactory.makeWheel();
        WheelFittingExpert bikeExpert = bikeWheelFactory.makeFittingExpert();

		System.out.println(bikeWheel.getDescription()); 
        System.out.println(bikeExpert.getDescription());

	}

}
