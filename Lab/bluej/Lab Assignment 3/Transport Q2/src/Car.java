// Class Car
public class Car extends Vehicle {
    private String carType;
    private double ccValue;

    public Car(int year, double price, String type, double cc) {
        super(year, price);
        this.carType = type;
        this.ccValue = cc;
    }

    @Override
    public void displayVehicle() {
        super.displayVehicle();
        System.out.println("Car Type: " + carType);
        System.out.println("CC Value: " + ccValue);
    }

    @Override
    public void howToTransport() {
        System.out.println("Transport on the road.");
    }
}
