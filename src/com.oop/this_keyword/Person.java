package com.oop.this_keyword;

public class Person {
    String gender, name, heirColor;
    int age;
    double height, weight;

    Person(String gender, String name) {
        this.gender = gender;
        this.name = name;
    }

    Person(String gender, String name, int age) {
        this(gender,name); // use constructor for the this_keyword
        this.age = age;
    }

    Person(String gender, String name, String heirColor, int age, double height, double weight) {
        this(gender, name, age);
        this.heirColor = heirColor;
        this.height = height;
        this.weight =weight;
    }

    void message() {
        System.out.println("Thank you for everything...");
    }

    void display() {
        System.out.println("Gender: \t" + gender);
        System.out.println("Name: \t\t" + name);
        System.out.println("Heir Color: " + heirColor);
        System.out.println("Age: \t\t" + age);
        System.out.println("Height: \t" + height);
        System.out.println("Weight: \t" + weight);
        this.message(); // use this method
        System.out.println();
    }







}
