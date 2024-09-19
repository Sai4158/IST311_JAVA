public class Check extends Payment {
    private String name;
    private String bankID;


    public Check(double amount, Order order, String name, String bankID) {
        super(amount, order);
        this.name = name;
        this.bankID = bankID;
    }

    public boolean authorize() {
        return true;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBankID() {
        return bankID;
    }

    public void setBankID(String bankID) {
        this.bankID = bankID;
    }
}
