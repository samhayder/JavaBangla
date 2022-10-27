package OOP.Inheritances;

public class Teachers extends Persons{
    //name,age,printPerson()

    private String qualification;
    //set & get qualification
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    public String getQualification() {
        return qualification;
    }

    //print Teacher
    void printTeacher() {
        printPerson();
        System.out.println("Qualifications: " + getQualification());
        System.out.println();
    }


}
