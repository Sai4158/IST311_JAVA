public class Order {
    private String date;
    private String status;
    private Customer customer;
    private Payment[] payments;
    private OrderDetail[] orderDetails;

    public Order(String date, String status, Customer customer) {
        this.date = date;
        this.status = status;
        this.customer = customer;
    }

    public double calcTax() {
        return 0.0;
    }

    public double calcTotal() {
        return 0.0;
    }

    public double calcTotalWeight() {
        return 0.0;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
