public class Credit extends Payment {
    private String number;
    private String type;
    private String expirationDate;


    public Credit(double amount, Order order, String number, String type, String expirationDate) {
        super(amount, order);
        this.number = number;
        this.type = type;
        this.expirationDate = expirationDate;
    }

    public boolean authorize() {
        return true;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}
