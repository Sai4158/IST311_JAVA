public class Item {
    private String description;
    private double shippingWeight;

    public Item(String description, double shippingWeight) {
        this.description = description;
        this.shippingWeight = shippingWeight;
    }

    public double getPriceForQuantity(int quantity) {
        return 0.0;
    }

    public double getWeight() {
        return this.shippingWeight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getShippingWeight() {
        return shippingWeight;
    }

    public void setShippingWeight(double shippingWeight) {
        this.shippingWeight = shippingWeight;
    }
}
