package di.lab.part3;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class SportsCar3 implements Car3 {

    private final Engine3 engine;

    @Inject
    public SportsCar3(Engine3 engine) {
        this.engine = engine;
    }

    @Override
    public void drive() {
        engine.start();
        System.out.println("Sports car speeding off");
    }
}
