package OOP;

public class TeacherList {
    public static void main(String[] args) {

        //OOP Class Declare
        Teacher teacher1 = new Teacher("Samsuddin", "Bangla", "Male", 33, 1684711032);

        Teacher teacher2 = new Teacher("Salman", "Math", "Male", 28, 1732008560);

        Teacher teacher3 = new Teacher("Jannat", "English", "Female", 18, 167841100);


        //Print Teacher 1 Information
        teacher1.printTeacher();
        //Print Teacher 2 Information
        teacher2.printTeacher();
        //Print Teacher 3 Information
        teacher3.printTeacher();



    }
}
