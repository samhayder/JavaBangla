package OOP.PassReference;

public class TestReference {
    public static void main(String[] args) {
        CallByValue callByValue = new CallByValue();

        int x = 10;
        System.out.println("Before calling pass value: " + x);

        callByValue.change(x);
        System.out.println("After calling pass value: " + x);

        //Call by reference
        CallByReference r1 = new CallByReference();
        r1.name = "Samsuddin";
        System.out.println("Before calling reference value: " + r1.name);

        r1.change(r1);
        System.out.println("After calling reference value: " + r1.name);
        CallByReference r2 = new CallByReference();
    }
}
