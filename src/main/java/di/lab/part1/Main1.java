package di.lab.part1;

public class Main1 {

    public static void main(String[] args) {
        Engine gasEngine = new GasEngine();
        Car sportsCar = new SportsCar(gasEngine);
        sportsCar.drive();

        Engine electricEngine = new ElectricEngine();
        Car familyCar = new FamilyCar(electricEngine);
        familyCar.drive();
    }
}
