public class ProductPart1 {
        private int ItemNumber;
        private String ProductName;
        private int StockUnit;
        private double UnitPrice;
      
        // Default Constructor
        public ProductPart1() {
            ItemNumber = 0;
            ProductName = null;
            StockUnit = 0;
            UnitPrice = 0.0;
        }
        
        // Overloaded Constructor
        public ProductPart1 (int ItemNumber, String ProductName, int StockUnit, double UnitPrice) {
            this.ItemNumber = ItemNumber;
            this.ProductName = ProductName;
            this.StockUnit = StockUnit;
            this.UnitPrice = UnitPrice;
        }
        
        // Getter Methods
        public int getItemNumber() {
            return ItemNumber;
        }
        
        public String getProductName() {
            return ProductName;
        }
        
        public int getStockUnit() {
            return StockUnit;
        }
        
        public double getUnitPrice() {
            return UnitPrice;
        }
        
        // Setter Methods
        public void setItemNumber(int ItemNumber) {
            this.ItemNumber = ItemNumber;
        }
        
        public void setProductName(String ProductName) {
            this.ProductName = ProductName;
        }
        
        public void setStockUnit(int StockUnit) {
            this.StockUnit = StockUnit;
        }
        
        public void setUnitPrice(double UnitPrice) {
            this.UnitPrice = UnitPrice;
        }
        
        // Override ToString Methods
        public String toString() {
            return "Product: " + ProductName + "\n Item Number: " + ItemNumber + "\n Unit Stock: " + StockUnit + "\n Price per Unit: " + UnitPrice;
        }
}