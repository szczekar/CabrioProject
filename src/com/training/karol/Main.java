package com.training.karol;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Cabrio car = new Cabrio("Audi","A4");
        System.out.println("Car status: " + "Name = "+ car.getName() + " Brand = " + car.getBrand() +  " Roof status = " + car.isRoofOpen() + " Move status = "+ car.isCarMoving());

        System.out.println("Open the roof:");
        car.setRoofOpen(true);
        System.out.println("Car status: " + "Name = "+ car.getName() + " Brand = " + car.getBrand() +  " Roof status = " + car.isRoofOpen() + " Move status = "+ car.isCarMoving());

        System.out.println("Move the car:");
        car.setCarMoving(true);
        System.out.println("Car status: " + "Name = "+ car.getName() + " Brand = " + car.getBrand() +  " Roof status = " + car.isRoofOpen() + " Move status = "+ car.isCarMoving());

        System.out.println("Close the roof:");
        car.setRoofOpen(false);
        System.out.println("Car status: " + "Name = "+ car.getName() + " Brand = " + car.getBrand() +  " Roof status = " + car.isRoofOpen() + " Move status = "+ car.isCarMoving());

        System.out.println("Stop the car:");
        car.setCarMoving(false);
        System.out.println("Car status: " + "Name = "+ car.getName() + " Brand = " + car.getBrand() +  " Roof status = " + car.isRoofOpen() + " Move status = "+ car.isCarMoving());

        System.out.println("Close the roof:");
        car.setRoofOpen(false);
        System.out.println("Car status: " + "Name = "+ car.getName() + " Brand = " + car.getBrand() +  " Roof status = " + car.isRoofOpen() + " Move status = "+ car.isCarMoving());

        System.out.println("Run the car:");
        car.setCarMoving(true);
        System.out.println("Car status: " + "Name = "+ car.getName() + " Brand = " + car.getBrand() +  " Roof status = " + car.isRoofOpen() + " Move status = "+ car.isCarMoving());

        System.out.println("Open the roof:");
        car.setRoofOpen(true);
        System.out.println("Car status: " + "Name = "+ car.getName() + " Brand = " + car.getBrand() +  " Roof status = " + car.isRoofOpen() + " Move status = "+ car.isCarMoving());

    }
}
