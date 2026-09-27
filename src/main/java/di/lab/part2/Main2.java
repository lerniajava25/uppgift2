package di.lab.part2;

public class Main2 {

    public static void main(String[] args) {
        SimpleContainer container = new SimpleContainer();

        Driver driver = container.get(Driver.class);
        driver.drive();
    }
}
