package OOP.Encapsulations;

public class Persons {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age =  age;
    }

    //Return method => print
    public String getName() {
        System.out.println("Name is: " + name);
        return name;
    }

    public int getAge() {
        System.out.println("Age is: " + age);
        return age;
    }



}
