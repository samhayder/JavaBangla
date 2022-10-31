package OOP.Supper_Keyword;

public class Bus extends Vehicle {
    //String type; String color; double weight; print()
    String level,root;
    int seat, busCC;

    Bus(String type, String level, String root, int seat, int busCC, String color, double weight) {
        super(type, color, weight);
        this.level = level;
        this.root = root;
        this.seat = seat;
        this.busCC = busCC;
    }

    //print
    @Override
    void print(){
        System.out.println("Vehicle Type: \t" + type);
        System.out.println("Bus Level: \t\t" + level);
        System.out.println("Bus Root: \t\t" + root);
        System.out.println("Bus Seat: \t\t" + seat);
        System.out.println("Bus CC Limit: \t" + busCC);
        System.out.println("Bus Color: \t\t" + color);
        System.out.println("Bus Weight: \t" + weight+"kg");
        System.out.println();
    }

}
