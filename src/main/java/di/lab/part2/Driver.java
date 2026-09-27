package di.lab.part2;

public class Driver {

    private final Car car;

    public Driver(Car car) {
        this.car = car;
    }

    public void drive() {
        System.out.println("Driving a " + car.describe());
    }
}
