package OOP.Inheritances;

public class Persons {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    //Print
    void printPerson() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
    }


}
