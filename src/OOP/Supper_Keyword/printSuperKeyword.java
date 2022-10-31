package OOP.Supper_Keyword;

public class printSuperKeyword {
    public static void main(String[] args) {
        //Declare Bike class object
        Bike honda = new Bike("Bike","Honda","Red",150,6,350);
        Bike tvs = new Bike("Bike","TVS","Green",125,5,275);

        //Print Bike object
        honda.print();
        tvs.print();

        //Declare Bus class object
        Bus hanif = new Bus("Bus","Hanif Poribonon","Dhaka-Foridpur",40,1500,"White",1875);
        Bus nrTravels = new Bus("Bus","NR Travels", "Dhaka-Kolkata",42,1800,"Gray",1950);

        //Print Bus object
        hanif.print();
        nrTravels.print();
    }
}
