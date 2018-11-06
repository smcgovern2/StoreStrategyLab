package solid.example;

public class Customer {

    private String customerName;
    private double billAmount;
    private Discount discount;

    public Customer(String customerName, double billAmount, Discount discount) {
        this.customerName = customerName;
        this.billAmount = billAmount;
        this.discount = discount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBillAmount() {
        double tempBill;
        tempBill = this.billAmount -( this.billAmount * this.discount.getDiscount());
        return tempBill;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", billAmount=" + billAmount +
                ", discountType=" + discount.getClass() +
                '}';
    }
}
