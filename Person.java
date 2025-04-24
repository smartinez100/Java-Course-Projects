public class Person {
    private String name;
    private String address;
    private String number;

    public Person(String name_, String address_, String number_) {
        this.name = name_;
        this.address = address_;
        this.number = number_;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getNumber() {
        return this.number;
    }

    public void setName(String name_) {
        this.name = name_;
    }

    public void setAddress(String address_) {
        this.address = address_;
    }

    public void setNumber(String number_) {
        this.number = number_;
    }

}