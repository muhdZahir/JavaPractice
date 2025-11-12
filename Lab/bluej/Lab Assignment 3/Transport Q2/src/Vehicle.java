// Abstract class Vehicle

public abstract class Vehicle {
    protected int manufacturedYear;
    protected double price;

    public Vehicle(int year, double RM) {
        this.manufacturedYear = year;
        this.price = RM;
    }

    public void displayVehicle() {
        System.out.println("Details:");
        System.out.println("Manufactured Year: " + manufacturedYear);
        System.out.println("Price RM: " + price);
        howToTransport();
    }

    public abstract void howToTransport();
}

