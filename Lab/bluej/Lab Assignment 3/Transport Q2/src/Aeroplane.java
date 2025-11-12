// Class Aeroplane
public class Aeroplane extends Vehicle {
    private String modelNo;
    private int capacity;

    public Aeroplane(int year, double price, String model, int cap) {
        super(year, price);
        this.modelNo = model;
        this.capacity = cap;
    }

    @Override
    public void displayVehicle() {
        super.displayVehicle();
        System.out.println("Model No: " + modelNo);
        System.out.println("Capacity: " + capacity);
    }

    @Override
    public void howToTransport() {
        System.out.println("Transport on the air.");
    }
}
