package OOP.O0PBasic;

public class VariableLength {

    void add(int ... num) {
        int sum = 0;
        for (int x : num) {
            sum = sum + x;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        VariableLength ob = new VariableLength();
        //Print
        ob.add(10,20);
        ob.add(10,20,30);
        ob.add(10,20,30,40);
        ob.add(10,20,30,40,50);
    }




}
