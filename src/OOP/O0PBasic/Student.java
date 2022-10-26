package OOP;

public class Student {

    String nameMain, genderMain, classMain;
    int rollMain, phoneMain;

    //Constructor
    Student(){
        System.out.println("No Information!");
        System.out.println();
    }

    Student(String name, int roll, String className) {
        nameMain = name;
        rollMain = roll;
        classMain = className;
    }

    Student(String name, String gender, int roll, String className) {
        nameMain = name;
        genderMain = gender;
        rollMain = roll;
        classMain = className;
    }

    Student(String name, String gender, int roll, String className, int phone) {
        nameMain = name;
        genderMain = gender;
        rollMain = roll;
        classMain = className;
        phoneMain = phone;
    }

    //Print Information
    void printStudent(){
        System.out.println("Name: " + nameMain);
        System.out.println("Gender: " + genderMain);
        System.out.println("Roll: " + rollMain);
        System.out.println("Class: " + classMain);
        System.out.println("Phone: 0" + phoneMain);
        System.out.println();
    }



}
