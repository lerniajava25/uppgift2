package di.lab.part1;

public class SportsCar implements Car {

    private final Engine engine;

    public SportsCar(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void drive() {
        engine.start();
        System.out.println("Sports car speeding off");
    }
}
