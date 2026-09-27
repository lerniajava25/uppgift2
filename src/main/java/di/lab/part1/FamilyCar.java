package di.lab.part1;

public class FamilyCar implements Car {

    private final Engine engine;

    public FamilyCar(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void drive() {
        engine.start();
        System.out.println("Family car cruising along");
    }
}
