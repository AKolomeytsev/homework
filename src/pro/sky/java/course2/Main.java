package pro.sky.java.course2;

public class Main {
    public static void main(String[] args) {
        Transport car = new Car("car1",4);
        Transport car2 = new Car("car2",4);


        Truck truck = new Truck("truck1",6);
        Truck truck2 = new Truck("truck2",8);


        Transport bicycle = new Bicycle("bicycle1",2);
        Transport bicycle2 = new Bicycle("bicycle2",2);


        ServiceStation station = new ServiceStation();
        station.check((Car) car, null, null);
        station.check((Car) car2, null, null);
        station.check(null, (Bicycle) bicycle, null);
        station.check(null, (Bicycle) bicycle2, null);
        station.check(null, null, truck);
        station.check(null, null, truck2);
    }
}
