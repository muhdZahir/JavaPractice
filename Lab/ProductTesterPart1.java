// ProductTesterPart1.java
public class ProductTesterPart1 {
    public static void main(String[] args)
    {
        // Create ProductPart1 Object
        ProductPart1[] product = new ProductPart1[6];
        product[0] = new ProductPart1();
        product[1] = new ProductPart1();
        product[2] = new ProductPart1(1, "Pen", 50, 1.5);
        product[3] = new ProductPart1(2, "Book", 30, 3.5);
        product[4] = new ProductPart1(3, "Pencil", 40, 0.99);
        product[5] = new ProductPart1(4, "Eraser", 20, 0.5);
        
        // Display Product Information
        System.out.println(product[0].toString());
    }
}