package com.oop.spper_keyword;

public class Bike extends Vehicle{
    //String type; String color; double weight; print()

    String bikeName;
    int bikeCC, gear;

    //Create Bike Constructor Method
    Bike(String type, String bikeName, String color, int bikeCC, int gear, double weight) {
        super(type,color,weight); //call the super class Constructor
        this.bikeName = bikeName;
        this.bikeCC = bikeCC;
        this.gear =gear;
    }

    //print the information method => Override
    @Override
    void print() {
        System.out.println("Vehicle Type: \t" + type);
        System.out.println("Bike Name: \t\t" + bikeName);
        System.out.println("Bike Color: \t" + color);
        System.out.println("Bike CC Limit: \t" + bikeCC);
        System.out.println("Bike Gear: \t\t" + gear);
        System.out.println("Bike Weight: \t" + weight+"kg");
        System.out.println();
    }


}
