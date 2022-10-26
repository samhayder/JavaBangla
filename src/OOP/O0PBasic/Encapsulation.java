package OOP.O0PBasic;

public class Encapsulation {
    private String name;
    private int age;

    void talk() {
        System.out.println("Hello");
    }

    //Set name
    public String setName(String name) {
       return this.name = name;
    }
    //get name
    void getName() {
        System.out.println(this.name);
    }











}
