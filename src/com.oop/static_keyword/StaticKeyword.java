package com.oop.static_keyword;

public class StaticKeyword {
    String name;
    int id;
    static String universityName = "Kala"; //Static related class method,

    //Static use
    String country = "Bangladesh";
    static String countryStatic = "Bangladesh";

    //Constructor
    StaticKeyword(String name, int id){
        this.name = name;
        this.id = id;
    }

    //Print Method
    void printOutput(){
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Unirversity Name: " + universityName);
        System.out.println();
    }

    // ************* Student list updating *****************
    static int count = 0;

    StaticKeyword(){
        count++;
    }

    void printStudentList(){
        System.out.println("Student List: " + count);
    }

    // ***** Static Method *****
    void staticMethod1() {
        System.out.println("I'm not static method");
    }

    static void staticMethod2() {
        System.out.println("I'm static method");
    }


}
