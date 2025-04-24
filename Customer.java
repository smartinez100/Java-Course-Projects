public class Customer extends Person {
    private String customerNumber;
    private boolean receiveMail;

    public Customer(String name_, String address_, String number_, String customerNumber_, boolean receiveMail_) {
        super(name_, address_, number_);
        this.customerNumber = customerNumber_;
        this.receiveMail = receiveMail_;
    }

    public String getCustomerNumber() {
        return this.customerNumber;
    }

    public boolean getReceiveMail() {
        return this.receiveMail;
    }

    public void setCustomerNumber(String customerNumber_) {
        this.customerNumber = customerNumber_;
    }

    public void setReceiveMail(boolean receiveMail_) {
        this.receiveMail = receiveMail_;
    }

}
