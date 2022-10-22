package OOP;

public class StudentsList {
    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student("Bably",05,"Two");
        Student student3 = new Student("Sanjida", "Female", 10, "Four");
        Student student4 = new Student("Joy", "Male", 15, "Nine", 1684711032);

        //Print the students information
        student2.printStudent();
        student3.printStudent();
        student4.printStudent();
    }
}
