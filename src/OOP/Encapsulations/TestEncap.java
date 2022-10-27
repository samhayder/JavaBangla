package OOP.Encapsulations;

public class TestEncap {
    public static void main(String[] args) {
        Persons person1 = new Persons();

        person1.setName("Samsuddin Hayder");
        person1.setAge(33);

        //Print
        person1.getName();
        person1.getAge();
    }
}
