package com.oop.this_keyword;

public class Print {
    public static void main(String[] args) {
        Person p1 = new Person("Man","Salman");
        Person p2 = new Person("Women","Jannat", 04);
        Person p3 = new Person("Men","Samsuddin","White",64,6,92);

        //Print
        p1.display();
        p2.display();
        p3.display();
    }
}
