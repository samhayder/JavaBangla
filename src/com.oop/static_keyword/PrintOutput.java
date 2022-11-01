package com.oop.static_keyword;

public class PrintOutput {
    public static void main(String[] args) {

        StaticKeyword student1 = new StaticKeyword("Hala", 101);

        StaticKeyword student2 = new StaticKeyword("Jala", 202);

        //Print
        student1.printOutput();
        student2.printOutput();

        //Print Static
        System.out.println("Non Static: " + student1.countryStatic);
        System.out.println("Static: " + StaticKeyword.countryStatic);


        //**** Student list

        StaticKeyword studentList1 = new StaticKeyword();
        studentList1.printStudentList();

        StaticKeyword studentList2 = new StaticKeyword();
        studentList2.printStudentList();

        StaticKeyword studentList3 = new StaticKeyword();
        studentList3.printStudentList();

        //***** Static Method
        StaticKeyword staticMethod = new StaticKeyword();
        staticMethod.staticMethod1(); //Non-Static method

        StaticKeyword.staticMethod2(); //Static Method



    }
}
