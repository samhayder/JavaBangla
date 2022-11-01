package com.problem_solving.problem_solving1;

public class Box {
    /*
    01. Create a class called Box that include three pieces of information as
    02. instance variables-height, width and depth (type double) of two boxes.
    03. Your class should have a constructor and initialize the three instance variables.
    04. Provide a method displayVol that display the volume of two boxes.
    05. Suppose, the values of instance variables for the first box's are (10,10,10) and second box's are (20,30,10).
    06. Write a test application named boxVolume to demonstrate class Box's capabilities.
    */
    //Instance Variable => 02
    double height, width, depth;

    //Constructor => 03
    Box(double height, double width, double depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    //Method => 04
    void displayVol(){
        double vol = height * width * depth;
        System.out.println("Box's Capabilities is: " + vol);
    }


}
