package di.lab.part3;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class Main3 {

    public static void main(String[] args) {
        try (WeldContainer container = new Weld().initialize()) {

            Car3 car = container.select(Car3.class).get();
            car.drive();

            Car3 anotherCar = container.select(Car3.class).get();
            anotherCar.drive();
        }
    }
}
