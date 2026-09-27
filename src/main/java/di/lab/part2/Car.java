package di.lab.part2;

public class Car {

    private final Engine engine;
    private final Wheel wheel;

    public Car(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }

    public String describe() {
        return "Car with " + engine.describe() + " and " + wheel.describe();
    }
}
