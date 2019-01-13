package com.training.karol;

public class Cabrio {

    private String name;
    private String brand;
    private boolean isCarMoving;
    private boolean isRoofOpen;


    public Cabrio(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isCarMoving() {
        return isCarMoving;
    }

    public void setCarMoving(boolean carMoving) {
        isCarMoving = carMoving;
    }

    public boolean isRoofOpen() {
        return isRoofOpen;
    }

    public void setRoofOpen(boolean roofOpen) {
        if(isCarMoving==true){
            System.out.println("You cannot open or close the roof while car is moving");
        }
        else{
            isRoofOpen = roofOpen;
        }
    }
}
