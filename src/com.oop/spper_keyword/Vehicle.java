package com.oop.spper_keyword;

public class Vehicle {
    String type;
    String color;
    double weight;

    //Create Constructor Method
    Vehicle(String type, String color, double weight) {
        this.type = type;
        this.color = color;
        this.weight = weight;
    }

    //Print the information Method
    void print(){
        System.out.printf("Vehicle Type: " + type);
        System.out.println("Vehicle Color: " + color);
        System.out.println("Vehicle Weight: " + weight+"kg");
        System.out.println();
    }
}
