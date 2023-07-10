public class Main {
    public static void main(String[] args) {
        Car car = new Car(4, "Blue Car");
        Car car2 = new Car(4, "Red Car");

        Truck truck = new Truck(6, "Yellow Track");
        Truck truck2 = new Truck(8, "Optimus Prime");

        Bicycle bicycle = new Bicycle(2, "Boys Bicycle");
        Bicycle bicycle2 = new Bicycle(2, "Girls Bicycle");

        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(car2);
        station.check(bicycle);
        station.check(bicycle2);
        station.check(truck);
        station.check(truck2);
    }
}