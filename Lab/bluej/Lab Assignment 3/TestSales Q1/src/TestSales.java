public class TestSales {
    public static void main(String[] args) {
        // Create two Sales objects
        Sales s1 = new Sales("SALE6003", 800);
        Sales s2 = new Sales("SALE7003", 400);

        // Update the value of s2
        s2.setSalesId("SALE5003");
        s2.setAmount(500);

        // Call the displaySalesObject method
        displaySalesObject(s1, s2);

        // Create an array of Sales objects
        Sales[] salesArray = new Sales[4];

        // Add data to the array using user input
        salesArray[0] = new Sales("SALE8003", 1000);
        salesArray[1] = new Sales("SALE9003", 1200);
        salesArray[2] = new Sales("SALE1003", 800);
        salesArray[3] = new Sales("SALE2003", 250);

        // Call the displaySalesArray method
        displaySalesArray(salesArray);
    }

    public static void displaySalesObject(Sales s1, Sales s2) {
        System.out.println("Sales Object 1:");
        System.out.println("Sales ID: " + s1.getSalesId());
        System.out.println("Amount: RM " + s1.getAmount());
        System.out.println("Discount: RM " + s1.determineDiscount());
        System.out.println();

        System.out.println("Sales Object 2:");
        System.out.println("Sales ID: " + s2.getSalesId());
        System.out.println("Amount: RM " + s2.getAmount());
        System.out.println("Discount: RM " + s2.determineDiscount());
        System.out.println();
    }

    public static void displaySalesArray(Sales[] salesArray) {
        for (Sales sales : salesArray) {
            System.out.println("Sales ID: " + sales.getSalesId());
            System.out.println("Amount: RM " + sales.getAmount());
            System.out.println("Discount: RM " + sales.determineDiscount());
            System.out.println();
        }
    }
}
