public class Sales {
    private String salesId;
    private double amount;

    public Sales() {
        this.salesId = "";
        this.amount = 0.0;
    }

    public Sales(String salesId, double amount) {
        this.salesId = salesId;
        this.amount = amount;
    }

    public String getSalesId() {
        return salesId;
    }

    public void setSalesId(String salesId) {
        this.salesId = salesId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double determineDiscount() {
        if (amount >= 900) {
            return amount * 0.10;
        } else if (amount >= 500 && amount < 900) {
            return amount * 0.08;
        } else {
            return amount * 0.04;
        }
    }
}
