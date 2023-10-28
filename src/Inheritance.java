package src;

class Vehicle{

    String make="lastyear";
    String model="new";
    int year=2023;

    void displyinfo() {
        System.out.println("make: " +make);
        System.out.println("model:" +model);
        System.out.println("year:" +year);

    }
}
class car extends Vehicle{
    int numDoors;

    void startEengine() {
        System.out.println("numDoors:" +numDoors);

    }
}

class Motorcycle extends Vehicle{
    boolean isSportBike;

    void Wheelie() {
        System.out.println("isSpotrBike:" +isSportBike);

    }
}

public class Inheritance {
    public static void main(String[] args) {

        car r=new car();
        r.displyinfo();
        r.startEengine();

        Motorcycle te=new Motorcycle();
        te.displyinfo();
        te.Wheelie();

    }

}
