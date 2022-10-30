package OOP.Inheritances;

import java.util.Scanner;

public class TestInheritance {
    public static void main(String[] args) {
        Teachers t1 = new Teachers();

        t1.setName("Salman Yasin");
        t1.setAge(18);
        t1.setQualification("BSC in computer");

        t1.display();

        // ****** instanceof Operator *********
        //Persons --> <-- Teachers --> Students
        Persons person = new Persons();
        Teachers teacher = new Teachers();
        Students student = new Students();

        System.out.println(teacher instanceof Persons);
        System.out.println(student instanceof Teachers);
        System.out.println(student instanceof Persons);
        System.out.println(teacher instanceof Students);



    }
}
