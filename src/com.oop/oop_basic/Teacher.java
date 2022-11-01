package com.oop.oop_basic;

public class Teacher {

    //Variable
    String nameMain,departmentMain, genderMain;
    int ageMain, phoneMain;

    //Method
    /*//Parametrized Method
    void setTeacher(String name, String department, String gender, int age, int phone) {
        nameMain = name;
        departmentMain = department;
        genderMain = gender;
        ageMain = age;
        phoneMain = phone;
    }*/

    //Constructor
    Teacher(String name, String department, String gender, int age, int phone) {
        nameMain = name;
        departmentMain = department;
        genderMain = gender;
        ageMain = age;
        phoneMain = phone;
    }

    //Print
    void printTeacher () {
        System.out.println("Name: " + nameMain);
        System.out.println("Department: " + departmentMain);
        System.out.println("Gender: " + genderMain);
        System.out.println("Age: " + ageMain);
        System.out.println("Phone: +880 " + phoneMain);
        System.out.println();
    }



}
