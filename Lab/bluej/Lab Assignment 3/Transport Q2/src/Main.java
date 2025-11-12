public class Main {
    public static void main(String[] args) {
        Car car = new Car(2020, 30000, "Sedan", 1600);
        Aeroplane aeroplane = new Aeroplane(2018, 100000, "Boeing 747", 500);

        System.out.println("Car Details:");
        car.displayVehicle();
        System.out.println();

        System.out.println("Aeroplane Details:");
        aeroplane.displayVehicle();
        System.out.println();
    }
}
